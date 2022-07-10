package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import Framework_Package.BaseDriver;

public class TNinja_Homepage extends BaseDriver {

	WebDriver driver;

	public List<WebElement> WebElement;
    public TNinja_Homepage (WebDriver driver) {
    	this.driver= driver;
    	
    }
	
	public static List<WebElement> Product_Name(WebDriver driver) {

		// REview with sonam
		// List<WebElement> FeatureCards =
		// driver.findElements(By.xpath("//div[@class='caption']"));
		List<WebElement> Prod_Name = driver.findElements(By.xpath("//div[@class='caption']/h4"));

		return Prod_Name;

	}

	public static List<WebElement> Product_Price(WebDriver driver) {

		List<WebElement> Prod_Price = driver.findElements(By.xpath("//div[@class='caption']/p[2]"));

		return Prod_Price;

	}

	
	for (WebElement webElement : TNinja_Homepage.Product_Name(driver)) {

//		Reporter.log("Loop 1 started");

		String Product_Name = webElement.findElement(By.tagName("h4")).getText();
		// Reporter.log(" Product name " + Product_Name);

		// System.out.println(" Product_Name " + Product_Name + " Product_Price " +
		// Product_Price);

		System.out.println("Test 2 point");

	}

	
	for (WebElement webElementP : TNinja_Homepage.Product_Price(driver)) {

		String Product_Price = webElementP.getText();
		Reporter.log(" Product price " + Product_Price);


}

/*
 * public webdriver featurProductsHomepage (webdriver driver) {
 * 
 * this.driver();
 * 
 * return driver = driver ;
 * 
 * }
 */