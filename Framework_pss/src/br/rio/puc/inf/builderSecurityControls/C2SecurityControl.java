package br.rio.puc.inf.builderSecurityControls;

/**
 * Second confidentiality security control class that extends the
 * BaseSecurityControl class in order to define the attributes of the new
 * objects
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 13.10.2017
 */

public class C2SecurityControl extends BaseSecurityControl {

	String description;

	/**
	 * Method used to return the acronym name of the second confidentiality security
	 * control
	 */
	@Override
	public SecurityControlsAcronym getAcronym() {
		return SecurityControlsAcronym.C2;
	}

	/**
	 * Method used to return the description of the second confidentiality security
	 * control
	 */
	@Override
	public String getDescription() {
		return description;

	}

	/**
	 * Method used to set the description template of the second confidentiality
	 * security control
	 * 
	 * @param assets
	 *            - Nouns extracted from the file
	 * @param actions
	 *            - Verbs extracted from the file
	 */
	@Override
	public void setDescription(String assets, String actions) {

		this.description = "The system shall encrypt " + assets + " and store " + assets
				+ " in encrypted format using an industry-approved encryption algorithm";

	}

	/**
	 * Method used to return the domain name of the second confidentiality security
	 * control
	 */
	@Override
	public String getDomain() {
		return "Confidentiality during storage";
	}
}
