package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworkpackage.BaseDriver;

public class FeatureProducts extends BaseDriver {

   // WebDriver driver = null;
	

	public FeatureProducts(WebDriver driver) {

	  driver = this.getDriver();
	 
	}

	public By productNameList =By.xpath("//div[@class='caption']"); // /h4

	String productNames;
	String productPrice;
	List<String> productDetails = new ArrayList<>();

	
	public List<String> getProductNameAndPrice() {
		
		
	//	By productNameList =By.xpath("//div[@class='caption']"); // /h4
		
		List<WebElement> productName= driver.findElements(productNameList);
		
		for (WebElement webElement : productName) {

			productNames = webElement.findElement(By.tagName("h4")).getText();
			productPrice = webElement.findElement(By.className("price")).getText();
			productDetails.add(productNames);
			productDetails.add(productPrice);

			System.out.println(productDetails);
			
		}
		System.out.println("return Block");
		return (productDetails);
		
	}

	
	
	
}
