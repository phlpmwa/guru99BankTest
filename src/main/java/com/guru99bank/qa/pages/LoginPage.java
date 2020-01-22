package com.guru99bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99bank.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(name = "uid")
	WebElement userId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	@FindBy(name = "btnReset")
	WebElement btnReset;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage Login(String userID, String Password)
	{
		userId.sendKeys(userID);
		password.sendKeys(Password);
		btnLogin.click();
		
		return new HomePage();
	}
	
	public LoginPage reset(String userID, String Password)
	{
		userId.sendKeys(userID);
		password.sendKeys(Password);
		btnReset.click();
		
		return new LoginPage();
	}
	

}
