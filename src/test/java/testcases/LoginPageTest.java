package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99bank.qa.base.TestBase;
import com.guru99bank.qa.pages.HomePage;
import com.guru99bank.qa.pages.LoginPage;
import com.guru99bank.qa.utilities.utilities;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();

	}
	@Test(priority = 1)
	
	public void verifyLoginPageTitle()
	{
		String actualLoginTitle=loginPage.validateLoginPageTitle();
		Assert.assertEquals(actualLoginTitle,utilities.expectedLoginTitle
				);
	}
	
	@Test(priority = 2)
		public void login()
	{
		homePage=loginPage.Login(prop.getProperty("UserID"),prop.getProperty("password"));
	}
	
	@Test(priority = 3)
		public void reset()
	{
		loginPage=loginPage.reset(prop.getProperty("UserID"),prop.getProperty("password"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
