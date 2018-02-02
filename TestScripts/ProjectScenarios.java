package com.training.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectScenarios {
	WebDriver driver;
@BeforeMethod
public void beforeMethod()
{
	System.out.println("BM");
}
	@Test(priority = 0)
	public void createAccount() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class = 'login']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("ffaghj455@gmail.com");
		driver.findElement(By.xpath("//button[@id = 'SubmitCreate']")).click();

		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys("priya");
		driver.findElement(By.xpath("//input[@name='customer_lastname']")).sendKeys("pandey");
		driver.findElement(By.xpath("//input[@id='email']")).click();
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Disha@456");
		
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("rythmos");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("1802 sherwood pl");
		driver.findElement(By.xpath("//select[@id='id_state']")).click();
		driver.findElement(By.xpath("//option[@value='43']")).click();
		driver.findElement(By.xpath("//input[@id = 'postcode']")).sendKeys("78547");
		driver.findElement(By.xpath("//select[@id = 'id_country']")).click();
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9123542766");
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("My Address");
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class = 'login']")).click();
		System.out.println("test2");
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("kvasmate@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Disha@456");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(3000);
	}
	@Test(priority = 2)
	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Casual Dresses > Printed Dress");
		driver.findElement(By.xpath("//button[@class='btn btn-default button-search']")).click();
		driver.findElement(By.xpath("//img[@class='replace-2x img-responsive']")).click();
		driver.findElement(By.xpath("//button[@class='exclusive']")).click();
		System.out.println("test3");
		Thread.sleep(3000);
	}
	@Test(priority = 3)
	public void checkout() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]")).click();
		System.out.println("test3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
		System.out.println("test3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		System.out.println("test3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
		System.out.println("test3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[2]/a")).click();
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AM");
	}
}
