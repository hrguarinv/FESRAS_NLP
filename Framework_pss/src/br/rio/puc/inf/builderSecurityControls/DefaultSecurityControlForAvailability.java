package br.rio.puc.inf.builderSecurityControls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class that implements the ISecurityControlProvider and defines the
 * Availability security control and initialize it.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 15.10.2017
 */

public class DefaultSecurityControlForAvailability implements ISecurityControlProvider {
	
	final List<ISecurityControl> securityControls;

	/**
	 * Method used to initialize the class necessary to create the availability
	 * security control
	 */
	public DefaultSecurityControlForAvailability() {
		this.securityControls = new ArrayList<ISecurityControl>(2);
		initializeClassSecurityControlsForAvailability(securityControls);
	}

	/**
	 * Method used to return the security control object
	 */
	public List<ISecurityControl> getSecurityControls() {
		return securityControls;
	}

	/**
	 * Method used to add the availability security control to the security
	 * control structure
	 * 
	 * @param securityControls
	 *            - Group of ISecurityControl objects
	 */
	private static void initializeClassSecurityControlsForAvailability(
			Collection<ISecurityControl> securityControls) {

		securityControls.add(new A1SecurityControl());
		securityControls.add(new A2SecurityControl());
	}

	/**
	 * Method used to add the security control to the object list defined in the
	 * class
	 * 
	 * @param securityControl
	 *            - ISecurityControl object
	 */
	@Override
	public void addSecurityControl(ISecurityControl securityControl) {
		securityControls.add(securityControl);
	}


}
