package br.rio.puc.inf.builderSecurityObjective;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that allows to return the security objectives list of the framework
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 19.10.2018
 */
public class SecurityObjectivesExecution {

	/**
	 * Method used to return the security objectives list of the framework
	 * @param securityObjectiveProvider - ISecurityObjectiveProvider objects
	 * @param actions - List with the verbs extracted from the file
	 * @return security objectives
	 */
	public List<String> securityObjectivesName(ISecurityObjectiveProvider securityObjectiveProvider,
			List<String> actions) {
		
		System.out.println("Security Objective Provider: " + securityObjectiveProvider.getSecurityObjectives().get(0).getActions().get(2) + "-" + securityObjectiveProvider.getSecurityObjectives().get(1).getName());
		
		List<String> securityObjNames = new ArrayList<>();
		List<ISecurityObjective> securityObjectives = securityObjectiveProvider.getSecurityObjectives();

		System.out.println("Security Objectives: " + securityObjectives.size());
		
		
		for(int x=0; x < securityObjectives.size(); x++) {
			for(int y=0; y < securityObjectives.get(x).getActions().size(); y++) {
				if(actions.get(0).equals(securityObjectives.get(x).getActions().get(y))) {
					securityObjNames.add(securityObjectives.get(x).getName());
				}
			}
		}
		System.out.println("Security Objective Names: " + securityObjNames);
		return securityObjNames;
	}
}
