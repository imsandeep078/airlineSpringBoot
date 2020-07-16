package com.capgemini.airlinereservationsystem.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "feature", glue= {"FlightAddFlightSteps,FlightDeleteFlightsSteps,FlightGetAllAirportsSteps,FlightGetAllFlightSteps,FlightGetFlightSteps,FlightSearchFlightSteps,FlightUpdateFlightSteps"}, plugin={"pretty","html:target/cucumber-reports"})
public class FlightDAOImplRunnerTest {

}
