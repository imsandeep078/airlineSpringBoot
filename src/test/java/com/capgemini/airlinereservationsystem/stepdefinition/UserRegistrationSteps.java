package com.capgemini.airlinereservationsystem.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserRegistrationSteps {

	@Given("^Open the browser$")
	public void openTheBrowser() throws Throwable {
		System.out.println("Open the browser");
	}
	@When("^Fill necessary details$")
	public void fillInDetails() throws Throwable {
		System.out.println("Fill necessary details");
	}
	@Then("^Register as user$")
	public void resgisterIt() throws Throwable {
		System.out.println("Please register");
	}
}
