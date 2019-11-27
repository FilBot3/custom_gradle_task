package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class CustomTask extends DefaultTask {
  @Input
  String greeting = 'Hello from within the GreetingTask'

  @TaskAction
  def greet() {
    println greeting
  }
}
