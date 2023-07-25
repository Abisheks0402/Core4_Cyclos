package runner;


 

import io.cucumber.testng.AbstractTestNGCucumberTests;

 

@io.cucumber.testng.CucumberOptions(

features={"C:\\Users\\rmaruthamuthu\\eclipse-workspace\\Core4projectt\\src\\test\\resources\\Features\\Module3\\paymentToSystem.feature",


},


//feature file path

glue={"stepdef3"},

plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},



monochrome=true

 

)



 
public class runnerclass extends AbstractTestNGCucumberTests {
	

}
