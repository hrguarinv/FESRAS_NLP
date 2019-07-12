package br.rio.puc.inf.builderSentenceFile;

import java.util.List;

/**
 * Class that extends the SentenceFileBuilder abstract class to build the object
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 13.10.2017
 */
public class TextFileBuilder extends SentenceFileBuilder {

	/**
	 * Method used to build the file object with its assets
	 * 
	 * @param assets
	 *            - List of the nouns extracted from the file
	 */
	public void buildAssets(List<String> assets) {
		sentenceFile.setAssets(assets);
	}

	/**
	 * Method used to build the file object with its actions
	 * 
	 * @param actions
	 *            - List of the verbs extracted from the file
	 */
	public void buildActions(List<String> actions) {
		sentenceFile.setActions(actions);
	}

	/**
	 * Method used to build the file object with its reasons
	 */
	public void buildReasons(List<String> reasons) {
		sentenceFile.setReasons(reasons);
	}
}
