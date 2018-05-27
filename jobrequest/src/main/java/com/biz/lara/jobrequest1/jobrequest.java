package com.biz.lara.jobrequest1;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class jobrequest implements JavaDelegate {
	private final static Logger LOGGER = Logger.getLogger("jobrequest");

	@Override
	public void execute(DelegateExecution execution) throws Exception {

		boolean a1 = false;
		Integer experience = (Integer) execution.getVariable("experience");
		if (experience == 0)
			a1 = false;
		else 
			a1 = true;
		
		execution.setVariable("experience", a1);

		LOGGER.info("\n-----------------------------------------------");
		LOGGER.info("\n PersonName : " + execution.getVariable("personName") + "\n Experience : "
				+ experience + "\nCondition : " + a1);
		if (experience == 0) 
			LOGGER.info("\nInterviewer Rejected");
		else
			LOGGER.info("\nCall for Interview");
	}
}