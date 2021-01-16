package Selenium.google_Search;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Base;
public class Equipt_Login extends Base {
	//public static WebDriver driver;
	
	@Test
	public static void runner() throws IOException
	{
		Base b=new Base();
		driver=b.getBrowserDriver();
		driver.manage().window().maximize();
		driver.get(AppUrl);
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys("bneelaka091220191");
		lp.getPassword().sendKeys("password1");
		lp.getLogin().click();
		
	}

}
