/*
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.ui.quickfix

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import uk.ac.kcl.validation.MDEOptimiseValidatorIssues
import org.eclipse.xtext.validation.Issue
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.emf.ecore.EObject
import javax.inject.Inject
import org.eclipse.xtext.common.types.access.jdt.IJavaProjectProvider
import uk.ac.kcl.ui.classpath.MDEOClassPathContainerInitializer

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class MDEOptimiseQuickfixProvider extends DefaultQuickfixProvider {

	@Inject
	private IJavaProjectProvider projectProvider;
	
	@Fix(MDEOptimiseValidatorIssues.MDEO_LIB_NOT_ON_CLASSPATH)
	def putMDEOOnClasspath(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add MDEOptimiser libs to classpath", "Add MDEOptimiser libs to classpath", "", new ISemanticModification() {
			override apply(EObject element, IModificationContext context) throws Exception {
				val resourceSet = element.eResource().getResourceSet();
				val javaProject = projectProvider.getJavaProject(resourceSet);
				val containerInitializer = new MDEOClassPathContainerInitializer()
				containerInitializer.initialize(javaProject.path, javaProject)
			}
		});
	}
	
}