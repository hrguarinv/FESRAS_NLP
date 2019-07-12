package br.rio.puc.inf.builderSecurityObjective;

import java.util.Arrays;
import java.util.List;

import br.rio.puc.inf.builderSecurityControls.DefaultSecurityControlForAvailability;
import br.rio.puc.inf.builderSecurityControls.ISecurityControl;

public class AvailabilitySecurityObjective extends BaseSecurityObjective {
	
	/**
	 * Method used to return the acronym name of the availability security objective
	 */
	@Override
	public SecurityObjectiveAcronym getAcronym() {
		return SecurityObjectiveAcronym.A;
	}

	/**
	 * Method used to return the description of the availability security objective
	 */
	@Override
	public String getDescription() {
		return "A1. The application server shall be suitably hardened from\r\n" + 
				"a default configuration." + "\n" +
	    "A2. HTTP responses contain a safe character set in the\r\n" + 
	    "content type header." + "\n" +
		"A3. Backups must be implemented and recovery strategies\r\n" + 
		"must be considered";
	}

	/**
	 * Method used to return the actions list related to the availability security
	 * objective
	 */
	@Override
	public List<String> getActions() {
		List<String> actions = Arrays.asList("recover", "denegate");
		return actions;
	}

	/**
	 * Method used to return the users list related to the availability security
	 * objective
	 */
	@Override
	public List<String> getUsers() {
		List<String> users = Arrays.asList("backup", "day", "hour", "time", "period");
		return users;
	}

	/**
	 * Used method to return the security controls list related to the availability
	 * security objective
	 */
	@Override
	public List<ISecurityControl> getControls() {
		return new DefaultSecurityControlForAvailability().getSecurityControls();
	}

}
