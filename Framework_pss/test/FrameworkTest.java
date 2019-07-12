import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.rio.puc.inf.builderSecurityControls.SecurityControlsExecution;
import br.rio.puc.inf.builderSecurityObjective.DefaultSecurityObjectiveProvider;
import br.rio.puc.inf.builderSecurityObjective.ISecurityObjectiveProvider;
import br.rio.puc.inf.builderSecurityObjective.SecurityObjectivesExecution;
import br.rio.puc.inf.parseFile.FileParse;
import br.rio.puc.inf.readFile.IReadFile;
import br.rio.puc.inf.readFile.ReadTXTFile;
import br.rio.puc.inf.readFile.ReadWordFile;

/**
 * Class that defines the test script of the framework using JUnit
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 22.10.2017
 */

public class FrameworkTest {

	IReadFile readFileTxt = new ReadTXTFile();
	IReadFile readFileWord = new ReadWordFile();
	List<String> txtfilename = readFileTxt.readFile("C:\\Users\\Toshiba1\\Desktop\\UserStory1.txt");
	List<String> wordfilename = readFileWord.readFile("C:\\Users\\Toshiba1\\Desktop\\UserStory1.docx");

	FileParse fp = new FileParse();
	List<String> actions = fp.NLP_VBs(txtfilename);
	List<String> assets = fp.NLP_NNs(txtfilename);

	/**
	 * Script to test the loading of the TXT file
	 */
	@Test
	public void testLoadTxtFile() {
		// If the txtfilename variable is not empty then the file was read.
		assertTrue(txtfilename.size() > 0);
		assertTrue(txtfilename.isEmpty() == false);
	}

	/**
	 * Script to test the loading of the Word file
	 */
	@Test
	public void testLoadWordFile() {
		// If the Wordfilename variable is not empty then the file was read.
		assertTrue(wordfilename.size() > 0);
		assertTrue(wordfilename.isEmpty() == false);
	}

	/**
	 * Script to test the assets and actions extracted from the file loaded
	 */
	@Test
	public void testExtractAssetsActions() {
		/*
		 * Sentence loaded: As a user, I can read and create my password. In that sense
		 * the verbs extracted must be "read" and "create" In that sense the nouns must
		 * be "password".
		 */
		assertTrue(actions.get(0).equals("read"));
		assertTrue(actions.get(1).equals("create"));
		assertTrue(assets.get(0).equals("password"));
	}

	/**
	 * Script to test the security objectives elicitation
	 */
	@Test
	public void testSecurityDomain() {

		List<String> sonames;
		SecurityObjectivesExecution soe = new SecurityObjectivesExecution();
		ISecurityObjectiveProvider dso = new DefaultSecurityObjectiveProvider();

		/*
		 * Taken into consideration that actions such as "read" and "create" are part of
		 * the Confidentiality and Integrity security objectives, the expected results
		 * are Confidentiality and Integrity.
		 */
		sonames = soe.securityObjectivesName(dso, actions);
		assertTrue(sonames.get(0).equals("Confidentiality"));
		assertTrue(sonames.get(1).equals("Integrity"));
	}

	/**
	 * Script to test the security controls elicitation
	 */
	@Test
	public void testSecurityControls() {
		List<String> scnames;
		List<String> sonames;
		ISecurityObjectiveProvider dso = new DefaultSecurityObjectiveProvider();
		SecurityObjectivesExecution soe = new SecurityObjectivesExecution();
		SecurityControlsExecution sce = new SecurityControlsExecution();
		sonames = soe.securityObjectivesName(dso, actions);
		scnames = sce.mappingSecurityControls(dso, sonames, actions, assets);

		/*
		 * The verbs, action and security domains are related with the following
		 * security controls
		 */
		assertTrue(scnames.get(0).equals("C1"));
		assertTrue(scnames.get(1).equals("C2"));
		assertTrue(scnames.get(2).equals("I1"));
		assertTrue(scnames.get(3).equals("I2"));
	}
}
