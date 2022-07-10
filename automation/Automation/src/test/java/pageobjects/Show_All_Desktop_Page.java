package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Framework_Package.BaseDriver;

public class Show_All_Desktop_Page  extends BaseDriver {

	WebDriver driver;
	public List<WebElement> WebElement;
	
	public Show_All_Desktop_Page(WebDriver driver) {

		driver = this.getDriver();
	}
	
	public WebElement Open_All_Desktop_page (WebDriver driver) { 
		
		
		WebElement Desktop_Tab =  driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]"));
		
	    Desktop_Tab.click();
	    
		WebElement AllDesktopBtn = Desktop_Tab.findElement(By.xpath("//div[@class='dropdown-menu']/a[1]"));
		
		
		return AllDesktopBtn;
	
	}

public WebElement Sort_Products_A_to_z (WebDriver driver) { 
		
   WebElement SortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));
	
	WebElement Sorting_options = SortBtn.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));
	
	WebElement A_Z_Sorting = Sorting_options.findElement(By.xpath("//*[@id='input-sort']/option[2]"));   // ("Name (A - Z)")).click();
	
		return A_Z_Sorting ;
	
}


public WebElement Sort_Products_Z_to_A (WebDriver driver) { 
		
WebElement SortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));
	
	WebElement Sorting_options = SortBtn.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));
	
	WebElement Z_A_Sorting = Sorting_options.findElement(By.xpath("//*[@id='input-sort']/option[3]"));   // ("Name (A - Z)")).click();

		
		return Z_A_Sorting ;
	
}
public WebElement Sort_Products_Price_Low_to_High_ (WebDriver driver) { 
WebElement SortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));
	
	WebElement Sorting_options = SortBtn.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));
	
	
	WebElement Price_Low_to_High_Sorting = Sorting_options.findElement(By.xpath("//*[@id='input-sort']/option[4]"));   // ("Name (A - Z)")).click();

		
		return Price_Low_to_High_Sorting ;
	
}

public WebElement Sort_Products_Price_High_to_Low_ (WebDriver driver) { 
WebElement SortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));
	
	WebElement Sorting_options = SortBtn.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));
	
	
	WebElement Price_High_to_Low_Sorting = Sorting_options.findElement(By.xpath("//*[@id='input-sort']/option[4]"));   // ("Name (A - Z)")).click();

		
		return Price_High_to_Low_Sorting ;
	
}

// Price (Low > High) //

}
