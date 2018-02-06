package com.training.practice.webdriverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import properties.ReadPropertiesFile;

public class WebDriverFactory {
	private WebDriver driver;
	private String chromepath = ReadPropertiesFile.getChromePath();
	
	public WebDriver getDriver()
	{
		return driver;
		
	}
	public WebDriver getDriver(String browser,String url)
	{
		//WebDriver driver = null;
		switch(browser)
		{
		case "chrome":
		driver=	startChromeDriver(url);
		break;
		case "firefox" :
		 driver= startFireFoxdriver(url);
		 break;
		}
	return driver;
	}

	public  WebDriver startChromeDriver(String url) {
		System.setProperty("webdriver.chrome.driver", chromepath);
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	private static WebDriver startFireFoxdriver(String url) {
	//System.setProperty("webdriver.firefox.marinotte", chromepath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

	
		
	}

	
