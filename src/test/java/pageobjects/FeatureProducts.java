package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworkpackage.BaseDriver;

public class FeatureProducts extends BaseDriver {

	WebDriver driver;
	public List<WebElement> WebElement;

	public FeatureProducts(WebDriver driver) {

		driver = this.getDriver();
	}

	String productNames;
	String productPrice;
	List<String> productDetails = new ArrayList<>();

	public List<String> getProductNameAndPrice(WebDriver driver) {

		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='caption']")); // /h4

		for (WebElement webElement : productName) {

			productNames = webElement.findElement(By.tagName("h4")).getText();
			productPrice = webElement.findElement(By.className("price")).getText();
			productDetails.add(productNames);
			productDetails.add(productPrice);

		}
		System.out.println("return Block");
		return (productDetails);
	}

}
