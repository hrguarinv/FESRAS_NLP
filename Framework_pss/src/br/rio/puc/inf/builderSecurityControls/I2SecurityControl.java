package br.rio.puc.inf.builderSecurityControls;

/**
 * Second integrity security control class that extends the BaseSecurityControl
 * class in order to define the attributes of the new objects.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 13.10.2017
 */
public class I2SecurityControl extends BaseSecurityControl {

	String description;
	
	/**
	 * Method used to return the acronym name of the second integrity security
	 * control
	 */
	@Override
	public SecurityControlsAcronym getAcronym() {
		return SecurityControlsAcronym.I2;
	}

	/**
	 * Method used to return the description of the second integrity security
	 * control
	 */
	@Override
	public String getDescription() {
		return description;

	}

	/**
	 * Method used to set the description template of the second integrity security
	 * control
	 * 
	 * @param assets
	 *            - Nouns extracted from the file
	 * @param actions
	 *            - Verbs extracted from the file
	 */
	@Override
	public void setDescription(String assets, String actions) {
		this.description = "The system shall not allow modification of " + actions + " by any user";

	}

	/**
	 * Method used to return the domain name of the second integrity security
	 * control
	 */
	@Override
	public String getDomain() {
		return "Maintaining integrity of unchangeable resources";
	}

}
