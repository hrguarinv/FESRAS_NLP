package br.rio.puc.inf.builderSentenceFile;

import java.util.List;

/**
 * Class that defines the parts (ations, reasons, assests) of the file object
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 12.10.2017
 */
public class SentenceFileDirector {

	protected SentenceFileBuilder fileBuilder;

	/**
	 * Method used to set the attribute defined in the class
	 * @param builder SentenceFileBuilder object
	 */
	public SentenceFileDirector(SentenceFileBuilder builder) {
		fileBuilder = builder;
	}

	/**
	 * Method used to build the file according to the data extracted from the file.
	 * It works as a constructor method
	 * 
	 * @param actions
	 *            - List of the verbs extracted from the file
	 * @param reasons
	 *            - List of the reasons extracted from the file
	 * @param assets
	 *            - List of the nouns extracted from the file
	 */
	public void builderSentenceFile(List<String> actions, List<String> reasons, List<String> assets) {
		fileBuilder.buildActions(actions);
		fileBuilder.buildReasons(reasons);
		fileBuilder.buildAssets(assets);
	}

	/**
	 * Method used to return the file object created
	 * @return sentence extracted from the file
	 */
	public SentenceFile getSentenceFile() {
		return fileBuilder.getSentenceFile();
	}

	/**
	 * Method used to set the file object created
	 * 
	 * @param fb
	 *            - SentenceFileBuilder object
	 */
	public void setFileBuilder(SentenceFileBuilder fb) {
		this.fileBuilder = fb;
	}
}
