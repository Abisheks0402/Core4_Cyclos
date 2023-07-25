package repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class paymentrepo {
	   @FindBy(xpath ="//input[@placeholder='User']" )
	    public static WebElement username;
	    
	    @FindBy(xpath = "//input[@type='password']")
	    public static WebElement password;
	    
	    @FindBy(xpath = "//span[text()='Submit']")
	    public static WebElement submit;
	    
	    @FindBy(xpath="//div[text()='Banking']")
	    public static WebElement bankingbtn;
	    
	    @FindBy(xpath = "//div[text()='Payment to user']")
	    public static WebElement paymentUserbtn;

	 

	    @FindBy(css = "button.btn.btn-icon.ml-2")
	    public static WebElement contactlistbtn;

	 

	    @FindBy(xpath = "//a[contains(text(),'Demo three')]")
	    public static WebElement selectuser;
	// Payment Reques
	    
	    
	 
	 

	    @FindBy(xpath = "//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	    public static WebElement NextButton;

	 

	    @FindBy(css = "input.form-control.text-right")
	    public static WebElement amountfield;

	 

	    @FindBy(css = "textarea[rows='3']")
	    public static WebElement amountdescrfield;

	 

	    @FindBy(xpath = "//button[contains(@class,'btn d-flex')]")
	    public static WebElement nxtbtn;

	 

	    @FindBy(xpath = "//span[text()='Confirm']")
	    public static WebElement confrimpaybtn;

	    @FindBy(xpath="//div[@class=\"notification-message\"]")
	    public static WebElement txtmsg;
	 
	@FindBy(xpath = "div[contains(@class,'notification-message')")
	public static WebElement confrmtxt;

	    @FindBy(xpath = "(//div[@class='nav-item-text'])[3]")
	    public static WebElement paytosysbtn;

	 

	    @FindBy(xpath = "//input[contains(@class,'form-control text-right')]")
	    public static WebElement paysysamtfield;

	 

	    @FindBy(css = "button.btn.d-flex")
	    public static WebElement sysnxtbtn;

	 

	    @FindBy(xpath = "(//button[contains(@class,'btn d-flex')])[1]")
	    public static WebElement syscnfrmbtn;
	    
	    @FindBy(xpath = "//div[text()='The payment was successfully processed']")
	    public static WebElement systosysmsg;

	    @FindBy(xpath = "//a[contains(text(),'Monthly installments')]")
	    public static WebElement monthlyinstallment;
	    
	    @FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	    public static WebElement numberofinst;
	    
	    @FindBy(xpath = "//div[text()='Recurring payments']")
	    public static WebElement reccurringpayment;
	 

	    @FindBy(xpath = "//div[contains(@class,'w-100 mw-100')]")
	    public static WebElement schedulingbtn;

	 

	    @FindBy(xpath = "//a[contains(text(),'Scheduled')]")
	    public static WebElement schedulebtn;

	 

	    @FindBy(xpath = "//input[contains(@class,'form-control flex-grow-1')]")
	    public static WebElement datehandle;// robot class

	 

	    @FindBy(xpath = "//div[text()='Payment requests']")
	    public static WebElement Paymentreqbtn;

	 

	    @FindBy(xpath = "//div[text()='Send a new request']")
	    public static WebElement sndnewreqbtn;
	    
	    
	   @FindBy(xpath="//div[text()='Payment requests']")
	   public static WebElement paymentrequestButton;
	   
	   
	   @FindBy(xpath="")
	   public static WebElement PUuserselect;
	   
	   @FindBy(xpath="(//button[@class='btn'])[2]")
	public static WebElement PUSendAnewREquest;
	   
	   
	   @FindBy(xpath="(//button[@type='button']//icon)[2]")
	   public static WebElement PUcontactlist;
	   
	   @FindBy(xpath="//a[contains(text(),'Business One')]")
	   public static WebElement Pucontactselect;
	   
	   @FindBy(xpath="//input[contains(@class,'form-control text-right')]")
	   public static WebElement PUamount;
	   
	   @FindBy(xpath="//input[contains(@class,'form-control flex-grow-1')]")
	   public static WebElement PUdate;
	   
	   
	   @FindBy(xpath="(//button[contains(@class,'form-control text-left')])[1]")
	   public static WebElement  pudropdownselect;
	   
	   @FindBy(xpath="//a[contains(text(),'Pay now')]")
	   public static WebElement PUpaynow;
	   
	   @FindBy(xpath="//a[contains(text(),'Scheduled')]")
	   public static WebElement Puscheduled;
	   
	   
	   @FindBy(xpath="//a[contains(text(),'Monthly installments')]")
	   public static WebElement PumonthlyInstalllment;
	   
	   @FindBy(xpath="//a[contains(text(),'Recurring payments')]")
	   public static WebElement puReccuringPayment;
	   
	   @FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	   public static WebElement punumberofinstallment;
	   
	   @FindBy(xpath="//textarea[contains(@class,'form-control ng-untouched')]")
	   public static WebElement pudiscription;
	   
	   @FindBy(xpath="//span[text()='Confirm']")
	   public static WebElement puconfirmButton;
	   
	   @FindBy(xpath="//div[@class='notification-message']//div[1]")
	   public static WebElement pugettxt;
	   
	   @FindBy(xpath="//div[text()='Payment to system']")
	   public static WebElement pspaymenttosystem;
	   
	   @FindBy(xpath="//input[contains(@class,'form-control text-right')]")
	   public static WebElement psamount;
	   
	   @FindBy(xpath="//button[contains(@class,'form-control text-left')]")
	   public static WebElement psdropdown;
	   
	   @FindBy(xpath="//a[contains(text(),'Scheduled')]")
	   public static WebElement psscheduled	;
	   
	   @FindBy(xpath="//input[contains(@class,'form-control flex-grow-1')]")
	   public static WebElement psDate;
	   
	   @FindBy(xpath="//a[contains(text(),'Monthly installments')]")
	   public static WebElement psmonthlyInstallment;
	   
	   @FindBy(xpath="//input[contains(@class,'form-control w-100')]")
	   public static WebElement psnumberofinstallment;
	   
	   @FindBy(xpath="//textarea[contains(@class,'form-control ng-untouched')]")
	   public static WebElement psdescription;
	   
	   @FindBy(xpath="//button[contains(@class,'btn d-flex')]")
	   public static WebElement psNextbutton;
	   
	   @FindBy(xpath="//div[contains(@class,'title-text flex-grow-1')]")
	   public static WebElement pgettxt;
	   
	   @FindBy(className  ="invalid-feedback")
public static WebElement 	   amountexceede;
	   
	   @FindBy(xpath="//div[text()='You have exceeded the maximum of payments per day for the demo network']")
	   public static WebElement not;
	   
	   @FindBy(xpath="(//button[@type='button']//span)[2]")
	   public static WebElement AlertConfirm;
	   
	   @FindBy(xpath="//div[@class='notification-message']//div[1]")
	   public static WebElement Putxt;
	   
	   @FindBy(xpath="(//button[contains(@class,'btn d-flex')])[1]")
	   public static WebElement Pscnfrmbtn;
	   
	   
	   
	   
	   
	   
	}

