package test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.practice.webdriverfactory.WebDriverFactory;

import pageobjects.LoginPage;

public class TC0001 {
	 LoginPage loginpage;
@BeforeMethod
	public void start()
	{
		WebDriverFactory webdriverfactory=new WebDriverFactory();
		loginpage=new LoginPage(webdriverfactory.getDriver("chrome","http://automationpractice.com/index.php?id_category=5&controller=category"));
	}

  @Test
  public void loginValidCrentials()
  {
		assertTrue(loginpage.loginVerify("malli@gmail.com", "12345"));
  }
 @Test 
  public void loginInvalidCredentials()
  {
	 assertFalse(loginpage.loginVerify("malli@gmail.com", "173725"));

  }
 @AfterMethod
  public void shutdown() {
			loginpage.getDriver().quit();
 }
}