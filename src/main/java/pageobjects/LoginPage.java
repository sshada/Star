package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
	
	public LoginPage(WebDriver driver)
	{
		setDriver(driver);
	}
	private By signin=By.xpath("//*[@class='login']");
	private By username = By.name("email");
	private By password = By.name("passwd");
	private By login = By.name("SubmitLogin");
	private By logout = By.linkText("Sign out");
	
	public boolean loginVerify(String username, String password)
	{
					wait(3);
					click(signin);
					wait(3);
			enterText(this.username, username);
			enterText(this.password, password);
			click(login);
			wait(3);
			if (verifyElement(logout)) {
				System.out.println("Login Successful");
				return true;
			} else {
				System.out.println("Login Unsuccessful");
				return false;
			}
		
	}
}

