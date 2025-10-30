package com.gmail.Users.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;

public class LoginDemo {


	
	@And("I entered username and password")
	public void i_entered_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("correct credentials");
	}
	@And("I entered correct username")
	public void i_entered_correct_username() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("correct username entered");
	}
	
	@Then("Itas navigated to the HomePage")
	public void itas_navigated_to_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("homepage opened");
	}
	@But("Invalid pwd")
	public void invalid_pwd() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("wrong pwd entered");
	}
	


 
}
