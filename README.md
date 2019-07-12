# FESRAS
This repository contains the files of the Software Framework for Eliciting Security Requirements in Agile Specifications (FESRAS). To extract the keywords of the agile specifications in format of user story, we developed the software framework that uses the Stanford CoreNLP tool (see more at https://github.com/stanfordnlp/CoreNLP) through a library that provides a set of natural language analysis tools written in Java. The library represents each sentence as a directed graph where the vertices are words and the edges are the relationships between them. Thereby, the software framework can take the verbs and nouns of the user story and then analyze them in order to link security properties. 

In the following we describe the main purpose of the framework.

## Objective
The goal of this work is to map OWASP high level security requirements from text documents that describe desired software behaviors (user stories) in the context of agile methods.

The main features of FESCARS are briefly described as follows:

* **Insert file.** The software framework must allow the user to load TXT and Word files.
* **Process file.** The software framework must allow the user to read TXT and Word files that contain software behaviors (user stories).
* **Extract assets and operations.** The software framework must allow the user to process natural language to extract relevant verbs and nouns from the files.
* **Map security objective.** The software framework must allow the user to map security objectives from the assets and operations extracted.
* **Map security controls.** The software framework must allow the user to map security controls from the security objectives extracted.


