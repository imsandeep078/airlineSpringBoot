package com.capgemini.airlinereservationsystem.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "feature", glue= {"AirlineExecutiveSteps"}, plugin={"pretty","html:target/cucumber-reports"})
public class AirlineExecutiveDAOImpl {
	
}
