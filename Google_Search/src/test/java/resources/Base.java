package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Base {

	public static WebDriver driver;
	public static String AppUrl;

	@Test
	public WebDriver getBrowserDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fin=new FileInputStream("W:\\MphasisQA\\OWAIS\\AG_Workspace\\google_Search\\src\\test\\java\\resources\\data.properties");
		prop.load(fin);
		String browser=prop.getProperty("browser");
		 AppUrl=prop.getProperty("AppUrl");
		System.out.println(browser);

		if (browser.equalsIgnoreCase("chrome"))
		{

			System.setProperty("webdriver.chrome.driver" , "W:\\MphasisQA\\Automation_Selenium\\Drivers\\chromedriver_87.exe");
			driver=new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("Edge"))
		{

			System.setProperty("webdriver.chrome.driver" , "");
			driver=new EdgeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox"))
		{

			System.setProperty("webdriver.gecko.driver" , "FirefoxDriver\\geckodriver.exe");
			driver=new FirefoxDriver();

		}
		else if (browser.equalsIgnoreCase("IE"))
		{

			System.setProperty("webdriver.ie.driver" , "IEDriver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();


		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
