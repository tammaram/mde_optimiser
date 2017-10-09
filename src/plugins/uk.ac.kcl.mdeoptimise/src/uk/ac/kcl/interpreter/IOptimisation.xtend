package uk.ac.kcl.interpreter

import org.eclipse.emf.ecore.EObject
import uk.ac.kcl.mdeoptimise.OptimisationSpec
import uk.ac.kcl.optimisation.SolutionGenerator
import java.util.Iterator
import uk.ac.kcl.optimisation.moea.MoeaOptimisationSolution
import org.moeaframework.core.Solution

interface IOptimisation {
	
	/**
	 * Returns an optimisation outcome as a set of objects.
	 * Maybe this should also include population information, such as objective values.
	 * TODO Look at MOEA Instrumentation?
	 */
	def Iterator<Solution> execute(OptimisationSpec optimisationSpec, SolutionGenerator solutionGenerator)
	
}
