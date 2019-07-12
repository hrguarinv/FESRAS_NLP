package br.rio.puc.inf.builderSecurityObjective;

import java.util.Arrays;
import java.util.List;

import br.rio.puc.inf.builderSecurityControls.DefaultSecurityControlForConfidentiality;
import br.rio.puc.inf.builderSecurityControls.ISecurityControl;

/**
 * Confidentiality security objective class that extends the
 * BaseSecurityObjective class in order to define the attributes of the new
 * objects
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 16.10.2017
 */
public class ConfidentialitySecurityObjective extends BaseSecurityObjective {

	/**
	 * Method used to return the acronym name of the confidentiality security
	 * objective
	 */
	@Override
	public SecurityObjectiveAcronym getAcronym() {
		return SecurityObjectiveAcronym.C;
	}

	/**
	 * Method used to return the description of the confidentiality security
	 * objective
	 */
	@Override
	public String getDescription() {
		return "The degree to which the data is disclosed only as intended";
	}

	/**
	 * Method used to return the actions list related to the confidentiality
	 * security objective
	 * 
	 * @return a list with the words that mean actions
	 */
	@Override
	public List<String> getActions() {
		List<String> actions = Arrays.asList("read", "access", "store", "transfer", "send", "view", "display", "show",
				"share", "use", "export", "report");
		return actions;
	}

	/**
	 * Method used to return the users list related to the confidentiality security
	 * objective
	 */
	@Override
	public List<String> getUsers() {
		List<String> users = Arrays.asList("sensitive", "resource", "user", "roles", "rules");
		return users;
	}

	/**
	 * Method used to return the security controls list related to the
	 * confidentiality security objective
	 */
	@Override
	public List<ISecurityControl> getControls() {
		return new DefaultSecurityControlForConfidentiality().getSecurityControls();
	}
}
