package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Framework_Package.BaseDriver;

public class DesktopPage extends BaseDriver {
	
	// $x("//li[@class='dropdown'][1]")
	

	WebDriver driver;
	
	public   WebElement element = null;
	
	

	
   public static  WebElement featurProductsHomepage(WebDriver driver) {
		
  WebElement element = driver.findElement(By.xpath("//li[@class='dropdown'][1]]"));
 
  
  
   return element;
		
	}
   

}
