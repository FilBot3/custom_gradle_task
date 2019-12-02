package org.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class JavaCustomTask extends DefaultTask {
  @TaskAction
  public void run() {
    System.out.println("Hello from the Java Task " + getPath() + "!");
  }
}