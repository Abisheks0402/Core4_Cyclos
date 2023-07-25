package stepdef7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import repo.GiftVoucherRepo;
import repo.paymentrepo;


public class GiftVoucher {
	public static WebDriver driver;
	@Given("User  should login using valid credentials given")
	public void user_should_login_using_valid_credentials_given() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		PageFactory.initElements(driver,GiftVoucherRepo.class);
		driver.get("https://demo.cyclos.org/ui/login");
		Thread.sleep(10);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.username));
		GiftVoucherRepo.username.sendKeys("demo");
	
		GiftVoucherRepo.password.sendKeys("1234");
		
	  GiftVoucherRepo.submit.click();


	}

	@Given("User should click Market place and My voucher Menu")
	public void user_should_click_market_place_and_my_voucher_menu() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.marketplace));
	  GiftVoucherRepo.marketplace.click();

	  wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.myVouchers));
	  GiftVoucherRepo.myVouchers.click();

	}


	@Given("User should click a displayed voucher")
	public void user_should_click_a_displayed_voucher() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.voucher));
	  GiftVoucherRepo.voucher.click();
	  

	}

	@When("User should click the print button and print")
	public void user_should_click_the_print_button_and_print() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.print));
GiftVoucherRepo.print.click();
	}

	@When("User should check the printed voucher")
	public void user_should_check_the_printed_voucher() {
	  System.out.println("printed");

	}

	@Given("User should click a voucher button1")
	public void user_should_click_a_voucher_button1() {
	  
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.buyavoucher));
		GiftVoucherRepo.buyavoucher.click();
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.cinemavoucher));
		GiftVoucherRepo.cinemavoucher.click();
	}

	@Given("User should fill the form and click the next button")
	public void user_should_fill_the_form_and_click_the_next_button() {
	  
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.numberofvoucher));
		 GiftVoucherRepo.numberofvoucher.sendKeys("1");
		 	GiftVoucherRepo.amount.sendKeys("11");
		 	GiftVoucherRepo.nextbutton.click();
			wait.until(ExpectedConditions.visibilityOf( GiftVoucherRepo.msg));
		 	System.out.println(GiftVoucherRepo.msg.getText());
	}



}
