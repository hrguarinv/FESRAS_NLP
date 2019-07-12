package br.rio.puc.inf.builderSecurityObjective;

import java.util.List;

/**
 * Class interface used to get the security objectives and add them to the
 * framework
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 18.10.2017
 */
public interface ISecurityObjectiveProvider {

	List<ISecurityObjective> getSecurityObjectives();

	void addSecurityObjective(ISecurityObjective securityObjective);
}
