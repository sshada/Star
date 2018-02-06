package kirthi;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.xpath("//*[@id='social_block']/ul/li[1]/a")).sendKeys(selectLinkOpeninNewTab);
		String parent = driver.getWindowHandle();
		Set<String> allchildWindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(allchildWindows);
		driver.switchTo().window(tabs.get(1));
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Keerthiterli1@gmail.com");
		driver.close();
		driver.switchTo().window(tabs.get(0));
		driver.close();
	}
}