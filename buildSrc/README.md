# Gradle `buildSrc/` Directory

## Overview

This directory will be "watched" by Gradle and compiled on initial run, and only
on subsequent runs when anything has changed within the `buildSrc/` sources.

This package will automatically be included in your `classpath`. 

If this package needs to be shared across many `build.gradle` projects, then
it should be moved into its own Gradle Project as a Groovy/Kotlin/Java project
and uploaded to Maven or a repository. Then it can be called upon as a custom
plugin.