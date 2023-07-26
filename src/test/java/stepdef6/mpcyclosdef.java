package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class mpcyclosdef {
	
	public static WebDriver driver;
   
	

@Given("click My Advertisement")
public void click_My_Advertisement() throws InterruptedException {
	
	 WebDriverManager.chromedriver().setup();
     driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("https://demo.cyclos.org/ui/login");
     
     PageFactory.initElements(driver, mpcyclosrepo.class);
	    mpcyclosrepo.user.sendKeys("Praju");
	    mpcyclosrepo.pswrd.sendKeys("Praju@143$");
	    mpcyclosrepo.submit.click();
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.marketplace.click();
	

}

@Then("User should click on My Advertisement menu")
public void user_should_click_on_My_Advertisement_menu() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.myads.click();
}

@When("User should click on add new button and New Advertisement page to be display")
public void user_should_click_on_add_new_button_and_New_Advertisement_page_to_be_display() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.addnew.click();
}

@When("User should give the name")
public void user_should_give_the_name() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.name.sendKeys("ronaldo");
}

@When("User should click on the category")
public void user_should_click_on_the_category() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.category.click();
	Thread.sleep(3000);
	mpcyclosrepo.activites.click();
}

@When("User should enter a text in description textbox")
public void user_should_enter_a_text_in_description_textbox() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,450)", "");
	Thread.sleep(3000);
	mpcyclosrepo.text.click();
	Thread.sleep(3000);
	mpcyclosrepo.text.sendKeys("food");
}

@Then("User should click save button")
public void user_should_click_save_button() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.save.click();

}

@Given("User should click on the publication period{int}")
public void user_should_click_on_the_publication_period(Integer int1) throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.pubdate.click();
    Thread.sleep(3000);
    mpcyclosrepo.pubdate1.click();
}

@Given("User should want to click on the showmap")
public void user_should_want_to_click_on_the_showmap() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.showmap.click();
}

@Given("User should click on the filters")
public void user_should_click_on_the_filters() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.showlessfilter.click();
}

@When("User should enter the text Food in given keyword textbox")
public void user_should_enter_the_text_Food_in_given_keyword_textbox() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.food.click();
}

@When("User should click favorites radio button")
public void user_should_click_favorites_radio_button() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.favorite.click();
}

@When("User should give minimum price")
public void user_should_give_minimum_price() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.minprice.sendKeys("50");
}

@When("User should give maximum price")
public void user_should_give_maximum_price() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
    mpcyclosrepo.minprice.sendKeys("100");
}

@Given("User should click on Order By dropdown")
public void user_should_click_on_Order_By_dropdown() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.orderby.click();
}

@Given("User should select the user choice")
public void user_should_select_the_user_choice() {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	mpcyclosrepo.select.click();
}

@Given("User should click on the keywords")
public void user_should_click_on_the_keywords() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.keywords.click();
}

@Given("User should click on the show advertisements")
public void user_should_click_on_the_show_advertisements() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.showad.click();
}

@Given("User should click on the community")
public void user_should_click_on_the_community() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.community.click();
}


@Given("User should click on the activites")
public void user_should_click_on_the_activites() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.communityfield.click();
    
}

@Then("User should click on any categories in activity")
public void user_should_click_on_any_categories_in_activity() throws InterruptedException {
	PageFactory.initElements(driver, mpcyclosrepo.class);
	Thread.sleep(3000);
	mpcyclosrepo.adactivity.click();
}
}
