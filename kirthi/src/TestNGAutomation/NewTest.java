package TestNGAutomation;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
public class NewTest {
public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
  
    driver.findElement(By.name("identifier")).sendKeys("aswithareddy123@gmail.com");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id='identifierNext']//descendant::span")).click();
Thread.sleep(3000);
driver.findElement(By.name("password")).sendKeys("boln@m@th");
Thread.sleep(3000); 
driver.findElement(By.xpath("//*[@id='passwordNext']//descendant::span")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");  
driver=new ChromeDriver(); 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get("http:www.gmail.com");
  }

  @AfterMethod
  public void afterMethod() {
  driver.close();
  
  }

}

