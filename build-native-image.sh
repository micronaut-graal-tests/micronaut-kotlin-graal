#!/bin/bash

JDK_VERSION=`java -version 2>&1 | awk -F '"' '/version/ {print $2}'`
JDK_16='16'

if [ "${JDK_VERSION}" != "${JDK_VERSION%"$JDK_16"*}" ]; then
  export GRADLE_OPTS="-Dorg.gradle.jvmargs=--illegal-access=permit"
fi

./gradlew nativeImage
cp build/native-image/kotlin .
