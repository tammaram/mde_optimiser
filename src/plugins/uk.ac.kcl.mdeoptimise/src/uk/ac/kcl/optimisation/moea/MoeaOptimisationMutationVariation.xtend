package uk.ac.kcl.optimisation.moea

import org.moeaframework.core.Solution
import org.moeaframework.core.Variation
import uk.ac.kcl.optimisation.SolutionGenerator

class MoeaOptimisationMutationVariation implements Variation {
	
	private SolutionGenerator solutionGenerator;
	
	new(SolutionGenerator solutionGenerator){
		this.solutionGenerator = solutionGenerator;
	}
	
	//USed to evolve a solution using the henshin evolvers
	override evolve(Solution[] parents) {

		var parentSolution = parents.head as Solution;
		var newSolution = parentSolution.copy
			
		var variable = (parentSolution.getVariable(0) as MoeaOptimisationVariable).copy
		variable.randomize
		newSolution.setVariable(0, variable)
		
		//System.out.println("Evolved solution " + newSolution.evolutionsCounter)
		#[newSolution]

	}
	
	override getArity() {
		return 1;
	}
	
}