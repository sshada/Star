package TestNGAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");	
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("terlikeerthi1@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Keerthi1@");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
}
}