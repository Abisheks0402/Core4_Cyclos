package stepdef3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import repo.paymentrepo;

public class Paymenttosystem {
	 public static WebDriver driver;

@Given("User should navigate to the login page and give the valid credentials and proceed")
public void user_should_navigate_to_the_login_page_and_give_the_valid_credentials_and_proceed() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	PageFactory.initElements(driver,paymentrepo.class);
	driver.get("https://demo.cyclos.org/ui/login");
}


	

	@Given("User should click the Banking Menu and Payment to System")
	public void user_should_click_the_banking_menu_and_payment_to_system() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.username));
		paymentrepo.username.sendKeys("demo");
	
		paymentrepo.password.sendKeys("1234");
		
		paymentrepo.submit.click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf( paymentrepo.bankingbtn));
			paymentrepo.bankingbtn.click();
			wait.until(ExpectedConditions.visibilityOf( paymentrepo.pspaymenttosystem));
			paymentrepo.pspaymenttosystem.click();
			

	}

	@When("User should click the scheduled option")
	public void user_should_click_the_scheduled_option() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.psamount));
paymentrepo.psamount.sendKeys("1233");
		paymentrepo.psdropdown.click();
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.psscheduled));
		paymentrepo.psscheduled.click();
		
	}



	@When("user should enter the date")
	public void user_should_enter_the_date() {
paymentrepo.psDate.sendKeys("20112023");
	}
	@When("User should give the description if needed")
	public void user_should_give_the_description_if_needed() {
	   System.out.println("no");
	}

	@When("User should click the next button and proceed")
	public void user_should_click_the_next_button_and_proceed() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
paymentrepo.psNextbutton.click();
Thread.sleep(4000);
wait.until(ExpectedConditions.visibilityOf( paymentrepo.Pscnfrmbtn));
paymentrepo.Pscnfrmbtn.click();

	}
	@When("User should click the scheduled option first")
	public void user_should_click_the_scheduled_option_first() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.psamount));
		paymentrepo.psamount.sendKeys("1233234");
		paymentrepo.psdropdown.click();
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.psscheduled));
		paymentrepo.psscheduled.click();

	}

	@When("user should enter the date and description")
	public void user_should_enter_the_date_and_description() {
	    // Write code here that turns the phrase above into concrete actions
		paymentrepo.psDate.sendKeys("20112023");
	}

	@When("User should click the next button")
	public void user_should_click_the_next_button() {
		paymentrepo.psNextbutton.click();
		
		
	ExtentCucumberAdapter.addTestStepLog(Status.PASS + "Payment is Successful");	
	}
	
	

}
