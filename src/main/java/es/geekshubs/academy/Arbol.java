package es.geekshubs.academy;

import java.util.Collections;

public class Arbol {

	/**
	 * Apply Method
	 * 
	 * @param input
	 * @return
	 */
	public String apply(final Integer input) {
		String output = "";
		
		for(int y=1; y<=input.intValue(); y++) {
			for(int x=1; x<=input.intValue(); x++) {
				if(x<y)
					output += " ";
				else
					output += "*";
			}
			output += "\n";
		}
		
		return output;
	}

}
