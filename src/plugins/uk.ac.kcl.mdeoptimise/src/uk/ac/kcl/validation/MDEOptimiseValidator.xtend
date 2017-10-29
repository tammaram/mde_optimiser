/*
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.validation

import org.eclipse.xtext.validation.Check
import uk.ac.kcl.mdeoptimise.MdeoptimisePackage
import uk.ac.kcl.mdeoptimise.Optimisation

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class MDEOptimiseValidator extends AbstractMDEOptimiseValidator {
	
	public static val INVALID_VARIATION = 'invalidVariation'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					MDEOptimisePackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
	
	@Check
	def checkMutationTypeConfigurationIsValid(Optimisation optimisationModel){
		
//		val optimisationType = optimisationModel.optimisation.algorithmVariation
//		
//		if(optimisationType.equals("mutation") 
//			&& optimisationModel.evolvers.filter[ e | e.evolverType.equals("mutate")].empty
//		){
//			warning('Variation type mutation requires at least one evolver of type mutate', 
//				MdeoptimisePackage.Literals::OPTIMISATION_SPEC__ALGORITHM_VARIATION)
//		}
//
//		if(optimisationType.equals("genetic") 
//			&& (optimisationModel.evolvers.filter[ e | e.evolverType.equals("mutate")].empty
//				|| optimisationModel.evolvers.filter[ e | e.evolverType.equals("breed")].empty
//			)
//		){
//			warning('Variation type genetic requires at least one evolver of type mutate and one of type breed', 
//				MdeoptimisePackage.Literals::OPTIMISATION_SPEC__ALGORITHM_VARIATION)
//		}
		
	}
}