package br.rio.puc.inf.builderSentenceFile;

import java.util.List;

/**
 * Abstract class necessary to build and instance a clean sentence from the file
 * read. This class has the heading of the methods (definition).
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 13.10.2017
 */

public abstract class SentenceFileBuilder {

	protected SentenceFile sentenceFile;

	/**
	 * Method used to create a new sentenceFile object
	 */
	public SentenceFileBuilder() {
		sentenceFile = new SentenceFile();
	}

	public abstract void buildAssets(List<String> users);

	public abstract void buildActions(List<String> actions);

	public abstract void buildReasons(List<String> reasons);

	/**
	 * Method used to return the sentenceFile from the file read
	 * @return sentence extracted from the file
	 */
	public SentenceFile getSentenceFile() {
		return sentenceFile;
	}

}
