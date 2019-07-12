package br.rio.puc.inf.builderSecurityControls;

/**
 * First integrity security control class that extends the BaseSecurityControl
 * class in order to define the attributes of the new objects.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 13.10.2017
 */

public class I1SecurityControl extends BaseSecurityControl {

	String description;


	/**
	 * Method used to return the acronym name of the first integrity security
	 * control
	 */
	@Override
	public SecurityControlsAcronym getAcronym() {
		return SecurityControlsAcronym.I1;
	}

	/**
	 * Method used to return the description of the first integrity security control
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * Method used to set the description template of the first integrity security
	 * control
	 * 
	 * @param assets
	 *            - Nouns extracted from the file
	 * @param actions
	 *            - Verbs extracted from the file
	 */
	@Override
	public void setDescription(String assets, String actions) {
		this.description = "I1. Any unauthorized modification of data must yield an auditable security-related event." + "\n" +
				"I2. All input is validated to be correct and fit for the intended purpose." + "\n" +
				"I3. Data from an external entity shall always be validated.";

	}

	/**
	 * Method used to return the domain name of the first integrity security control
	 */
	@Override
	public String getDomain() {
		// TODO Auto-generated method stub
		return "Maintaining integrity during write-type actions";
	}
}
