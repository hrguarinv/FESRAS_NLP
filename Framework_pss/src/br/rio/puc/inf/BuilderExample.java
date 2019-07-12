package br.rio.puc.inf;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import br.rio.puc.inf.builderSecurityControls.DefaultSecurityControlForAvailability;
import br.rio.puc.inf.builderSecurityControls.DefaultSecurityControlForConfidentiality;
import br.rio.puc.inf.builderSecurityControls.DefaultSecurityControlForIntegrity;
import br.rio.puc.inf.builderSecurityControls.ISecurityControl;
import br.rio.puc.inf.builderSecurityControls.ISecurityControlProvider;
import br.rio.puc.inf.builderSecurityControls.SecurityControlsExecution;
import br.rio.puc.inf.builderSecurityObjective.DefaultSecurityObjectiveProvider;
import br.rio.puc.inf.builderSecurityObjective.ISecurityObjective;
import br.rio.puc.inf.builderSecurityObjective.ISecurityObjectiveProvider;
import br.rio.puc.inf.builderSecurityObjective.SecurityObjectivesExecution;
import br.rio.puc.inf.builderSentenceFile.SentenceFile;
import br.rio.puc.inf.builderSentenceFile.SentenceFileDirector;
import br.rio.puc.inf.builderSentenceFile.TextFileBuilder;
import br.rio.puc.inf.parseFile.FileParse;
import br.rio.puc.inf.readFile.IReadFile;
import br.rio.puc.inf.readFile.ReadTXTFile;

/**
 * Class that defines the necessary instances to launch the framework features.
 * 
 * @author Hugo Ricardo Guarín Villamizar.
 * @version 1.0
 * @since 10.10.2017
 */

public class BuilderExample {

	TextFileBuilder textoBuilder = new TextFileBuilder();
	SentenceFileDirector sentenceFileDirector = new SentenceFileDirector(textoBuilder);
	FileParse fp = new FileParse();
	FileUtils fileUtils = new FileUtils();
	IReadFile readFile = new ReadTXTFile();

	SecurityObjectivesExecution soe = new SecurityObjectivesExecution();
	List<String> sonames;
	ISecurityObjectiveProvider dso = new DefaultSecurityObjectiveProvider();

	SecurityControlsExecution sce = new SecurityControlsExecution();
	List<String> scnames;
	ISecurityControlProvider scfi = new DefaultSecurityControlForIntegrity();
	DefaultSecurityControlForConfidentiality scfc = new DefaultSecurityControlForConfidentiality();
	DefaultSecurityControlForAvailability scfa = new DefaultSecurityControlForAvailability();
	

	/**
	 * Method used to initialize the framework instances
	 * @param sentence extracted from the file
	 * @return security controls elicitation text
	 */
	public String initialize(List<String> sentence) {

		String securityElicitation="";
		// TXT file instanciation
		//List<String> txtfilename = new ArrayList<String>();
		//txtfilename = readFile.readFile("C:\\Users\\Toshiba1\\Desktop\\UserStory1.txt");

		// WORD file instanciation
		// List<String> wordfilename = new ArrayList<String>();
		// wordfilename = readFile.readFile("Prueba.txt");

		fp.NLP_NNs(sentence);

		List<String> actions = fp.NLP_VBs(sentence);		
		List<String> assets = fp.NLP_NNs(sentence);

		SentenceFile sentenceFile = sentenceFileDirector.getSentenceFile();

		sonames = soe.securityObjectivesName(dso, actions);
		
		//sentenceFileDirector.builderSentenceFile(actions, null, assets);
		//sonames = soe.securityObjectivesName(dso, actions);
				
		securityElicitation +="\nSECURITY PROPERTY related to the verb: " + actions.get(0);
		
		for(int a=0; a < sonames.size(); a++) {
			securityElicitation += "\n" + sonames.get(a);
		}
		
				
		securityElicitation += "\n\nOWASP HIGH-LEVEL SECURITY REQUIREMENTS to consider to the user story:\n";
		scnames = sce.mappingSecurityControls(dso, sonames, actions, assets);
		
		for (int y = 0; y < scnames.size(); y++) {
			if (scnames.get(y).contains("C1") || scnames.get(y).contains("I1") || scnames.get(y).contains("A1")) {
				securityElicitation += scnames.get(y) + "\n";
			}
		}
		return securityElicitation;
	}

}
