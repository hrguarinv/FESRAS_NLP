package br.rio.puc.inf;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 * Class that defines the methods to read the TXT and WORD files that the
 * framework uses
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 11.10.2017
 */

public class FileUtils {

	/**
	 * Method used to read the TXT file
	 * 
	 * @param fileName
	 *            - Name of the file
	 * @return List with the context of the file
	 */
	public List<String> readTxtFile(String fileName) {
		List<String> results = new ArrayList<String>();
		;
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

	/**
	 * Method used to read the WORD file
	 * @param fileName Text with the name of the file 
	 * @return List with the sentence extracted from the file
	 */
	public List<String> readWordFile(String fileName) {
		List<String> results = new ArrayList<String>();
		;
		try {
			FileInputStream f = new FileInputStream(fileName);
			XWPFDocument docx = new XWPFDocument(f);

			List<XWPFParagraph> paragraphList = docx.getParagraphs();

			for (XWPFParagraph paragraph : paragraphList) {
				results.add(paragraph.getText());
				// System.out.println(paragraph.getText());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}

}
