package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class cyclosdef {
	
	public static WebDriver driver;
    @Before
    public void config()
    {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.cyclos.org/ui/login");
    }
    
	@Given("User verifying and validating the user and password")
	public void user_verifying_and_validating_the_user_and_password() {
	   PageFactory.initElements(driver, cyclosrepo.class);
	   cyclosrepo.user.sendKeys("demo");
	   cyclosrepo.pswrd.sendKeys("1234");
	   cyclosrepo.submit.click();
	}

	@When("User verify the “Message” icon and {string}")
	public void user_verify_the_Message_icon_and(String string) throws InterruptedException {
		PageFactory.initElements(driver, cyclosrepo.class);
		cyclosrepo.msg.click();
		cyclosrepo.newmsg.click();
		
		
		cyclosrepo.sent.click();
		driver.findElement(By.linkText("//a[contains(text(),'User')]")).click();
	}

	@When("User choose User in {string} dropdown")
	public void user_choose_User_in_dropdown(String string) {
		PageFactory.initElements(driver, cyclosrepo.class);
	    driver.findElement(By.linkText("//a[contains(text(),'User')]")).click();
	}

	@Then("User give the name of the contact to the {string}")
	public void user_give_the_name_of_the_contact_to_the(String string) {
		PageFactory.initElements(driver, cyclosrepo.class);
		cyclosrepo.contactlist.click();
		driver.findElement(By.linkText("Car repair")).click();
	}

	@Then("User verify the {string}")
	public void user_verify_the(String string) {
		PageFactory.initElements(driver, cyclosrepo.class);
		cyclosrepo.sub.sendKeys("To rapair the car");
	}

	@Then("User give some words to the description and verify the {string} button")
	public void user_give_some_words_to_the_description_and_verify_the_button(String string) {
		PageFactory.initElements(driver, cyclosrepo.class);
		cyclosrepo.sub.sendKeys("Car is flooded");
		cyclosrepo.sndbtn.click();
	}


}
