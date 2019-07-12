package br.rio.puc.inf.builderSecurityObjective;

/**
 * Abstract class that implements the ISecurityObjective interface to create new security objectives in the framework 
 * 
 * @author Hugo Ricardo Guarín Villamizar.
 * @version 1.0
 * @since 18.10.2018
 */

public abstract class BaseSecurityObjective implements ISecurityObjective {
	
	/**
	 * Method used to obtain the attributes of the new security objective.
	 */
	protected BaseSecurityObjective() {
		final Class<?> aClass = getClass();
		final String className = aClass.getName();
		final int startIndex = className.lastIndexOf((int) '.') + 1;
		final int endIndex = className.length() - "SecurityObjective".length();
		name = className.substring(startIndex, endIndex);
	}

	private final String name;

	/**
	 * Method used to compare the security objectives objects 
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ISecurityObjective)) {
			return false;
		}

		final ISecurityObjective baseSecurityObjective = (ISecurityObjective) obj;
		return name.equals(baseSecurityObjective.getId());
	}

	public int hashCode() {
		return name.hashCode();
	}

	/**
	 * Method used to return the name of the security objective
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Method used to return the ID of the security objective
	 */
	@Override
	public String getId() {
		return name;
	}
}
