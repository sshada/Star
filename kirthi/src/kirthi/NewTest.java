package kirthi;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	public  WebDriver driver;
  @Test
  public void f() {
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("terlikeerthi1@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Keerthi1@");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
  }
  @BeforeTest
	  public  void beforeTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
