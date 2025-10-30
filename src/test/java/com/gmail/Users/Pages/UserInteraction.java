package com.gmail.Users.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction {

	private WebDriver driver;
	private ExtentTest test;

	public UserInteraction(WebDriver driver,ExtentTest test) {
	  this.driver=driver;
	  this.test=test;
	}

//	public WebDriver getDriver() {
//		return driver;
//	}
//	public void setUp() {
//		driver =new ChromeDriver();
//		driver.get("https://demo.guru99.com/test/newtours/");
//	}
	
	public void getUsername(String unm) {
		 WebElement username=driver.findElement(By.name("userName"));
		 username.sendKeys(unm);
	}
	
	public void getPassword(String pass) {
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys(pass);
	}
	
	public void getSubmitBtn() {
		WebElement submit=driver.findElement(By.name("submit"));
		submit.click();
	}
	
	
}
