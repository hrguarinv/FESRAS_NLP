package br.rio.puc.inf.builderSecurityControls;

import java.util.List;

/**
 * Class interface used to get the security controls and add them to the
 * framework
 * @author Hugo Ricardo Guarín Villamizar.
 * @version 1.0
 * @since 14.10.2017
 */
public interface ISecurityControlProvider {

	List<ISecurityControl> getSecurityControls();

	void addSecurityControl(ISecurityControl securityControl);
}
