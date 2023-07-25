package stepdef3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import helper.helperclass;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

import repo.paymentrepo;

public class PaymentRequest {
	WebDriver driver;
	@Given("User should give the valid credentials and login to the application")
	public void user_should_give_the_valid_credentials_and_login_to_the_application() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,paymentrepo.class);
		driver.get("https://demo.cyclos.org/ui/login");
		Thread.sleep(10);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.username));
		paymentrepo.username.sendKeys(helperclass.Username);
	
		paymentrepo.password.sendKeys("1234");
		
		paymentrepo.submit.click();
	}

	@Given("User should click the Payment Request Button and proceed")
	public void user_should_click_the_payment_request_button_and_proceed() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.bankingbtn));
		paymentrepo.bankingbtn.click();
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.paymentrequestButton));
	
	    paymentrepo.paymentrequestButton.click();
//	    wait.until(ExpectedConditions.visibilityOf( paymentrepo.PUSendAnewREquest));
//	    paymentrepo.PUSendAnewREquest.click();
	}

	@Given("user should click the send a new request menu")
	public void user_should_click_the_send_a_new_request_menu() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf( paymentrepo.PUSendAnewREquest));
		    paymentrepo.PUSendAnewREquest.click();
	}

	@Given("User Should Enter a amount value")
	public void user_should_enter_a_amount_value() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
	   wait.until(ExpectedConditions.visibilityOf(paymentrepo.PUcontactlist));
	   paymentrepo.PUcontactlist.click();
	   Thread.sleep(4000);
	   wait.until(ExpectedConditions.visibilityOf( paymentrepo.PUcontactlist));
	   paymentrepo.Pucontactselect.click();
	   wait.until(ExpectedConditions.visibilityOf( paymentrepo.PUamount));
	   paymentrepo.PUamount.sendKeys("111");
	   
	}

	@Given("User should enter a date")
	public void user_should_enter_a_date() {
		paymentrepo.PUdate.sendKeys("22092024");
	    	}

	@Given("User should Select dropdown and select Monthly Installment")
	public void user_should_select_dropdown_and_select_monthly_installment() throws InterruptedException {
		Thread.sleep(5000);
	   paymentrepo.pudropdownselect.click();
	   WebDriverWait wait = new WebDriverWait(driver, 30);
	   wait.until(ExpectedConditions.visibilityOf(paymentrepo.PumonthlyInstalllment));
	   paymentrepo.PumonthlyInstalllment.click();
	}

	@Given("User should ghive number of installment")
	public void user_should_ghive_number_of_installment() {
	    paymentrepo.punumberofinstallment.sendKeys("9");
	}

	@Given("User should fill discription if needed and click the next button")
	public void user_should_fill_discription_if_needed_and_click_the_next_button() {
	   
	}

	@Given("User should accept the popup")
	public void user_should_accept_the_popup() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		   wait.until(ExpectedConditions.visibilityOf(paymentrepo.puconfirmButton));

	   paymentrepo.puconfirmButton.click();
	   wait.until(ExpectedConditions.visibilityOf(paymentrepo.AlertConfirm));
	   paymentrepo.AlertConfirm.click();
	   wait.until(ExpectedConditions.visibilityOf(paymentrepo.Putxt));
	   String Espected =paymentrepo.Putxt.getText();
	   String Actual="The payment request was successfully sent";
	System.out.println(Espected);
	  
	   
	   
	}

	}
