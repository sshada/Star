package com.shopping.testcase;


import com.shopping.pages.Searching;

import webdriver.WebdriverFactory;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class VerificationSearch {
	WebDriver driver;
	@Test
	public void Searching()
	{		
		Searching login=new Searching(driver);
		login.selectSign();
		login.typeEmail("TERLIKEEERTHI1@GMAIL.COM");
		login.typePassword("Keerthi1@");
		login.signIn();
		login.search("dresses");
		login.clickk();
	}
	
  @BeforeClass
	public void startUrl()
	{
	  WebdriverFactory driverfactory= new WebdriverFactory();
		driver = driverfactory.startBrowser("chrome", "http://automationpractice.com/index.php");
	}
	

  @AfterClass
	public void close_browser() {
	driver.quit();
	}

}
