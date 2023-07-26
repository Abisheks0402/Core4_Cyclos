package stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRepository {
	// Update your profile

	@FindBy(xpath = "//input[@placeholder='User']") // enter username
	public static WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']") // enter password
	public static WebElement userpassword;
	@FindBy(xpath = "//button[contains(@class,'btn d-flex')]") // click on Submit
	public static WebElement Submit;
	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile
	public static WebElement profile;
	@FindBy(xpath = "//div[text()='Edit']") // click on Edit
	public static WebElement edit;
	@FindBy(xpath = "(//input[contains(@class,'form-control w-100')])[2]") // click on email
	public static WebElement email;
	@FindBy(xpath = "//input[@id='address_addressLine1_7762070814175342655']") // click on address Region
	public static WebElement addressRegion;
	@FindBy(xpath = "//input[@id='address_city_7762070814175354687']") // click on city
	public static WebElement city;
	@FindBy(xpath = "//span[text()='Save']") // Click Save
	public static WebElement save;

	// Add Multiple address

	@FindBy(xpath = "//div[text()='Edit']") // click on Edit
	public static WebElement edit1;
	@FindBy(xpath = "//span[text()='Add address']") // click on Add address
	public static WebElement Addaddress;
	@FindBy(id = "address_name_1") // click on Add address name
	public static WebElement AddaddressName;
	@FindBy(xpath = "//input[@fdprocessedid='41p7tk']") // click on Add address line1
	public static WebElement Addaddressline1;
	@FindBy(xpath = "//input[@id='address_city_7762070814175346495']") // Add city
	public static WebElement city1;
	@FindBy(xpath = "#address_zip_1") // Add Zipcode
	public static WebElement Zipcode;
	@FindBy(xpath = "//span[text()='Save']") // Click Save
	public static WebElement save2;

	// Add Mutiple Phones

	@FindBy(xpath = "//div[text()='Edit']") // click on Edit
	public static WebElement edit2;
	@FindBy(xpath = "//span[text()='Add mobile phone']") // click on Add Mobile Phones
	public static WebElement AddMobilePhones;
	@FindBy(xpath = "//input[@id='phone_name_2']") // click on Mobile Phone name
	public static WebElement MobilePhonename;
	@FindBy(id = "phone_number_2") // click on Mobile Phone number
	public static WebElement MobilePhonenumber;

	@FindBy(xpath = "//span[text()='Add mobile phone']") // click on Add Mobile Phones
	public static WebElement AddMobilePhones1;
	@FindBy(xpath = "//input[@fdprocessedid='umsqbr']") // click on Add Mobile name1
	public static WebElement AddMobilename1;
	@FindBy(xpath = "") // click on Add Mobile number
	public static WebElement AddMobilenumber;
	@FindBy(xpath = "//span[text()='Save']") // Click Save
	public static WebElement save3;
	// 4
	public static WebElement save1;
	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile
	public static WebElement profile2;
	@FindBy(xpath = "//div[text()='Password']") // click password
	public static WebElement password1;
	@FindBy(xpath = "//span[text()='Change']") // click change button
	public static WebElement changebutton;
	@FindBy(xpath = "(//input[@type='password'])[1]") // enter old password
	public static WebElement oldpassword;
	@FindBy(xpath = "(//input[@type='password'])[2]") // enter new password
	public static WebElement newpassword;
	@FindBy(xpath = "(//input[@type='password'])[3]") // enter new pasword again for confirmation
	public static WebElement againnewpassword;
	@FindBy(xpath = "//span[text()='Submit']") // click submit button
	public static WebElement submit2;
	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile
	public static WebElement profile3;
	@FindBy(xpath = "//div[text()='Notifications']") // click notification
	public static WebElement notification;
	@FindBy(xpath = "//*[@class=\"custom-control-label\"]") // click the unread checkbox
	public static WebElement checkbox1;
	@FindBy(xpath = "//a[@id=\"profile-link\"]") // click profile
	public static WebElement profile4;
	@FindBy(xpath = "//div[text()='Contacts']") // click the contacts
	public static WebElement contacts;
	@FindBy(xpath = "//*[@class=\"ci ci-grid-list\"]") // Choose the list view
	public static WebElement listview;

//		// Manage passwords

		@FindBy(css = "a#sidenav-trigger>icon") // click on more(3dots)
		public static WebElement edits;
		@FindBy(linkText = "Password") // click on password
		public static WebElement password;
		@FindBy(xpath = "button.btn.d-flex") // click on change
		public static WebElement change;
		@FindBy(id = "id_21") // click on Old password
		public static WebElement Oldpassword;
		@FindBy(id = "id_22") // click on New password
		public static WebElement Newpassword;
		@FindBy(xpath = "(//input[@type='password'])[3]") // click on confirmation New password
		public static WebElement confirmationNewpassword;
		@FindBy(xpath = "button[fdprocessedid='zja568']") // click on Submit
		public static WebElement Submit1;

		// Notification preferences

		@FindBy(css = "div.personal-label") // click on profile
		public static WebElement profile1;
		@FindBy(css = "a#notifications-link>icon-with-counter>icon") // click on label.custom-control-label
		public static WebElement Notifications;

		@FindBy(xpath = "custom-control-label") // click on checkbox
		public static WebElement checkbox;

		// Manage contacts

		@FindBy(xpath = "//div[text()=' Contacts ']") // click on
		public static WebElement Contacts;
		@FindBy(xpath = "//format-field-value[text()=' FEDERICO FERRO ']") // choose from list
		public static WebElement chooseList;

}
