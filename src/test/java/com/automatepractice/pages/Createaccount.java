package com.automatepractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createaccount {
	
	
public WebDriver driver;
	
	
private	By login = By.xpath("//*[@class = 'login']");
	By create = By.xpath("//input[@id='email_create']");
	By submit = By.xpath("//button[@id = 'SubmitCreate']");
	By firstname = By.xpath("//input[@name='customer_firstname']");
    By lastname = By.xpath("//input[@name='customer_lastname']");
    By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By address1 = By.xpath("//input[@id='address1']");
	By city = By.xpath("//input[@id='city']");
	By state = By.xpath("//select[@id='id_state']");
	By value = By.xpath("//option[@value='43']");
	By postcode = By.xpath("//input[@id = 'postcode']");
	By country = By.xpath("//select[@id = 'id_country']");
	By phone = By.xpath("//input[@id='phone_mobile']");
	By my_address = By.xpath("//input[@id='alias']");
	By submit1 = By.xpath("//button[@id='submitAccount']");
	
	public Createaccount(WebDriver driver) {
		this.driver=driver;
	}
	public void typelogin() {
	driver.findElement(login).click();
	}
	
	public void typecreate() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			driver.findElement(create).sendKeys("bitesf4@gmail.com");	
	}
	public void typesubmit() {
		driver.findElement(submit).click();
	}
	
	public void typefirstname() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(firstname).sendKeys("mayank");
	}
	
	public void typelastname() {
		driver.findElement(lastname).sendKeys("patil");
	}
	public void typeemail() {
		driver.findElement(email).click();
	}
	
	public void typepassword() {
		driver.findElement(password).sendKeys("Disha@1234");
	}
	public void address1() {
		driver.findElement(address1).sendKeys("rythmos");
		
	}
	public void city() {
		driver.findElement(city).sendKeys("1802 sherwood pl");
	
	}
	public void state() {
		driver.findElement(state).click();
	
	}	
	public void value() {
		driver.findElement(value).sendKeys("43");
	}
	
	public void postcode() {
		driver.findElement(postcode).sendKeys("78547");
	}
	public void country1() {
		driver.findElement(country).sendKeys("id_country");
	}
	public void phone() {
		driver.findElement(phone).sendKeys("9193542766");
	}
	public void my_address() {
		driver.findElement(my_address).sendKeys("9193542766");
	}
	public void submit1() {
		driver.findElement(submit1).click();
	}
	
	
}

