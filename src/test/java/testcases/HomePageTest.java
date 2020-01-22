package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99bank.qa.base.TestBase;
import com.guru99bank.qa.pages.HomePage;
import com.guru99bank.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	public String expectedHomePageTitle="Guru99 Bank Manager HomePage";
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
		homePage=loginPage.Login(prop.getProperty("UserID"),prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomepageTitleTest()
	{
		String actualHomepageTitle=homePage.verifyHomepageTitle();
		Assert.assertEquals(actualHomepageTitle, expectedHomePageTitle);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
