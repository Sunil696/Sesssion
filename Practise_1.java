package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_1 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;
		driver=MyDrivers.getDriver("Chrome");
		
		driver.manage().window().maximize();
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("demo");
		driver.findElement(By.name("password")).sendKeys("demo");
		driver.findElement(By.name("login")).click();
			
						
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("Sunil");
		driver.findElement(By.name("lastName")).sendKeys("Battula");
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		driver.findElement(By.id("userName")).sendKeys("Sunil.abce@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("address1");
		driver.findElement(By.name("address2")).sendKeys("address2");
		driver.findElement(By.name("city")).sendKeys("city");
		driver.findElement(By.name("state")).sendKeys("state");
		driver.findElement(By.name("postalCode")).sendKeys("postalCode");
		
		
		
		Select Country= new Select (driver.findElement(By.name("country")));
		Country.selectByVisibleText("BELGIUM");
		
		driver.findElement(By.id("email")).sendKeys("SunilBa");
		driver.findElement(By.name("password")).sendKeys("password123$");
		driver.findElement(By.name("confirmPassword")).sendKeys("password123$");
		
		driver.findElement(By.name("register")).click();
		
		
		
		
	}

}
