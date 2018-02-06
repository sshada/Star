package com.automatepractice.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.automatepractice.pages.Createaccount;
//import com.automatepractice.pages.Createaccount;
import com.automatepractice.utils.Browser;


public class Account {
	
       WebDriver driver;
				@BeforeTest
				public void start() {
				driver=Browser.startBrowser("firefox", "http://www.automationpractice.com/" );
				} 
		 
				
				@Test
				
				public void createAccount() throws InterruptedException
				{
				//String baseurl= ("http://automationpractice.com/index.php?id_category=5&controller=category");
				//WebDriver  driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.get(baseurl);
				Createaccount acc = new Createaccount(driver);
				acc.typelogin();
				acc.typecreate();
				acc.typesubmit();
				acc.typefirstname();
				acc.typelastname();
				acc.typeemail();
				acc.typepassword();
				acc.address1();
				acc.city();
				acc.state();
				acc.value();
				acc.postcode();
				acc.country1();
				acc.phone(); 
				acc.my_address();
				acc.submit1();
	 

				}

				@AfterTest
				public void closeUrl()
				{
					driver.quit();
}
}
