package br.rio.puc.inf.builderSecurityControls;

import br.rio.puc.inf.builderSecurityObjective.ISecurityObjective;

/**
 * Abstract class that implements the ISecurityControl to create new security
 * controls in the framework
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 10.10.2017
 */

public abstract class BaseSecurityControl implements ISecurityControl {

	/**
	 * Method used to obtain the attributes of the new security control
	 */
	protected BaseSecurityControl() {
		final Class<?> aClass = getClass();
		final String className = aClass.getName();
		final int startIndex = className.lastIndexOf((int) '.') + 1;
		final int endIndex = className.length() - "SecurityControl".length();
		name = className.substring(startIndex, endIndex);
	}

	private final String name;

	/**
	 * Method used to compare the security control objects
	 * 
	 * @param obj
	 *            - Object type
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ISecurityControl)) {
			return false;
		}

		final ISecurityControl baseSecurityControl = (ISecurityControl) obj;
		return name.equals(baseSecurityControl.getId());
	}

	/**
	 * Method used to return the ID of the security control
	 */
	@Override
	public String getId() {
		return name;
	}

	/**
	 * Method used to return the name of the security control
	 */
	@Override
	public String getName() {
		return name;
	}

}
