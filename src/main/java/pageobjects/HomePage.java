package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By HomePageUsername=By.xpath("//table//tr[@class='heading3']");
	public void homepage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public String getHomepage()
	{
		return driver.findElement(HomePageUsername).getText();
	}

}
