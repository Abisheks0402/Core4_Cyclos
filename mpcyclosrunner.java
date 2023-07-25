package runnerfiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Feature/mpcyclos.feature",
		glue= {"stepdefinition"}
	//	monochrome=true
		)

public class mpcyclosrunner {

}
