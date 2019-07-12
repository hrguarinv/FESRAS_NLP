package br.rio.puc.inf.readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that defines the method to read a TXT file implementing the IReadFile
 * interface
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 16.10.2017
 */
public class ReadTXTFile implements IReadFile {

	/**
	 * Method used to read a txt file implementing the IReadFile interface
	 * 
	 * @param fileName
	 *            - Name of the file
	 * @return list with the file loaded
	 */
	public List<String> readFile(String fileName) {
		List<String> results = new ArrayList<String>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			String line = reader.readLine();
			while (line != null) {
				results.add(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e);
			System.exit(-1);
		}
		return results;
	}

}
