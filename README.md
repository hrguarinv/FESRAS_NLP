# FESRAS
This repository contains the files of the Software Framework for Eliciting Security Requirements in Agile Specifications (FESRAS). To extract the keywords of the agile specifications in format of user story, we developed the software framework that uses the Stanford CoreNLP tool\footnote{https://github.com/stanfordnlp/CoreNLP} through a library that provides a set of natural language analysis tools written in Java. The library represents each sentence as a directed graph where the vertices are words and the edges are the relationships between them. Thereby, the software framework can take the verbs and nouns of the user story and then analyze them in order to link security properties. 


