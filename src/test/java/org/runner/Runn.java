package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\HotelBooking.feature"},glue="org.stepdef",monochrome=true)
public class Runn {
	

}
