package com.shopping.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Searching {
	WebDriver driver;
	By signin= By.xpath("//*[@class='login']");
	By email=By.xpath("//*[@id='email']");
	By password=By.xpath("//*[@id='passwd']");
	By signinbut=By.xpath("//*[@id='SubmitLogin']");
	By search=By.xpath("//*[@id='search_query_top']");
	By clicks=By.xpath("//*[@name='submit_search']");
	
	 public Searching(WebDriver driver)
	 {
	this.driver=driver;
	 }
	 public void selectSign()
	 {
		driver.findElement(signin).click();
	 }
	 public void typeEmail(String uid)
	 {
		 driver.findElement(email).sendKeys(uid);
	 }
	 public void typePassword(String passwrd)
	 {
		driver.findElement(password).sendKeys(passwrd);
	 }
	 public void signIn()
	 {
		 driver.findElement(signinbut).click();
	 }
	 public void search(String item)
		 { 
			 driver.findElement(search).sendKeys(item);
		}
	public void clickk()  
		 {
			 driver.findElement(clicks).click();
		 }
	 }
	
