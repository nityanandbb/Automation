package test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import frameworkpackage.BaseDriver;
import pageobjects.FeatureProducts;

public class TestFeaturedProductDetails extends BaseDriver {

	@Test
	public void getFeaturedPorductNameAndPrice() {

		FeatureProducts obj = new FeatureProducts(getDriver());
		
	 obj.getProductNameAndPrice(getDriver());
	 
   System.out.println("Test REsult = "  + obj.getProductNameAndPrice(getDriver()));
	
		
	

	}
}
