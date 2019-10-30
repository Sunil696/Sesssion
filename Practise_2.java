package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practise_2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
		String   E_Title="Find a Flight: Mercury Tours:";
		driver=MyDrivers.getDriver("Chrome");
		
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("SunilBa");
		driver.findElement(By.name("password")).sendKeys("password123$");
		driver.findElement(By.name("login")).click();
		
		
			Thread.sleep(3000);
		
		String A_Title=driver.getTitle();
		System.out.println(A_Title);
		if (A_Title.equalsIgnoreCase(E_Title))
		{
			System.out.println("LOGIN SUCCESSFUL");
		}
		
		else
		{
			System.out.println("LOGIN FAILURE");
		}
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int no_Links=links.size();
		
		System.out.println("Number of Links in the page are: " +no_Links);
		for(int i=0;i<no_Links;i++)
		{
			String link_text=links.get(i).getText();
			System.out.println("Link text is:" +link_text);
			
			
		}
		
		
		
driver.close();
	}


}
