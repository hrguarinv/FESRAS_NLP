package br.rio.puc.inf.builderSecurityControls;

/**
 * Interface that contains the methods with the attributes of the security
 * controls.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 11.10.2017
 */

public interface ISecurityControl {

	String getId();

	String getDomain();

	SecurityControlsAcronym getAcronym();

	String getName();

	String getDescription();

	void setDescription(String assets, String actions);
}
