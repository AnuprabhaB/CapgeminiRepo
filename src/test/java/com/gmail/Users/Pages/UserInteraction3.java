package com.gmail.Users.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.gmail.Users.Config.Reports;

public class UserInteraction3 {

	private WebDriver driver;
	private WebDriverWait wait;
	ExtentTest test;
	
	public UserInteraction3(WebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="userName") private WebElement username;
	
	@FindBy(name="password") private WebElement password;
	
	@FindBy(name="submit") private WebElement submit;
	
	@FindBy(xpath="//h3[normalize-space()='Login Successfully']") private WebElement loginSuccess;
	
	@FindBy(xpath="//span[normalize-space()='Enter your userName and password correct']") private WebElement loginFail;
	
	public boolean getUsername(String unm) {
		boolean actResult=true;
		try {
			wait.until(ExpectedConditions.visibilityOf(username));
			Reports.generateReport(driver, test, Status.PASS, "Username found");
			username.sendKeys(unm);
			
		}catch(TimeoutException te) {
			actResult=false;
			Reports.generateReport(driver, test,Status.FAIL,"Username is not interacting.......");
		}
		
		return actResult;
	}
	
	public boolean getPassword(String pass) {

		boolean actResult=true;
		try {
			wait.until(ExpectedConditions.visibilityOf(password));
			Reports.generateReport(driver, test, Status.PASS, "Password found");
			password.sendKeys(pass);
			
		}catch(TimeoutException te) {
			actResult=false;
			Reports.generateReport(driver, test,Status.FAIL,"Password is not interacting.......");
		}
		return actResult;
	}
	
	public void getSubmitBtn() {
		submit.click();
	}
	
	public boolean run(String expectedResult) {
		boolean actResult = true;
		WebElement ele;
		if(expectedResult.equals("Login Successfully")) {
			 ele = driver.findElement(By.xpath("//h3[normalize-space()='Login Successfully']"));
		}else {
			ele=driver.findElement(By.xpath("//span[normalize-space()='Enter your userName and password correct']"));
		}
		
		try {
			wait.until(ExpectedConditions.visibilityOf(ele));
			if(ele.getText().matches("Login Successfully")){
	   			Reports.generateReport(driver, test, Status.PASS, "Valid User");
	   		 }
	   		 else
	   		 {
	   			actResult = false;
	            Reports.generateReport(driver, test, Status.FAIL, "Invalid Credentials");
	   		 }
		}catch (Exception te) {
            actResult = false;
            Reports.generateReport(driver, test, Status.FAIL, "Wait time exceeded...");
        }
		 
	   	 return actResult;
	    }
	
}
