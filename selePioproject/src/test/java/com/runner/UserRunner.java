package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "C:\\Users\\PRAJWAL A R\\eclipse-workspace\\selePioproject\\features\\User.feature",
		tags="@tag1",
		glue = { "com.StepDef" })

public class UserRunner {

}
