package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {

	public static void main(String[] args)
	{
		WebDriver driver;
		driver=MyDrivers.getDriver("Chrome");
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		
		
		
		

	}

}
