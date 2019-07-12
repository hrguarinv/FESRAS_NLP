package br.rio.puc.inf.builderSecurityObjective;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import br.rio.puc.inf.builderSecurityControls.ISecurityControl;

/**
 * Class that implements the ISecurityObjectiveProvider and defines the security
 * objective and initialize it.
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 18.10.2017
 */
public class DefaultSecurityObjectiveProvider implements ISecurityObjectiveProvider {

	final List<ISecurityObjective> securityObjectives;

	/**
	 * Method used to initialize the class necessary to create the security
	 * objective class
	 */
	public DefaultSecurityObjectiveProvider() {
		this.securityObjectives = new ArrayList<ISecurityObjective>(2);
		initializeClassSecurityObjectives(securityObjectives);
	}

	/**
	 * Method used to return the security objectives object
	 * 
	 * @return a list with ISecurityObjective objects
	 */
	public List<ISecurityObjective> getSecurityObjectives() {
		return securityObjectives;
	}

	/**
	 * Used method to add the integrity, confidentiality and availability security objectives to
	 * the security objective structure
	 * 
	 * @param securityObjectives
	 *            - Group of ISecurityObjective objects
	 */
	private static void initializeClassSecurityObjectives(Collection<ISecurityObjective> securityObjectives) {

		securityObjectives.add(new ConfidentialitySecurityObjective());
		securityObjectives.add(new IntegritySecurityObjective());
		securityObjectives.add(new AvailabilitySecurityObjective());
	}

	/**
	 * Method used to add the security objective to the object list defined in the
	 * class
	 * 
	 * @param securityObjective
	 *            - ISecurityObjective object
	 */
	@Override
	public void addSecurityObjective(ISecurityObjective securityObjective) {
		securityObjectives.add(securityObjective);
	}
}
