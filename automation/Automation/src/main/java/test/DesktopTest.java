package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.DesktopPage;

public class DesktopTest extends DesktopPage  {
	
	
	
	public static WebDriver driver;

	@Test
	public static void DesktopList() {
		
		
		Actions action = new Actions(driver);
		   
		  action.moveToElement(DesktopPage.featurProductsHomepage(driver));
		  
		  DesktopPage.featurProductsHomepage(driver).findElement(By.className("see-all")).click();
		 
		
		
	}

}
