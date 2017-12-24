#!/bin/sh
cd sct-au
mvn clean install
cd ../sct-es
mvn clean install
cd ../sct-loinc
mvn clean install
cd ../sct
mvn clean install
cd ../sct-uk
mvn clean install
cd ../sct-uk-dmd
mvn clean install
cd ../sct-us
mvn clean install
cd ..
