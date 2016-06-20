package com.dexter.sample.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "stepDefinition" }, monochrome = true, format = { "html:Report",
		"pretty", "json:JSON-Report/cucumber.json" })
public class TestRunner {

}
