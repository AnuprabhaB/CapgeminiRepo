package com.gmail.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="./src/test/java/com/gmail/Users/Features/login.feature",
		features="./src/test/java/com/gmail/Users/Features/login2.feature",
		glue="com.gmail.Users.StepDef",
		//tags=("@TC1 or @TC2")
		tags="@TC4",
		plugin = {"pretty", "html:Reports/cucumber-reports.html"}
	)


public class TestRunner {
	

}
