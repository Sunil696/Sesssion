package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class LaunchTest1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		driver=MyDrivers.getDriver("CHROME");
		 
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 
	// To find out the all the links and print	 
		 List<WebElement> Li=driver.findElements(By.tagName("a"));
		 int lis=Li.size();
		 System.out.println(lis);
		 
		 for(int i=0; i<=lis;i++)
		 {
			 String li_text=Li.get(i).getText();
			 System.out.println(li_text);
		 }
		 
		 
		 
	// To Select the checkbox	 
		 Select sell= new Select(driver.findElement(By.name("Country")));
		 sell.selectByVisibleText("TOGO");
			 
			 
		 
		 
		 
		 Dimension d= new Dimension(300,600); // To Define the desizered size 
		 Thread.sleep(3000);
		 driver.manage().window().setSize(d);
		 
		 Point p= new Point(300,700);  // To change the position
		 driver.manage().window().setPosition(p);
		 
		 
		 

		 
//		 MyDrivers.getDriver("IE");
//		 driver.get("https://www.eenadu.net/");
		 
	}

}
