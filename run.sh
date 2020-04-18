#!/bin/bash

java -jar mysql-connector-java-5.1.47.jar \
&& javac src/TestChat.java  \
&& java src/TestChat
