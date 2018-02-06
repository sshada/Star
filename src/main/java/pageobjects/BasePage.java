package pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

	private WebDriver driver;

	public WebDriver getDriver() {
		return this.driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By element) {
		if (verifyElement(element)) {
			driver.findElement(element).click();
		}

	}

	public void enterText(By element, String inputText) {
		if (verifyElement(element)) {
			driver.findElement(element).sendKeys(inputText);
		}
	}

	public void wait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println("Wait failed");
			e.printStackTrace();
		}
	}

	public boolean verifyElement(By element) {
		try {
			driver.findElement(element);
			return true;
		} catch (Exception e) {
			System.out.println("Element not found");
			return false;
		}
	}

}

 

