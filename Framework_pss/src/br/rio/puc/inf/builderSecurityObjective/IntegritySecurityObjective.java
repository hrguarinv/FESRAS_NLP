package br.rio.puc.inf.builderSecurityObjective;

import java.util.Arrays;
import java.util.List;

import br.rio.puc.inf.builderSecurityControls.DefaultSecurityControlForIntegrity;
import br.rio.puc.inf.builderSecurityControls.ISecurityControl;

/**
 * Integrity security objective class that extends the BaseSecurityObjective
 * class in order to define the attributes of the new objects
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 16.10.2017
 */
public class IntegritySecurityObjective extends BaseSecurityObjective {
	/**
	 * Method used to return the acronym name of the integrity security objective
	 */
	@Override
	public SecurityObjectiveAcronym getAcronym() {
		return SecurityObjectiveAcronym.I;
	}

	/**
	 * Method used to return the description of the integrity security objective
	 */
	@Override
	public String getDescription() {
		return "The degree to which a system or component prevents unauthorized access to, or modification of, computer programs or data";
	}

	/**
	 * Method used to return the actions list related to the integrity security
	 * objective
	 */
	@Override
	public List<String> getActions() {
		List<String> actions = Arrays.asList("create", "update", "delete", "modify", "change", "save", "auto-populate",
				"review", "verify", "generate");
		return actions;
	}

	/**
	 * Method used to return the users list related to the integrity security
	 * objective
	 */
	@Override
	public List<String> getUsers() {
		List<String> users = Arrays.asList("firewall", "denial of service", "virus", "checking", "app firewalls");
		return users;
	}

	/**
	 * Method used to return the security controls list related to the integrity
	 * security objective
	 */
	@Override
	public List<ISecurityControl> getControls() {
		return new DefaultSecurityControlForIntegrity().getSecurityControls();
	}
}
