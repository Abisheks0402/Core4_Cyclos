package com.StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.repo.UserRepository;

//import FirstModule.UserRepository;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userStepDefinition {

	public static WebDriver driver;

	@Before

	public static void config() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Given("Launch the Application")
	public void launch_the_application() throws InterruptedException {

		driver.get("https://demo.cyclos.org/ui/login");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, UserRepository.class);
	}

	@And("Enter User Name")

	public void enter_user_name() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.username));
		UserRepository.username.click();
		UserRepository.username.sendKeys("Praju");
	}

	@When("Enter Password")
	public void enter_password() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.userpassword));
		UserRepository.userpassword.click();
		UserRepository.userpassword.sendKeys("Praju@113$");
		UserRepository.Submit.click();

	}

	@Then("Click profile")
	public void click_profile(){
		UserRepository.profile.click();
	}
	
	
// First
	@Given("click Edit")
	public void click_edit() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.edit));
		PageFactory.initElements(driver,UserRepository.class);
		UserRepository.edit.click();
	}
	
	@Given("RemoveOldAddress Name")
	public void remove_old_address_name() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.ClickRemove));
		UserRepository.ClickRemove.click();
	}
	
	@Given("Enter Name")
	public void enter_name() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.name1));
		UserRepository.name1.click();
		UserRepository.name1.sendKeys("Karnataka");
	}
	
	@When("Enter email")
	public void enter_email() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.email));
		UserRepository.email.clear();
		UserRepository.email.sendKeys("Powerstar@gmail.coM");
	}

	@And("Enter City")

	public void enter_city() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.city));
		Thread.sleep(3000);
		UserRepository.city.clear();
		Thread.sleep(3000);
		UserRepository.city.sendKeys("BangalorE");

	}

	@Then("Click Save")

	public void click_save() {

		// UserRepository.save.click();

	}

	@Given("User should click on edit button")

	public void user_should_click_on_edit_button() {

		// UserRepository.edit1.click();

	}

	@Given("click on Add address button")

	public void click_on_add_address_button() throws InterruptedException {
		Thread.sleep(3000);
		UserRepository.Addaddress.click();

	}

	@Then("click on name text field")

	public void click_on_name_text_field() {

		// UserRepository.AddaddressName.click();

	}

	@Then("enter the valid name")

	public void enter_the_valid_name() throws InterruptedException {
		Thread.sleep(3000);
		UserRepository.AddaddressName.sendKeys("rruubbann");

	}

	@Then("click on Address line1 text field")

	public void click_on_address_line1_text_field() {

		// UserRepository.Addaddressline1.click();

	}

	@Then("enter the valid Address line1")

	public void enter_the_valid_address_line1() throws InterruptedException {
		Thread.sleep(3000);
		UserRepository.Addaddressline1.sendKeys("No-31/tamba");

	}

	@Then("Click on city text field")

	public void click_on_city_text_field() {

		// UserRepository.city1.click();

	}

	@Then("enter the valid city")

	public void enter_the_valid_city() throws InterruptedException {
		Thread.sleep(3000);

		UserRepository.city1.sendKeys("CoimbE");

	}

	@Then("Click on Zipcode text field")

	public void click_on_zipcode_text_field() {

		// UserRepository.Zipcode.click();

	}

	@Then("enter the valid Zipcode")

	public void enter_the_valid_zipcode() throws InterruptedException {
		Thread.sleep(3000);

		UserRepository.Zipcode.sendKeys("600090");

	}

	@Then("click on save button")

	public void click_on_save_button() throws InterruptedException {
		Thread.sleep(3000);

		UserRepository.save3.click();

	}

	@Given("User should click on AddMobile phone button")

	public void user_should_click_on_add_mobile_phone_button() throws InterruptedException {
		UserRepository.addmobilephones.click();

	}

	@Then("click on Mobile phone name text field")

	public void click_on_mobile_phone_name_text_field() {

	}

	@Then("enter valid Mobile phone name")

	public void enter_valid_mobile_phone_name() throws InterruptedException {
		UserRepository.mobilephonename.sendKeys("riri");
		// UserRepository.save.click();

	}

	@Then("click on Mobile phone number text field")

	public void click_on_mobile_phone_number_text_field() {

	}

	@Then("enter valid Mobile phone number")

	public void enter_valid_mobile_phone_number() {

		UserRepository.mobilephoneno.sendKeys("(210) 555-0122");

	}

	@Then("click on Add Multiple Phone button")

	public void click_on_add_multiple_phone_button() {

		// UserRepository.save1.click();

	}

	@Given("Click on Profile button")
	public void click_on_profile_button1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.profile));
		UserRepository.profile.click();
		Thread.sleep(3000);
	}

	@Given("Click on password")
	public void click_on_password() throws InterruptedException {
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOf(UserRepository.password1));
		UserRepository.password1.click();
		Thread.sleep(3000);

	}

	@Then("click on Change button")
	public void click_on_change_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.changebutton));
		UserRepository.changebutton.click();
		Thread.sleep(3000);

	}

	@Then("enter the valid password in old password text field")
	public void enter_the_valid_password_in_old_password_text_field() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.oldpassword));
		UserRepository.oldpassword.sendKeys("Praju@113$");
		Thread.sleep(3000);

	}

	@Then("enter the valid password in new password text field")
	public void enter_the_valid_password_in_new_password_text_field() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.newpassword));
		UserRepository.newpassword.sendKeys("Praju@113$");
		Thread.sleep(3000);

	}

	@Then("enter the valid password in password confirmation text field")
	public void enter_the_valid_password_in_password_confirmation_text_field() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.againnewpassword));
		UserRepository.againnewpassword.sendKeys("Praju@113$");
		Thread.sleep(3000);

	}

	@Then("Click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.submit2));
		UserRepository.submit2.click();
		Thread.sleep(3000);

	}

	@Given("Click on the Profile button")
	public void click_on_the_profile_button() throws InterruptedException {
//	    WebDriverWait wait = new WebDriverWait(driver, 30);
//	    wait.until(ExpectedConditions.visibilityOf(UserRepository.profile3));
//	    UserRepository.profile3.click();
//	    Thread.sleep(3000);

	}

	@Then("Click on notification")
	public void click_on_notification() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.notification));
		UserRepository.notification.click();
		Thread.sleep(3000);
	}

	@Then("Click on unread checkbox")
	public void click_on_unread_checkbox() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.checkbox));
		UserRepository.checkbox.click();
		Thread.sleep(3000);

	}

	@Given("Click on profile button")
	public void click_on_profile_button() throws InterruptedException {
//	    WebDriverWait wait = new WebDriverWait(driver, 30);
//	    wait.until(ExpectedConditions.visibilityOf(UserRepository.profile4));
//	    UserRepository.profile4.click();
//	    Thread.sleep(3000);

	}

	@Then("Click on contacts")
	public void click_on_contacts() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.contacts));
		UserRepository.contacts.click();
		Thread.sleep(3000);

	}

	@Then("Click on list view")
	public void click_on_list_view() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.listview));
		UserRepository.listview.click();
		Thread.sleep(3000);

	}

}
