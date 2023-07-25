package repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftVoucherRepo {
	@FindBy(xpath ="//input[@placeholder='User']" )
    public static WebElement username;
    
    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;
    
    @FindBy(xpath = "//span[text()='Submit']")
    public static WebElement submit;
    
	@FindBy(xpath="//div[text()='Marketplace']")
	   public static WebElement marketplace;
	
	@FindBy(linkText = "My vouchers")
	public static WebElement myVouchers;
	
	@FindBy(xpath="//table[contains(@class,'table table-hover')]")
	public static WebElement voucher;
	
	@FindBy(xpath="//div[text()='Print']")
	public static WebElement print;
	
	@FindBy(xpath="(//button[@class='btn'])[3]")
	public static WebElement buyavoucher;
	
	@FindBy(xpath="//table[contains(@class,'table table-no-header')]//tr[1]")
	public static WebElement cinemavoucher;
	
	@FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	public static WebElement numberofvoucher;
	
	@FindBy(xpath="//input[contains(@class,'form-control text-right')]")
	public static WebElement amount;
	
	@FindBy(xpath="(//button[@type='button']//span)[1]")
	public static WebElement nextbutton;
	
	@FindBy(className="notification-message")
	public static WebElement msg;
}
