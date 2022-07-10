package test;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Framework_Package.BaseDriver;
import pageobjects.Feature_Product_List;

public class Test_Featured_Product_Details extends BaseDriver {

	@Test
	public void GetFeatured_Porduct_Name_And_Price() {

		Feature_Product_List obj = new Feature_Product_List(getDriver());
		
	 obj.get_Product_Name_And_Price(getDriver());
 //  Reporter.log("Product Names "+ obj.get_Product_Name_And_Price(getDriver()),true);
	
		
   System.out.println("Test11" + obj.get_Product_Name_And_Price(getDriver()));
	
		
	

	}
}
