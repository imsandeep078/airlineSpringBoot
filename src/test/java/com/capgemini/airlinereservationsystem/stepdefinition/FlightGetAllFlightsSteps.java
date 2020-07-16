package com.capgemini.airlinereservationsystem.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightGetAllFlightsSteps {

	@Given("^Open the browser$")
	public void openTheBrowser() throws Throwable{
		System.out.println("Open the browser");
	}
	@When("^Fill necessary details$")
	public void fillInDetails() throws Throwable {
		System.out.println("Fill necessary details");
	}
	@Then("^Get all flight information$")
	public void getFlightDetails() throws Throwable {
		System.out.println("Get all your flight information");
	}
}
