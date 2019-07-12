package br.rio.puc.inf.builderSecurityControls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class that implements the ISecurityControlProvider and defines the Integrity
 * security control and initialize it.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 15.10.2017
 */

public class DefaultSecurityControlForIntegrity implements ISecurityControlProvider {

	final List<ISecurityControl> securityControls;

	/**
	 * Method used to initialize the class necessary to create the integrity
	 * security control
	 */
	public DefaultSecurityControlForIntegrity() {
		this.securityControls = new ArrayList<ISecurityControl>(2);
		initializeClassSecurityControlsForIntegrity(securityControls);
	}

	/**
	 * Method used to return the security control object
	 */
	public List<ISecurityControl> getSecurityControls() {
		return securityControls;
	}

	/**
	 * Method used to add the integrity security control to the security control
	 * structure
	 * 
	 * @param securityControls
	 *            - Group of ISecurityControls objects
	 */
	private static void initializeClassSecurityControlsForIntegrity(Collection<ISecurityControl> securityControls) {

		securityControls.add(new I1SecurityControl());
		securityControls.add(new I2SecurityControl());
	}

	/**
	 * Method used to add the security control to the object list defined in the
	 * class
	 * 
	 * @param securityControl - ISecurityControl object
	 */
	@Override
	public void addSecurityControl(ISecurityControl securityControl) {
		securityControls.add(securityControl);
	}

}
