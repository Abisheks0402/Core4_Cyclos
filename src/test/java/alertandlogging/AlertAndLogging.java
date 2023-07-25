package alertandlogging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import repo.alertandloggingrepo;
import repo.alertandloggingrepo;

public class AlertAndLogging {
public static WebDriver driver;
@Given("User should login and click the market place")
public void user_should_login_and_click_the_market_place() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	PageFactory.initElements(driver,alertandloggingrepo.class);
	driver.get("https://demo.cyclos.org/ui/login");
	Thread.sleep(10);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.username));
	alertandloggingrepo.username.sendKeys("demo");

	alertandloggingrepo.password.sendKeys("1234");
	
  alertandloggingrepo.submit.click();
  Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.marketplace));
alertandloggingrepo.marketplace.click();


    
}

@When("User should click the advertisement link")
public void user_should_click_the_advertisement_link() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.advertisement));
	alertandloggingrepo.advertisement.click();
    
}

@When("User should click the show advertisement icon")
public void user_should_click_the_show_advertisement_icon() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.showad));
	alertandloggingrepo.showad.click();
    
}

@When("User shoul click the food menu")
public void user_shoul_click_the_food_menu() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.food));
    alertandloggingrepo.food.click();
}

@When("User should click the ask a question tab")
public void user_should_click_the_ask_a_question_tab() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.askaquestion));
    alertandloggingrepo.askaquestion.click();
}

@Then("User should enter the question and click submit")
public void user_should_enter_the_question_and_click_submit() {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( alertandloggingrepo.question));
	alertandloggingrepo.question.sendKeys("how much?");
	alertandloggingrepo.submitbtn.click();
    
}
}
