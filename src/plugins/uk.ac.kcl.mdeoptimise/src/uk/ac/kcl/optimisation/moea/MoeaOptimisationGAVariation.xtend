package uk.ac.kcl.optimisation.moea

import org.moeaframework.core.Solution
import org.moeaframework.core.Variation
import uk.ac.kcl.optimisation.SolutionGenerator
import org.eclipse.emf.ecore.EObject
import java.util.ArrayList

class MoeaOptimisationGAVariation implements Variation {
	
	private SolutionGenerator solutionGenerator;
	
	new(SolutionGenerator solutionGenerator){
		this.solutionGenerator = solutionGenerator;
	}
	
	//USed to evolve a solution using the henshin evolvers
	override evolve(Solution[] parents) {
	
//		val solutions = new ArrayList<MoeaOptimisationSolution>();	
//		val parentModels = new ArrayList<EObject>();
//		
//		for(Solution parent : parents){
//			val solution = (parent as MoeaOptimisationSolution).copy 
//			solutions.add(solution)
//			parentModels.add(solution.model)
//		}
//		
//		val children = solutionGenerator.crossover(parentModels)
//	
//		for(var i = 0; i < children.size; i++){
//			solutions.get(i).model = children.get(i);
//		}
		
		val solutions = new ArrayList<Solution>();	
		val parentModels = new ArrayList<EObject>();
		
		for(Solution parent : parents){
			val solution = (parent as Solution).copy 
			solutions.add(solution)
			parentModels.add((solution.getVariable(0) as MoeaOptimisationVariable).model)
		}
		
		val children = solutionGenerator.crossover(parentModels)
	
		for(var i = 0; i < children.size; i++){
			solutions.get(i).setVariable(0, new MoeaOptimisationVariable(children.get(i), solutionGenerator))
		}

		#[solutions.get(0), solutions.get(1)]
	}
	
	/**
	 * The number of solutions to be supplied to the evolve method.
	 * For the crossover operator we require a number of two parents.
	 */
	override getArity() {
		return 2;
	}
	
}