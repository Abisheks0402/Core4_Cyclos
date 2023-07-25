package repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class alertandloggingrepo {
	@FindBy(xpath ="//input[@placeholder='User']" )
    public static WebElement username;
    
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;
    
    @FindBy(xpath = "//span[text()='Submit']")
    public static WebElement submit;
    
	@FindBy(xpath="//div[text()='Marketplace']")
	   public static WebElement marketplace;
	
	@FindBy(xpath="//div[text()='Advertisements']")
	public static WebElement advertisement;
	
	@FindBy(xpath="//button[contains(@class,'btn d-flex')]")
	public static  WebElement showad;
	
	@FindBy(xpath="//div[text()[normalize-space()='food']]")
	public static  WebElement food;
	
	@FindBy(xpath="(//button[@class='btn'])[3]")
	public static WebElement askaquestion;
	
	@FindBy(xpath="//textarea[contains(@class,'form-control ng-pristine')]")
	public static WebElement question;
	
	@FindBy(xpath="(//button[contains(@class,'btn d-flex')])[1]")
	public static WebElement submitbtn;
	
	
}
