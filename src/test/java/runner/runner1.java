package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\parajappa\\eclipse-workspace\\PilotProjectPr\\features\\User.feature",

glue = {"stepdef" }
)
public class runner1 {

}


