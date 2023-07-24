package com.Cyclos_Core_Four_RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\rpanyam\\eclipse-workspace\\Cyclos_Core_Four\\src\\test\\resources\\FeatureFiles\\AccountInformation\\AccountInfo.feature", glue = {
		"com.Cyclos_Core_Four_StepDefinitions" }, dryRun = false, monochrome = true, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "pretty" })


public class AccInfoRunner {

}
