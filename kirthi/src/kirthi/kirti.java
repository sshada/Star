package kirthi;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class kirti {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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

		// WebElement web =
		// driver.findElement(By.xpath(".//*[@id='layer_cart']/div[1]/div[1]"));
		// String handle=driver.getWindowHandle();
		// ArrayList<String> a= new ArrayList<String> (driver.getWindowHandles());
		// driver.switchTo().window(a.get(0));
		// driver.switchTo().alert();

		WebElement element = driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		driver.findElement(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys("tg 73 sns-s");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("texas");
		driver.findElement(By.xpath("//*[@id='postcode']")).sendKeys("57665");
		driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("9492025157");
		driver.findElement(By.xpath("//*[@id='phone_mobile']")).sendKeys("988745621");
		driver.findElement(By.xpath("//*[@id='alias']")).sendKeys("home");
		driver.findElement(By.xpath("//*[@id='submitAddress']")).click();
		WebElement drp = driver.findElement(By.xpath("//*[@id='id_state']"));
		Select drop = new Select(drp);
		drop.selectByIndex(5);
		WebElement drp1 = driver.findElement(By.xpath("//*[@id='id_country']"));
		Select drop1 = new Select(drp1);
		drop1.selectByIndex(1);
		driver.findElement(By.xpath("//*[@id='submitAddress']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("processAddress")).click();
		// Thread.sleep(3000);

		// Select states=new Select(driver.findElement(by.name("state")));
		// states.selectByVisibleText("Arizona");

	}
}
