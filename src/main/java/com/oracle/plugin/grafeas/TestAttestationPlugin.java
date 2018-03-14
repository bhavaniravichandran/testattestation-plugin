package com.oracle.plugins.grafeas;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class TestAttestationPlugin implements Plugin<Project> {
  static final String TASK_NAME = "testAttestation";

  //@Override
  public void apply(Project project) {
/*
    project.getExtensions().create("testattestation", TestAttestationPluginExtension.class);
    project.getTasks().create("testAttestation", TestAttestation.class);
*/
    project.getTasks().create("testAttestation", TestAttestation.class, (task) -> {
            task.setSignature("UNKNOWN");
            task.setGrafeasUrl("UNKNOWN");
            task.setPgpKeyID("UNKNOWN");
            task.setProjectId("UNKNOWN");
            task.setResourceUrl("UNKNOWN");
        });
  }
}
