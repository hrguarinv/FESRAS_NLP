package br.rio.puc.inf.builderSecurityObjective;

import java.util.List;

import br.rio.puc.inf.builderSecurityControls.ISecurityControl;

/**
 * Interface that defines the heading of the methods that compose a security
 * objective
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 17.10.2017
 *
 */
public interface ISecurityObjective {

	String getId();

	SecurityObjectiveAcronym getAcronym();

	String getName();

	String getDescription();

	List<String> getActions();

	List<String> getUsers();

	List<ISecurityControl> getControls();
}
