package br.rio.puc.inf.builderSecurityControls;

public class A2SecurityControl extends BaseSecurityControl {
	
	String description;

	/**
	 * Method used to return the acronym name of the first confidentiality security
	 * control.
	 */
	@Override
	public SecurityControlsAcronym getAcronym() {
		return SecurityControlsAcronym.A2;
	}

	/**
	 * Method used to return the description of the first aavailability security
	 * control
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * Method used to set the description template of the first availability
	 * security control
	 * 
	 * @param assets
	 *            - nouns extracted from the file
	 * @param actions
	 *            - verbs extracted from the file
	 */
	@Override
	public void setDescription(String assets, String actions) {

		this.description = "A1. Backups must be implemented and recovery strategies\r\n" + 
				"must be considered";
	}

	/**
	 * Method used to return the domain name of the first availability security
	 * control
	 */
	@Override
	public String getDomain() {
		return "Authorized access";
	}

}
