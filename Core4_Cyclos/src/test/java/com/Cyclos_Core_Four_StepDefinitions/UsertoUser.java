package com.Cyclos_Core_Four_StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import Repositories.paymentrepo;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Repositories.paymentrepo;

public class UsertoUser {
public static WebDriver driver;
	
	

	@Given("User Should  navigate to the login page")
	public void user_should_navigate_to_the_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,paymentrepo.class);
		driver.get("https://demo.cyclos.org/ui/login");

	}

	@When("User should submit username and password and login to the application")
	public void user_should_submit_username_and_password_and_login_to_the_application() {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.username));
		paymentrepo.username.sendKeys("demo");
	
		paymentrepo.password.sendKeys("1234");
		
		paymentrepo.submit.click();

	}

	@When("User should click the Banking Menu and Payment to user")
	public void user_should_click_the_banking_menu_and_payment_to_user() {
		PageFactory.initElements(driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.bankingbtn));
		paymentrepo.bankingbtn.click();
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.paymentUserbtn));
		paymentrepo.paymentUserbtn.click();

	}

	@When("Click the contact and select a contact")
	public void click_the_contact_and_select_a_contact() {
		PageFactory.initElements(driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.contactlistbtn));
		
		paymentrepo.contactlistbtn.click();
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.selectuser));
		paymentrepo.selectuser.click();

	}

	@Given("User should enter the valid amount")
	public void user_should_enter_the_valid_amount() {
		PageFactory.initElements(driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.amountfield));
		paymentrepo.amountfield.sendKeys("500");

	}

	@When("User Should select Paynow Option From the Dropdown")
	public void user_should_select_paynow_option_from_the_dropdown() {
System.out.println("PayNow Option clicked");

	}

	@When("User Should type Description1 if needed")
	public void user_should_type_description1_if_needed() {

		PageFactory.initElements( driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( paymentrepo.amountdescrfield));
paymentrepo.amountdescrfield.sendKeys("no");
	}

	@Then("User Should click the next button and confirm button in the next Page and check the payment info1")
	public void user_should_click_the_next_button_and_confirm_button_in_the_next_page_and_check_the_payment_info1() {
		PageFactory.initElements( driver,paymentrepo.class);
	    paymentrepo.nxtbtn.click();
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOf( paymentrepo.confrimpaybtn));
	    paymentrepo.confrimpaybtn.click();
	   
	   

	}

	@Given("User should enter the invalid amount")
	public void user_should_enter_the_invalid_amount() {
		PageFactory.initElements(driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( paymentrepo.amountfield));
		paymentrepo.amountfield.sendKeys("50000");

	}

	@When("User Should select  Option From the Dropdown")
	public void user_should_select_option_from_the_dropdown() {
		System.out.println("PayNow Option clicked");


	}

	@When("User Should type Description2 if needed")
	public void user_should_type_description2_if_needed() {
		PageFactory.initElements( driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( paymentrepo.amountdescrfield));
paymentrepo.amountdescrfield.sendKeys("no");

	}

	@Then("User Should click the next button and confirm button in the next Page and	check the payment info2")
	public void user_should_click_the_next_button_and_confirm_button_in_the_next_page_and_check_the_payment_info2() {
		PageFactory.initElements( driver,paymentrepo.class);
		WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.visibilityOf( paymentrepo.amountdescrfield));
paymentrepo.amountdescrfield.sendKeys("no");

	}
}	

	