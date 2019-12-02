class GroovyCustomTaskTest {
  @Test
  public void canAddTaskToProject() {
    Project project = ProjectBuilder.builder().build()
    def task = project.task('greeting', type: GroovyCustomTask)
    assertTrue(task instanceof GroovyCustomTask)
  }
}