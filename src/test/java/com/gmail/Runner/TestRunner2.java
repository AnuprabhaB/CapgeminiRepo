package com.gmail.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features="./src/test/java/com/gmail/Users/Features/login.feature",
		features="./src/test/java/com/gmail/Users/Features/login2.feature",
		glue="com.gmail.Users.StepDef",
		//tags=("@TC1 or @TC2")
		tags="@TC4",
		plugin = {"pretty", "html:Reports/cucumber-reports.html"}
)


public class TestRunner2 extends AbstractTestNGCucumberTests{

}
