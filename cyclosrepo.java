package stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cyclosrepo {
	@FindBy(xpath = "//*[@placeholder='User']")
	public static WebElement user;
	
	@FindBy(xpath = "//*[@placeholder='Password']")
	public static WebElement pswrd;
	
	@FindBy(xpath = "//*[text()='Submit']")
	public static WebElement submit;
	
	@FindBy(id = "messages-link")
	public static WebElement msg;
	
	@FindBy(xpath = "//*[text()='New message']")
	public static WebElement newmsg;
	
	@FindBy(xpath = "//*[@id='id_19']")
	public static WebElement sendto;
	
	@FindBy(xpath = "//div[@class='d-flex']//button[1]")
	public static WebElement contactlist;
	
	@FindBy(xpath = "//*[@id='id_18_editor']")
	public static WebElement desc;
	
	@FindBy(xpath = "//action-button[@class='d-inline-block button']//button[1]")
	public static WebElement sndbtn;
	
	@FindBy(xpath = "//*[@id='id_20']")
	public static WebElement sub;
	
	@FindBy(xpath = "//*[@id='id_75_sent']")
	public static WebElement sent;
	
	@FindBy(xpath= "//*[@id='id_75_trash']")
	public static WebElement trash;
	
	@FindBy(xpath= "//*[@id='id_73']")
	public static WebElement FSto;
	
	@FindBy(xpath= "//*[@id='id_76']")
	public static WebElement keywords;
	
	@FindBy(xpath= "//*[@class='d-flex']")
	public static WebElement usrcontact;
	
	
	
	
	

}
