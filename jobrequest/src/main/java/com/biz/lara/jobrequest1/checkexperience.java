package com.biz.lara.jobrequest1;



import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.engine.ProcessEngine;

@ProcessApplication("Job Request")
public class checkexperience extends ServletProcessApplication {
	private static final String PROCESS_DEFINITION_KEY = "jobrequest1";

	  @PostDeploy
	  public void onDeploymentFinished(ProcessEngine processEngine) {

	  }
}