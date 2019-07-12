package br.rio.puc.inf.readFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

/**
 * Class that defines the method to read a WORD file implementing the IReadFile
 * interface
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 16.10.2017
 */
public class ReadWordFile implements IReadFile {

	/**
	 * Method used to read a word file implementing the IReadFile interface
	 * 
	 * @param fileName
	 *            - Name of the file
	 * @return list with the file loaded
	 */
	public List<String> readFile(String fileName) {
		List<String> results = new ArrayList<String>();
		;
		try {
			FileInputStream f = new FileInputStream(fileName);
			XWPFDocument docx = new XWPFDocument(f);

			List<XWPFParagraph> paragraphList = docx.getParagraphs();

			for (XWPFParagraph paragraph : paragraphList) {
				results.add(paragraph.getText());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return results;
	}

}
