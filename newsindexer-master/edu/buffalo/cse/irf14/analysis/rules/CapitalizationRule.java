/**
 * AUTHOR : Ankit Sarraf
 * DATED  : February 25, 2015
 * ABOUT  : Capitalization Rule
 */

package edu.buffalo.cse.irf14.analysis.rules;

import edu.buffalo.cse.irf14.analysis.TokenFilter;
import edu.buffalo.cse.irf14.analysis.TokenStream;
import edu.buffalo.cse.irf14.analysis.TokenizerException;

public class CapitalizationRule extends TokenFilter {
	public CapitalizationRule(TokenStream tokenStream) {
		super(tokenStream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean increment() throws TokenizerException {
		
		return false;
	}

	@Override
	public TokenStream getStream() {
		return tokenStream;
	}
}