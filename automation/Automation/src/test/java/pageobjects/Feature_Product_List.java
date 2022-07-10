package pageobjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Framework_Package.BaseDriver;

public class Feature_Product_List extends BaseDriver {

	WebDriver driver;
	public List<WebElement> WebElement;
	
//	public List<String> all_elements_text=new ArrayList<>();

	public Feature_Product_List(WebDriver driver) {

		driver = this.getDriver();
	}
	String Product_Names;
	String Product_Price;
	List<String> Product_Details = new ArrayList<>();
	public List<String> get_Product_Name_And_Price (WebDriver driver) { 
		
	//	List<WebElement> Prod_Name = driver.findElements(By.xpath("//div[@class='caption']")); // /h4
		
		List<WebElement> Prod_Name = driver.findElements(By.xpath("//div[@class='caption']")); // /h4
		
		for (WebElement webElement : Prod_Name) {
	
			// Product_Names.add(webElement.findElement(By.tagName("h4")).getText());
			Product_Names = webElement.findElement(By.tagName("h4")).getText();
			Product_Price = webElement.findElement(By.className("price")).getText();
			Product_Details.add(Product_Names);
			Product_Details.add(Product_Price);

		}
		System.out.println("return Block");
		return (Product_Details);
	}

		
	

}
