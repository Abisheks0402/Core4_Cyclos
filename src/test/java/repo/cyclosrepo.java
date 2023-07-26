package stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cyclosrepo {
	@FindBy(xpath = "//*[@placeholder='User']")
	public static WebElement user;
	
	@FindBy(xpath = "//*[@placeholder='Password']")
	public static WebElement pswrd;
	

 /*   @FindBy(xpath="//div[text()='New message']")
    public static WebElement newMessage;
    

    @FindBy(xpath="//button[@class=\"form-control text-left custom-select w-100\"]")
    public static WebElement sendto;

    

    @FindBy(xpath="//a[text()=' User ']")
    public static WebElement usr;
   
    
    @FindBy(xpath="//input[@placeholder=\"Type to search\"]")
    public static WebElement toUser;

    
    @FindBy(xpath="//button[@class='btn btn-icon ml-2']")
    public static WebElement contactlist;

    
    @FindBy(xpath="//a[text()=' Active Walking ']")
    public static WebElement element;
    

    @FindBy(xpath ="//*[@id=\"id_10\"]")
    public static WebElement subject;

    
    @FindBy(xpath="//SELECT[@id=\"id_154_fontname\"]")
    public static WebElement font;

    
    @FindBy(xpath="(//button[@class=\"btn btn-icon\"])[4]")
    public static WebElement style;

    
    @FindBy(css="div[class=\"editor\"]")
    public static WebElement content;

    
    @FindBy(xpath="//button[@class=\"btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary\"]")
    public static WebElement send;
 
    */

	
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
	
	
	
	


