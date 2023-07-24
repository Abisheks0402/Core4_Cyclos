package com.Cyclos_Core_Four_StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.Cyclos_Core_Four_StepDefinitions.*;

public class Demo_Step {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.cyclos.org/ui/login");
		
		PageFactory.initElements(driver,AccInfoRepo.class);
		
		AccInfoRepo.username.sendKeys("demo");
		AccInfoRepo.password.sendKeys("1234");
		AccInfoRepo.loginSubmit.click();
		
		
		
	}
		
}
