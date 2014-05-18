#!/bin/sh

export ALG_JAR=/Users/mathieu/.m2/repository/fr/mla/algorithms/1.0-SNAPSHOT/algorithms-1.0-SNAPSHOT.jar
export ALG_MAIN_CLASS=fr.mla.algorithms.App

export INPUT_DATA=

${JAVA_HOME}/bin/java -cp ${ALG_JAR} ${ALG_MAIN_CLASS} ${INPUT_DATA}
