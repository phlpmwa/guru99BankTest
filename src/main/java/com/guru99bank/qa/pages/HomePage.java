package com.guru99bank.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.guru99bank.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomepageTitle()
	{
		return driver.getTitle();
	}

}
