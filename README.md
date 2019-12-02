# Custom Gradle Task

## Overview

## Requirements

* Java, prerably OpenJDK 13
* [Gradle](https://gradle.org/) 6.0.1 or newer

## Setup

Clone the Gradle Project locally. Execute `gradle tasks --all`. This will compile
the Custom Task Library and include it in your classpath.

We're using the Gradle Wrapper. This was created to help make it so you don't have
to have Gradle installed and it handles it for you.

## Usage

```bash
gradlew tasks --all
gradew greeting
```

### Turning into a "standalone", distributable plugin/task

To turn the code in `buildSrc/` into a standalone, distributable Gradle Plugin
or Task, move the contents of `buildSrc/` to their own `src/` or their own
project directory. Then compile it into a JAR and push it to Maven, or whatever
repository you're using. Then use Gradle to pull that dependency and run your
custom Task or Plugin.

## Development and Testing

None yet.

## References

* [Gradle: Writing Custom Tasks](https://guides.gradle.org/writing-gradle-tasks/)
* [Gradle: Organizing Projects](https://docs.gradle.org/current/userguide/organizing_gradle_projects.html)
* [Gradle: Develop Custom Tasks](https://docs.gradle.org/current/userguide/custom_tasks.html)