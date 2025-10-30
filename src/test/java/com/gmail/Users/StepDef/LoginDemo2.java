package com.gmail.Users.StepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.gmail.Users.Pages.UserInteraction3;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo2 {
    
	WebDriver driver = Hooks.driver;
	ExtentTest test=Hooks.test;
	UserInteraction3 userinteraction;
	
	
	@Given("I navigate to login page")
	public void i_navigate_to_login_page() {
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		userinteraction=new UserInteraction3(driver,test);
		//driver=userinteraction.getDriver();
	}
	
	@When("I entered {string} and {string}")
	public void i_entered_and(String string, String string2) {
		
		userinteraction.getUsername(string);
		userinteraction.getPassword(string2);
		
//		WebElement username=driver.findElement(By.name("userName"));
//		username.sendKeys(string);
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys(string2);
		
	}
	
	@Then("Its navigated to the home page {string}")
	public void its_navigated_to_the_home_page(String expectedResult) {
//		if(expectedResult.equals("Login Successfully")) {
//			System.out.println("Login Successfully");
//			WebElement logintext=driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
//			Assert.assertEquals(logintext.getText(),"Login Successfully");
//		}else if(expectedResult.equals("Enter your userName and password correct")) {
//			System.out.println("No Login Successfully");
//			WebElement errtext=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
//			Assert.assertEquals(errtext.getText(),"Enter your userName and password correct");
//		}	
	
//		boolean result=userinteraction.run(expectedResult);
//		Assert.assertTrue(result);
		
		try {
			boolean result=userinteraction.run(expectedResult);
    	    Assert.assertTrue(result);
    	    System.out.println("Success..");
    	} catch (AssertionError ae) {
    	    System.out.println("Failure... Assertion failed: ");
    	}
		
	}
	
	@Then("Itas navigated to the error msg")
	public void itas_navigated_to_the_errorpage() {
		System.out.println("Login failed..........");
		WebElement logintext=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		
		Assert.assertEquals(logintext.getText(),"Enter your userName and password correct");
	}
    

	@And("I clicked signin button")
	public void i_clicked_signin_button() {
		userinteraction.getSubmitBtn();
	}

	@When("I entered following details")
	public void i_entered_following_details(DataTable dataTable) {
	    List<List<String>> ele=dataTable.cells();
	    
	    for(int i=1;i<ele.size();i++) {
	    	String user=ele.get(i).get(0);
		    String pwd=ele.get(i).get(1);
		    
		    userinteraction.getUsername(user);
		    userinteraction.getPassword(pwd);			
	    }    
	}
	
	@When("I insert {string} and {string}")
	public void i_insert_and(String unm, String pwd) {
		userinteraction.getUsername(unm);
		userinteraction.getPassword(pwd);	
	}



}
