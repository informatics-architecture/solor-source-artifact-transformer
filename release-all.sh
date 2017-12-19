#!/bin/sh
cd sct-au
mvn jgitflow:release-start jgitflow:release-finish
cd ../sct-es
mvn jgitflow:release-start jgitflow:release-finish
cd ../sct-loinc
mvn jgitflow:release-start jgitflow:release-finish
cd ../sct
mvn jgitflow:release-start jgitflow:release-finish
cd ../sct-uk
mvn jgitflow:release-start jgitflow:release-finish
cd ../sct-uk-drug
mvn jgitflow:release-start jgitflow:release-finish
cd ../sct-us
mvn jgitflow:release-start jgitflow:release-finish
cd ..