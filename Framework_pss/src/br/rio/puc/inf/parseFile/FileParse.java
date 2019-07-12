package br.rio.puc.inf.parseFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.IndexedWord;
import edu.stanford.nlp.ling.CoreAnnotations.LemmaAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.NamedEntityTagAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.PartOfSpeechAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.SentencesAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TextAnnotation;
import edu.stanford.nlp.ling.CoreAnnotations.TokensAnnotation;
import edu.stanford.nlp.pipeline.Annotation;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import edu.stanford.nlp.semgraph.SemanticGraph;
import edu.stanford.nlp.semgraph.SemanticGraphEdge;
import edu.stanford.nlp.semgraph.SemanticGraphCoreAnnotations.CollapsedCCProcessedDependenciesAnnotation;
import edu.stanford.nlp.trees.Tree;
import edu.stanford.nlp.util.CoreMap;

/**
 * Class that defines the methods to split the sentence of the file and classify
 * them as a verbs and nouns
 * 
 * @author Hugo Ricardo Guarín Villamizar
 * @version 1.0
 * @since 19.10.2017
 */
public class FileParse {

	/**
	 * Method used to return the verbs of the sentence extracted from the file. This
	 * method uses the library developed by the Stanford University
	 * 
	 * @param lines
	 *            - List with the sentences of the file
	 * @return a list with the verbs extracted from the file
	 */
	public List<String> NLP_VBs(List<String> lines) {
		List<String> verbs = new ArrayList<String>();
		java.util.Properties props = new java.util.Properties();
		props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
		StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

		for (String line : lines) {
			Annotation document = new Annotation(line);

			pipeline.annotate(document);

			java.util.List<CoreMap> sentences = document.get(SentencesAnnotation.class);

			for (CoreMap sentence : sentences) {

				for (CoreLabel token : sentence.get(TokensAnnotation.class)) {
					String word = token.get(TextAnnotation.class);
					String pos = token.get(PartOfSpeechAnnotation.class);
					String ne = token.get(NamedEntityTagAnnotation.class);
					String lemma = token.get(LemmaAnnotation.class);
					if (pos.equals("VB")) {
						verbs.add(word);
					}
				}
			}
		}
		return verbs;
	}

	/**
	 * Method used to return the nouns of the sentence extracted from the file. This
	 * method uses the library developed by the Stanford University
	 * 
	 * @param lines
	 *            - List with the sentences of the file
	 * @return a list with the nouns extracted from the file
	 */
	public List<String> NLP_NNs(List<String> lines) {
		List<String> nouns = new ArrayList<String>();
		java.util.Properties props = new java.util.Properties();
		props.put("annotators", "tokenize, ssplit, pos, lemma, ner, parse, dcoref");
		StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

		for (String line : lines) {
			Annotation document = new Annotation(line);

			pipeline.annotate(document);

			java.util.List<CoreMap> sentences = document.get(SentencesAnnotation.class);

			for (CoreMap sentence : sentences) {

				for (CoreLabel token : sentence.get(TokensAnnotation.class)) {
					String word = token.get(TextAnnotation.class);
					String pos = token.get(PartOfSpeechAnnotation.class);
					String ne = token.get(NamedEntityTagAnnotation.class);
					String lemma = token.get(LemmaAnnotation.class);

					if (pos.equals("NN")) {
						nouns.add(word);
					}
				}
			}
		}
		return nouns;
	}
}
