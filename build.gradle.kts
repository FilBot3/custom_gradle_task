task <org.gradle.GroovyCustomTask>("groovyTask") {
  group = "Custom Gradle Tasks"
  description = "A custom task written in Groovy in buildSrc/"
  greeting = "Hello from outside the class."
}

open class LocalKotlinGreetignTask : DefaultTask() {
  @get:Input
  var greeting = "hello from inside the buildfile"

  @TaskAction
  fun greet() {
    println(greeting)
  }
}

task <LocalKotlinGreetignTask>("localTask") {
  group = "Custom Gradle Tasks"
  description = "A custom task written in Kotlin local to build.gradle.kts"
  greeting = "Hello locally."
}

tasks.register("hello") {
  group = "Custom Gradle Tasks"
  description = "A custom task that uses Kotlin"
  doLast {
    println("Hello, World!")
  }
}

task <org.gradle.JavaCustomTask>("javaTask") {
  group = "Custom Gradle Tasks"
  description = "Using Java for Tasks in buildSrc"
}