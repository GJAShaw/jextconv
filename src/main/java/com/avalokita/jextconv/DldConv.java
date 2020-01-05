/*
 * 
 */
package com.avalokita.jextconv;

/**
 * @author greg
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DldConv {
	
	private static final Logger LOG = LogManager.getLogger(DldConv.class);

	/**
	 * @param args one filename
	 */
	public static void main(String[] args) {
		
		if (args.length != 1) {
			LOG.error("Usage: DldConv fileName");
			throw new IllegalArgumentException("Incorrect command line argument(s)");
		}
		
		try ( BufferedReader in = new BufferedReader(new FileReader(args[0])); ) {
		
			String line = null;
			do {
				line = in.readLine();
				if (line != null)
					// TODO convert line contents to xml
					LOG.info(line);
			} while (line != null);	
			
		} catch (Exception x) {
			LOG.error(x.toString());
		}
		
	}

}
