/*
 * generated by Xtext 2.10.0
 */
package uk.ac.kcl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MDEOptimiseAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/parser/antlr/internal/InternalMDEOptimise.tokens");
	}
}
