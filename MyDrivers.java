package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MyDrivers
{

	public static WebDriver getDriver(String Bname)
	{
		  if (Bname.equalsIgnoreCase("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
			   return new ChromeDriver();
		  }
		  
		  else if (Bname.equalsIgnoreCase("ie"))
		  {
			  System.setProperty("webdriver.ie.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
			   return new InternetExplorerDriver();
		  }
		  
		  else if (Bname.equalsIgnoreCase("ff"))
		  {
			  System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Drivers\\chromedriver.exe");
			   return new FirefoxDriver();
		  }
		  else
			  
		return null;

	}

}
