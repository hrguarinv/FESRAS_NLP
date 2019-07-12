package br.rio.puc.inf.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

/**
 * Class that defines the method to open the file from the user's desktop
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 18.10.2017
 */

public class FileOpener {

	JFileChooser file_chooser = new JFileChooser();
	StringBuilder sb = new StringBuilder();

	public FileOpener() {
		

	}

	/**
	 * Method used to choose the file from the user's desktop
	 * @throws FileNotFoundException Exception type
	 */
	public void chooseFile() throws FileNotFoundException {

		if (file_chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = file_chooser.getSelectedFile();
			Scanner input = new Scanner(file);

			while (input.hasNext()) {
				sb.append(input.nextLine());
				sb.append("\n");
			}
			input.close();
		} else {
			sb.append("No file was selected");
		}

	}

}
