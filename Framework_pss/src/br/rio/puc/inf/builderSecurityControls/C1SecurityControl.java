package br.rio.puc.inf.builderSecurityControls;

/**
 * First confidentiality security control class that extends the
 * BaseSecurityControl class in order to define the attributes of the new
 * objects
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 13.10.2017
 */

public class C1SecurityControl extends BaseSecurityControl {

	String description;

	/**
	 * Method used to return the acronym name of the first confidentiality security
	 * control
	 */
	@Override
	public SecurityControlsAcronym getAcronym() {
		return SecurityControlsAcronym.C1;
	}

	/**
	 * Method used to return the description of the first confidentiality security
	 * control
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * Method used to set the description template of the first confidentiality
	 * security control
	 * 
	 * @param assets
	 *            - nouns extracted from the file
	 * @param actions
	 *            - verbs extracted from the file
	 */
	@Override
	public void setDescription(String assets, String actions) {

		this.description = "C1. Data shall be protected from unauthorized observation and disclosure both in transit and when stored" + "\n" +
				"C2. System sessions shall be unique to each individual and cannot be shared." + "\n" +
				"C3. System sessions are invalidated when timed out during periods of inactivity" + "\n" +
				"C4. TLS protocol shall be used where sensitive data is transmitted" + "\n" +
				"C5. System shall use strong encryption algorithm at all times";
	}

	/**
	 * Method used to return the domain name of the first confidentiality security
	 * control
	 */
	@Override
	public String getDomain() {
		return "Authorized access";
	}
}
