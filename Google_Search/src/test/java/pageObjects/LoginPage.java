package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginPage {
	
	@FindBy(id="UserName")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindAll(xpath="//ul[@class='secondary-nav__list']/li")
	WebElement main_menu;
	
	public WebDriver driver;
	//Objects Description here
	
	//By username=By.id("UserName");
	//By password=By.cssSelector("input#Password");
	By Loginbtn=By.id("loginbtn");
			


	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(Loginbtn);
	}
	


}
