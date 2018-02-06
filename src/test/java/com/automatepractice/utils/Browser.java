package com.automatepractice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;




public class Browser {
	
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername,String url) {
	
		if(browsername.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Kvasmate\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	
	
	
else if(browsername.equalsIgnoreCase("chrome")) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kvasmate\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	
}
else if(browsername.equalsIgnoreCase("IE")) {
	
	driver=new InternetExplorerDriver();
	
}
driver.manage().window().maximize();
driver.get(url);
return driver;
}

}

	
	

