package test;


import org.testng.annotations.Test;

import frameworkpackage.BaseDriver;
import pageobjects.AllDesktopPage;


public class TestSortingOfAllDesktopProducts extends  BaseDriver {

	@Test
	public void getAllDesktopPage () throws InterruptedException {

		
		AllDesktopPage obj = new AllDesktopPage(getDriver());
		
		
		obj.openAllDesktopPag().click();
		
		obj.sortyByproduct("Name (A - Z)");
	
		//  Available  sorting options list  :-  Default ,  Name (A - Z), Name (Z - A) , Price (Low > High) , Price (High > Low) ,
	   //	Rating (Highest) , Rating (Lowest) , Model (A - Z) , Model (Z - A) ,
		
		
	
	}
	
	
}


