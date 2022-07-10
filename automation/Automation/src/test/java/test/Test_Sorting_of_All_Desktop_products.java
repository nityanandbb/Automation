package test;

import org.testng.annotations.Test;

import Framework_Package.BaseDriver;
import pageobjects.Show_All_Desktop_Page;

public class Test_Sorting_of_All_Desktop_products extends  BaseDriver {

	@Test
	public void Get_All_Desktop_Page () throws InterruptedException {

		Show_All_Desktop_Page obj = new Show_All_Desktop_Page(getDriver());
		
		obj.Open_All_Desktop_page(getDriver()).click();
		
		Thread.sleep(3000);
		
		obj.Sort_Products_A_to_z(getDriver()).click();
		
		Thread.sleep(3000);
		obj.Sort_Products_Z_to_A(getDriver()).click();
		
		Thread.sleep(3000);
		obj.Sort_Products_Price_Low_to_High_(getDriver()).click();
		
		Thread.sleep(3000);
		obj.Sort_Products_Price_Low_to_High_(getDriver()).click();
		Thread.sleep(3000);
		
	}
	
	
}
