package stepdefinition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mpcyclosrepo {


	@FindBy(xpath = "//*[@placeholder='User']")
	public static WebElement user;
	
	
	@FindBy(xpath = "//*[@placeholder='Password']")
	public static WebElement pswrd;
	 

	@FindBy(xpath = "//*[text()='Submit']")
	public static WebElement submit;

	   
	@FindBy(xpath="//div[text()='Marketplace']")
	public static WebElement marketplace;


	@FindBy(xpath="//div[text()='My advertisements']")
    public static WebElement myads;


    @FindBy(xpath="//div[text()='Add new']")
    public static WebElement addnew;


	@FindBy(xpath="//input[contains(@class,'form-control w-100')]")
    public static WebElement name;


    @FindBy(xpath="(//button[contains(@class,'form-control text-left')])[1]")
    public static WebElement category;


    @FindBy(linkText="Activities")
	public static WebElement activites;


    @FindBy(xpath="//*[@id='id_95_editor']")
    public static WebElement text;



    @FindBy(xpath="(//button[contains(@class,'btn d-flex')])[3]")
    public static WebElement save;


    @FindBy(id="id_6")
    public static WebElement pubdate ;

    
    @FindBy(id="id_7")
    public static WebElement pubdate1 ;


    @FindBy(xpath="//div[text()='No options selected']")
    public static WebElement showmap;


    @FindBy(xpath="//div[text()='Advertisements']")
    public static WebElement ads;


    @FindBy(xpath="//div[@class='heading-actions-plain-buttons']//button[1]")
    public static WebElement showlessfilter;


    @FindBy(linkText="Food")
    public static WebElement food;


    @FindBy(xpath="(//label[@class='custom-control-label'])[1]")
    public static WebElement favorite;


    @FindBy(id="id_92")
    public static WebElement minprice;


    @FindBy(id="id_93")
    public static WebElement maxprice;


    @FindBy(xpath="(//div[contains(@class,'page-content-body card-body')])[3]")
    public static WebElement showad;


	 @FindBy(linkText="Last published")
	 public static WebElement orderby;


     @FindBy(xpath="//div[text()=' Volunteer at iFarm Norfolk, UK ']")
     public static WebElement select;


     @FindBy(xpath="//input[contains(@class,'form-control w-100')]")
     public static WebElement keywords;


	 @FindBy(xpath="//a[contains(text(),'Community')]")
     public static WebElement community;

	 
	 @FindBy(linkText=" Show all ")
	 public static WebElement showall;
	 
	 @FindBy(linkText=" Activities")
	 public static WebElement communityfield;
	 
     @FindBy(xpath="//div[text()=' Volunteer at iFarm Norfolk, UK ']")
	 public static WebElement adcommunity;


	 @FindBy(linkText="Activities")
     public static WebElement  activityfield;


	 @FindBy(xpath="(//div[@class='avatar-container full-size'])[3]")
	 public static WebElement adactivity;

	}

	

	 
