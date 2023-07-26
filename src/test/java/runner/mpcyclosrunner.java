package runnerfiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="Feature/mpcyclos.feature",
		glue= {"stepdefinition"}
	//	monochrome=true
	//	plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","pretty"}
		)

public class mpcyclosrunner extends AbstractTestNGCucumberTests {

}
