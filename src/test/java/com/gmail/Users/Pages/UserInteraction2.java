package com.gmail.Users.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class UserInteraction2 {
	
	private WebDriver driver;
	private ExtentTest test;

	public UserInteraction2(WebDriver driver,ExtentTest test) {
	  this.driver=driver;
	  this.test=test;
	  PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[normalize-space()='REGISTER']") private WebElement reglink;
	@FindBy(xpath="//input[@name='firstName']")private WebElement firstnm;
	@FindBy(xpath="//input[@name='lastName']")private WebElement lastnm;
	@FindBy(xpath="//input[@name='phone']")private WebElement phone;
	@FindBy(xpath="//input[@id='userName']")private WebElement email;
	@FindBy(xpath="//input[@id='email']")private WebElement usernm;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//input[@name='confirmPassword']")private WebElement confirmpassword;
	@FindBy(xpath="//input[@name='submit']")private WebElement submit;
	
	public void clickregbtn() {
		reglink.click();
	}
	public void enterFirstname(String fname) {
		firstnm.sendKeys(fname);	
	}
	
	public void enterLastname(String lname) {
		lastnm.sendKeys(lname);	
	}
	
	public void enterPhone(String phn) {
		phone.sendKeys(phn);	
	}
	
	public void enterEmail(String emil) {
		email.sendKeys(emil);	
	}
	
	public void enterUsername(String user) {
		usernm.sendKeys(user);	
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);	
	}
	
	public void enterConfirmPass(String cpass) {
		confirmpassword.sendKeys(cpass);	
	}
	
	public void clickSubmit() {
		submit.click();
	}
	
	
	
	

}
