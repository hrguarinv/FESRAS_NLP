package br.rio.puc.inf.builderSecurityControls;

import java.util.ArrayList;
import java.util.List;

import br.rio.puc.inf.builderSecurityObjective.ISecurityObjectiveProvider;
import br.rio.puc.inf.builderSecurityObjective.ISecurityObjective;

/**
 * Class that allows to return the security controls list of the framework
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 15.10.2017
 */
public class SecurityControlsExecution {

	/**
	 * Method used to return the security controls list of the framework
	 * 
	 * @param securityObjectiveProvider object
	 * @param securityObjectiveNames object
	 * @param user list
	 * @param actions verbs extracted from the file
	 * @return List with the contents of security controls
	 */
	public List<String> mappingSecurityControls(ISecurityObjectiveProvider securityObjectiveProvider,
			List<String> securityObjectiveNames, List<String> actions, List<String> user) {

		List<String> securityControlNames = new ArrayList<>();
		List<ISecurityObjective> securityObjectives = securityObjectiveProvider.getSecurityObjectives();
		
		for (ISecurityObjective so : securityObjectives) {
			for (String securityObjectivesName : securityObjectiveNames) {
				
				
				
				if (so.getName().equals(securityObjectivesName)) {
					for (ISecurityControl iSecurityControl : so.getControls()) {
						iSecurityControl.setDescription(actions.get(0), user.get(0));
						securityControlNames.add(iSecurityControl.getDescription());
					}
				}

			}

		}
		return securityControlNames;
	}
}
