package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

open class KotlinCustomTask : DefaultTask() {
  @get:Input
  var greeting = "Greeting from inside Kotlin task"

  @TaskAction
  fun greet() {
    println(greeting)
  }
}