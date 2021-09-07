#!/bin/bash

./gradlew nativeImage
cp build/native-image/kotlin .
