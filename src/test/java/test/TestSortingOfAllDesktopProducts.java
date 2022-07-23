package test;

import org.testng.annotations.Test;

import frameworkpackage.BaseDriver;
import pageobjects.AllDesktopPage;

public class TestSortingOfAllDesktopProducts extends  BaseDriver {

	@Test
	public void getAllDesktopPage () throws InterruptedException {

		AllDesktopPage obj = new AllDesktopPage(getDriver());
		
		obj.openAllDesktopPage(getDriver()).click();
		
		Thread.sleep(3000);
		
		obj.sortProductsAtoZ(getDriver()).click();
		
		Thread.sleep(3000);
		obj.sortProductsZtoA(getDriver()).click();
		
		Thread.sleep(3000);
		obj.sortProductsPriceHightoLow_(getDriver()).click();
		
		Thread.sleep(3000);
		obj.sortProductsPriceLowtoHigh(getDriver()).click();
		Thread.sleep(3000);
		
	}
	
	
}
