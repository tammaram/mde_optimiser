package uk.ac.kcl.optimisation.moea

import java.util.LinkedHashMap
import java.util.List
import java.util.Map
import org.moeaframework.core.Solution
import org.moeaframework.problem.AbstractProblem
import uk.ac.kcl.interpreter.IGuidanceFunction
import uk.ac.kcl.interpreter.guidance.GuidanceFunctionAdapter
import uk.ac.kcl.interpreter.guidance.GuidanceFunctionsFactory
import uk.ac.kcl.optimisation.SolutionGenerator

class MoeaOptimisationProblem extends AbstractProblem {

	private SolutionGenerator solutionGenerator

	private List<IGuidanceFunction> fitnessFunctions;
	private List<IGuidanceFunction> constraintFunctions;
	private Map<Integer, String> counter = new LinkedHashMap<Integer, String>();

	new(int numberOfVariables, int numberOfObjectives, int numberOfConstraints) {
		super(numberOfVariables, numberOfObjectives, numberOfConstraints)
	}

	new(SolutionGenerator solutionGenerator) {
		// Number of variables is for now always one.
		this(1, solutionGenerator.optimisationModel.objectives.size(),
			solutionGenerator.optimisationModel.constraints.size())
		this.solutionGenerator = solutionGenerator
	}

	def SolutionGenerator getSolutionGenerator() {
		this.solutionGenerator
	}

	def getConstraintFunctions() {
		if (this.constraintFunctions == null) {
			setConstraintFunctions()
		}

		this.constraintFunctions
	}

	def setConstraintFunctions() {
		if (constraintFunctions == null) {
			this.constraintFunctions = solutionGenerator.optimisationModel.constraints.map [ constraint |
				new GuidanceFunctionsFactory().loadFunction(new GuidanceFunctionAdapter(constraint))
			]
		}
	}

	def getFitnessFunctions() {
		if (this.fitnessFunctions == null) {
			setFitnessFunctions()
		}

		this.fitnessFunctions
	}

	def void setFitnessFunctions() {
		if (fitnessFunctions == null) {
			this.fitnessFunctions = solutionGenerator.optimisationModel.objectives.map [ objective |
				new GuidanceFunctionsFactory().loadFunction(new GuidanceFunctionAdapter(objective))
			]
		}
	}

	override evaluate(Solution solution) {

		// TODO if some constraints are the same as the objectives, they should be cached for the same model
		val moeaSolution = solution as MoeaOptimisationSolution;

		// Set objectives
		getFitnessFunctions.forEach [ fitnessFunction, objectiveId |
			moeaSolution.setObjective(objectiveId, fitnessFunction.computeFitness(moeaSolution.model))
		]

		// Set Constraints
		getConstraintFunctions.forEach [ constraintFunction, objectiveId |
			moeaSolution.setConstraint(objectiveId, constraintFunction.computeFitness(moeaSolution.model))
		]
		
		// TODO (tamara): MoeaOptimisationSolution as a value in the hashmap
		// TODO (tamara): Possibly create a separate class containing the calculations below.
		counter.put(counter.size +1, String.format("%05X", moeaSolution.model.hashCode));
		if(counter.size % solutionGenerator.optimisationModel.optimisation.algorithmPopulation == 0)
			println(String.format("Finished run %s." ,counter.size/solutionGenerator.optimisationModel.optimisation.algorithmPopulation))
		println(String.format("Found %s solutions. Evaluating solution %s." ,counter.size,counter.get(counter.size)));
	}

	override newSolution() {
		new MoeaOptimisationSolution(solutionGenerator)
	}

}
