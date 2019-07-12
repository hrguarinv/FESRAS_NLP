package br.rio.puc.inf.builderSentenceFile;

/**
 * Class that defines the files sentence structure that framework use.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 12.10.2017
 */
import java.util.ArrayList;
import java.util.List;

public class SentenceFile {

	private List<String> assets;
	private List<String> actions;
	private List<String> reasons;

	/**
	 * Method used to return the assets list extracted from the files
	 * @return nouns extracted from the file
	 */
	public List<String> getAssets() {
		return assets;
	}

	/**
	 * Method used to set the assets list extracted from the files
	 * @param assets - List of nouns extracted from the file
	 */
	public void setAssets(List<String> assets) {
		this.assets = assets;
	}

	/**
	 * Method used to return the actions list extracted from the files
	 * @return verbs extracted from the file
	 */
	public List<String> getActions() {
		return actions;
	}

	/**
	 * Method used to set the actions list extracted from the files
	 * @param actions - List of verbs extracted from the file
	 */
	public void setActions(List<String> actions) {
		this.actions = actions;
	}

	/**
	 * Method used to return the reasons list extracted from the files
	 * @return reasons extracted from the file
	 */
	public List<String> getReasons() {
		return reasons;
	}

	/**
	 * Method used to set the reasons list extracted from the files
	 * @param reasons extracted from the file
	 */
	public void setReasons(List<String> reasons) {
		this.reasons = reasons;
	}
}
