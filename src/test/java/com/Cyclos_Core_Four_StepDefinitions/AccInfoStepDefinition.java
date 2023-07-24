package com.Cyclos_Core_Four_StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.Cyclos_Core_Four_StepDefinitions.*;

public class AccInfoStepDefinition {
	public static WebDriver driver;

	@Before
	public void config() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("User login into Cyclos")
	public void user_login_into_cyclos() throws InterruptedException {
		driver.get("https://demo.cyclos.org/ui/login");
		PageFactory.initElements(driver, AccInfoRepo.class);
		Thread.sleep(3000);
		AccInfoRepo.username.sendKeys("demo");
		AccInfoRepo.password.sendKeys("1234");

		AccInfoRepo.loginSubmit.click();

	}

	@Then("user should click on banking")
	public void user_should_click_on_banking() throws InterruptedException {
		PageFactory.initElements(driver, AccInfoRepo.class);
//		Thread.sleep(3000);
		AccInfoRepo.banking.click();
		
	}

//	@Then("User should click on banking")
//	public void user_should_click_on_banking() {
	
//	}

	@Then("check the memberAccount")
	public void check_the_member_account() {
		PageFactory.initElements(driver, AccInfoRepo.class);
		AccInfoRepo.balanceinfo.click();
		
	}

	@Given("Goto the banking menu")
	public void goto_the_banking_menu() {

	}

	@Then("check member account balance")
	public void check_member_account_balance() {

	}

	@Given("User click on banking menu")
	public void user_click_on_banking_menu() {

	}

	@When("click on notifications")
	public void click_on_notifications() {

	}

	@Then("able to see payment history")
	public void able_to_see_payment_history() {

	}

	@Given("user able click on banking menu")
	public void user_able_click_on_banking_menu() {

	}

	@Then("should click payment to users")
	public void should_click_payment_to_users() {

	}

	@Then("select one user from userlist and select a user")
	public void select_one_user_from_userlist_and_select_a_user() {

	}

	@Then("Enter amount")
	public void enter_amount() {

	}

	@Then("click anyOption from Scheduling")
	public void click_any_option_from_scheduling() {

	}

	@Then("click on Next button")
	public void click_on_next_button() {

	}

	@Then("click on confirm")
	public void click_on_confirm() {

	}

	@Then("click on print to download")
	public void click_on_print_to_download() {

	}

	@Given("User Should click on Banking Menu")
	public void user_should_click_on_banking_menu() {

	}

	@Given("click the showfilter button")
	public void click_the_showfilter_button() {

	}

	@Given("select a user from userlist")
	public void select_a_user_from_userlist() {

	}

	@Then("click on period menu and select any opton")
	public void click_on_period_menu_and_select_any_opton() {

	}

	@Then("select description and enter content")
	public void select_description_and_enter_content() {

	}

	@Then("click on from amout and enter value")
	public void click_on_from_amout_and_enter_value() {

	}

	@Then("click on to amount and enter value")
	public void click_on_to_amount_and_enter_value() {

	}

	@Then("click on filter and select one option")
	public void click_on_filter_and_select_one_option() {

	}

	@Then("click on transaction number and enter value")
	public void click_on_transaction_number_and_enter_value() {

	}

	@Then("click on direction and select one option")
	public void click_on_direction_and_select_one_option() {

	}

	@Then("click on orderby and select one option")
	public void click_on_orderby_and_select_one_option() {

	}

	@Given("should be able to click on banking menu")
	public void should_be_able_to_click_on_banking_menu() {

	}

	@When("click a user from Account summary")
	public void click_a_user_from_account_summary() {

	}

	@Then("payment details should be display")
	public void payment_details_should_be_display() {

	}

	@Given("user able to click banking menu")
	public void user_able_to_click_banking_menu() {

	}

	@When("click any user from 	account summary")
	public void click_any_user_from_account_summary() {

	}

	@Then("print the transferDetails")
	public void print_the_transfer_details() {

	}

}
