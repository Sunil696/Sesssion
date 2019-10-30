package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class XPATH_CSS {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver=MyDrivers.getDriver("Chrome");
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		
		
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("first name");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("last name");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("address1");
		driver.findElement(By.xpath("//input[@name='address2']")).sendKeys("address2");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("city");
		
		driver.findElement(By.cssSelector("input[name=state]")).sendKeys("STATE");
		
		driver.findElement(By.cssSelector("input[name=postalCode]")).sendKeys("123456");
		
		Select country= new Select(driver.findElement(By.cssSelector("select[name=country")));
		country.selectByVisibleText("UGANDA");
					
		
		

	}

}
