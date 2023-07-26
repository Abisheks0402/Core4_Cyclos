package runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;


@io.cucumber.testng.CucumberOptions(
		features="Feature/cyclos.feature",
		glue= {"stepdefinition"}
	//	monochrome=true
		)

public class cyclos extends AbstractTestNGCucumberTests {

	
}
