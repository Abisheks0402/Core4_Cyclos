package com.Cyclos_Core_Four_StepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccInfoRepo {
	@FindBy(xpath="//input[@placeholder='User']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public static WebElement password;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	public static WebElement loginSubmit;
	
	@FindBy(xpath="//div[text()='Banking']")
	public static WebElement banking;
	
	@FindBy(xpath="//div[text()='Member account']")
	public static WebElement mem_acc;
	
	@FindBy(xpath = "//div[@class='row no-gutters']/div[4]")
    public static WebElement balanceinfo;
	
	@FindBy(id="notifications-link")
	public static WebElement notification;
	
	@FindBy(xpath="(//table[contains(@class,'table table-hover')]//a)[2]")
	public static WebElement payhistory;
	
	@FindBy(className = "bi bi-printer")
    public static WebElement paymentprint;
	
	@FindBy(linkText ="Show filters")
	public static WebElement filterbutton;
	
	@FindBy(xpath="//button[contains(@class,'btn btn-icon')]")
	public static WebElement Userlist;
	
	@FindBy(xpath="(//div[contains(@class,'w-100 mw-100')])[1]")
	public static WebElement rangemenu;
	
	@FindBy(className="form-control w-100 ng-pristine ng-valid ng-touched")
	public static WebElement description;
	
	@FindBy(xpath="(//div[@class='input-group']//input)[1]")
	public static WebElement from_amt;
	
	@FindBy(className="form-control text-right ng-pristine ng-valid ng-touched")
	public static WebElement to_amt;
	
	@FindBy(className="w-100 open show")
	public static WebElement member_acc_filter;
	
	
	@FindBy(xpath="//button[@id='id_9']//div[1]")
	public static WebElement direction;

	@FindBy(className="form-control w-100 ng-valid ng-dirty ng-touched")
	public static WebElement transactionNumber;
	
	@FindBy(xpath="//button[@id='id_24']//div[1]")
	public static WebElement orderby;
	
	

}
