package com.Cyclos_Core_Four_RunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles//Payment//UsertoUser.feature",
glue = {"com.Cyclos_Core_Four_StepDefinitions" }

)
public class AccInfoRunner {

}
