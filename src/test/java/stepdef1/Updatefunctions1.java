package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Updatefunctions1 {

	public static WebDriver driver;

	@Before
	public static void config() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("Launch the Application")
	public void launch_the_application() {
		driver.get("https://demo.cyclos.org/ui/login");
		PageFactory.initElements(driver, UserRepository.class);
		// WebDriverWait wait = new WebDriverWait(driver, 30);
	}

	@Given("Enter User Name")
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

	@Then("Click profile and click Edit")
	public void click_profile_and_click_edit() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.profile));
		UserRepository.profile.click();
		wait.until(ExpectedConditions.visibilityOf(UserRepository.edit));
		UserRepository.edit.click();
	}

	@Then("Enter Address")
	public void enter_address() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.addressRegion));
		UserRepository.addressRegion.clear();
		UserRepository.addressRegion.sendKeys("Karnataka");

	}

	@When("Enter email")
	public void enter_email() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.email));
		UserRepository.email.clear();
		UserRepository.email.sendKeys("rpk62@gmail.com");
	}

	@When("Enter City")
	public void enter_city() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.city));
		UserRepository.city.clear();
		UserRepository.city.sendKeys("Bangalore");
	}

	@Then("Click Save")
	public void click_save() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.save1));
		UserRepository.save1.click();
	}
	// 2

	@Given("User should click on edit button")
	public void user_should_click_on_edit_button() {
		driver.get("https://demo.cyclos.org/ui/login");
		UserRepository.username.sendKeys("Praju");
		UserRepository.userpassword.sendKeys("Praju@113$");
		UserRepository.edit1.click();
	}

	@Given("click on Add address button")
	public void click_on_add_address_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.Addaddress));
		UserRepository.Addaddress.click();

	}

	@Then("click on name text field")
	public void click_on_name_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.AddaddressName));
		UserRepository.AddaddressName.click();

	}

	@Then("enter the valid name")
	public void enter_the_valid_name() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.AddaddressName));
		UserRepository.AddaddressName.sendKeys("XYZ");
	}

	@Then("click on Address line1 text field")
	public void click_on_address_line1_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.Addaddressline1));
		UserRepository.Addaddressline1.click();

	}

	@Then("enter the valid Address line1")
	public void enter_the_valid_address_line1() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.Addaddressline1));
		UserRepository.Addaddressline1.sendKeys("ABC");
	}

	@Then("Click on city text field")
	public void click_on_city_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.city1));
		UserRepository.city1.click();
	}

	@Then("enter the valid city")
	public void enter_the_valid_city() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.city1));
		UserRepository.city1.sendKeys("Coimbatore");
	}

	@Then("Click on Zipcode text field")
	public void click_on_zipcode_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.Zipcode));
		UserRepository.Zipcode.click();
	}

	@Then("enter the valid Zipcode")
	public void enter_the_valid_zipcode() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.Zipcode));
		UserRepository.Zipcode.sendKeys("641037");
	}

	@And("click on save button")
	public void click_on_save_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.save1));
		UserRepository.save1.click();

	}

	// 3
	@Given("User should click on AddMobile phone button")

	public void user_should_click_on_add_mobile_phone_button() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.save1));
		UserRepository.AddMobilePhones.click();
	}

	@Then("click on Mobile phone name text field")
	public void click_on_mobile_phone_name_text_field() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.save1));
		UserRepository.AddMobilePhones.click();
	}

	@Then("enter valid Mobile phone name")
	public void enter_valid_mobile_phone_name() throws InterruptedException {
		// UserRepository.AddMobilename1.click();
		Thread.sleep(3000);
		UserRepository.MobilePhonename.sendKeys("rubann");

	}

	@Then("click on Mobile phone number text field")
	public void click_on_mobile_phone_number_text_field() {

	}

	@Then("enter valid Mobile phone number")
	public void enter_valid_mobile_phone_number() {

	UserRepository.AddMobilenumber.click();
	UserRepository.AddMobilenumber.sendKeys("(651) 334-5898");
	UserRepository.save1.click();
	}

	@Then("click on Add Multiple Phone button")
	public void click_on_add_multiple_phone_button() {
		UserRepository.save1.click();
	}
	

	// 4
	@Given("Click on Profile button")
	public void click_on_profile_button1() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.profile1));
		driver.get("https://demo.cyclos.org/ui/login");
		UserRepository.username.sendKeys("Praju");
		UserRepository.userpassword.sendKeys("Praju@143$");
		UserRepository.profile1.click();
		Thread.sleep(3000);

	}

	@Given("Click on passwor")
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
		UserRepository.oldpassword.sendKeys("ruban@1234");
		Thread.sleep(3000);

	}

	@Then("enter the valid password in new password text field")
	public void enter_the_valid_password_in_new_password_text_field() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.newpassword));
		UserRepository.newpassword.sendKeys("ruban@1234");
		Thread.sleep(3000);

	}

	@Then("enter the valid password in password confirmation text field")
	public void enter_the_valid_password_in_password_confirmation_text_field() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.againnewpassword));
		UserRepository.againnewpassword.sendKeys("ruban@1234");
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
		driver.get("https://demo.cyclos.org/ui/login");
		UserRepository.username.sendKeys("Praju");
		UserRepository.userpassword.sendKeys("Praju@143$");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.profile3));
		UserRepository.profile3.click();
		Thread.sleep(3000);

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
		driver.get("https://demo.cyclos.org/ui/login");
		UserRepository.username.sendKeys("Praju");
		UserRepository.userpassword.sendKeys("Praju@143$");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(UserRepository.profile4));
		UserRepository.profile4.click();
		Thread.sleep(3000);

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
