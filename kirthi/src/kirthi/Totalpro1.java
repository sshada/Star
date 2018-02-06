package kirthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totalpro1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("terlikeerthi1@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Keerthi1@");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("dresses");
		driver.findElement(By.xpath("//*[@id='searchbox']/button")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@class='cross']")).click();
	}

}