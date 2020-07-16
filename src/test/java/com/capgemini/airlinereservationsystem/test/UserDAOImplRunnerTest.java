package com.capgemini.airlinereservationsystem.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "feature", glue= {"UserRegistrationSteps,UserLoginSteps,UserRegistrationByAdminSteps"}, plugin={"pretty","html:target/cucumber-reports"})
public class UserDAOImplRunnerTest {

}


