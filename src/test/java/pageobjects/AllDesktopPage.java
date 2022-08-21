package pageobjects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworkpackage.BaseDriver;
import junit.framework.Assert;

public class AllDesktopPage extends BaseDriver {

	// WebDriver driver;

	public By desktopTab = By.xpath("//ul[@class='nav navbar-nav']/li[1]");

	public By getallDesktopBtn = By.xpath("//div[@class='dropdown-menu']/a[1]");

	public By productNameList = By.xpath("//div[@class='caption']"); // 

	List<WebElement> productName = driver.findElements(productNameList);

	public By productNameData = By.xpath("//div[@class='caption']/h4");
	public By productPriceData = By.xpath("//*[@class='price']");

	List<String> originalproductDetails = new ArrayList<>();
	List<String> originalProductNameList = new ArrayList<>();
	List<String> originalProductPriceList = new ArrayList<>();

	String originalproductNames;
	String originalproductPrice;

	
	List<String> productDetails = new ArrayList<>();

	public AllDesktopPage(WebDriver driver) {

		driver = this.getDriver();
	}

	public WebElement openAllDesktopPag() {

		driver.findElement(desktopTab).click();

		WebElement allDesktopBtn = driver.findElement(desktopTab).findElement(getallDesktopBtn);

		return allDesktopBtn;

	}

	public List<String> getProductNameAndPrice() {

		List<WebElement> productName = driver.findElements(productNameList);

		for (WebElement webElement : productName) {

			originalproductNames = webElement.findElement(By.tagName("h4")).getText();
			originalproductPrice = webElement.findElement(By.className("price")).getText();
			originalproductDetails.add(originalproductNames);
			originalproductDetails.add(originalproductPrice);

			// Adding to To Below array for comparing results
			originalProductNameList.add(originalproductNames);
			originalProductNameList.add(originalproductPrice);

			System.out.println(originalproductDetails);

		}

		return (originalproductDetails);

	}

	public List<String> sortyByproduct(String SortByVisibleText) {

		Select selectSort = new Select(driver.findElement(By.xpath("//select[@id='input-sort']")));

		selectSort.selectByVisibleText(SortByVisibleText);

		List<WebElement> productNamesList = driver.findElements(productNameData);
		List<WebElement> productPriceList = driver.findElements(productPriceData);

		// Using java streams.
		List<String> actualproductNames = productNamesList.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> actualproductPrice = productPriceList.stream().map(s -> s.getText()).collect(Collectors.toList());

		Assert.assertTrue(originalproductNames.equals(actualproductNames));

		Assert.assertTrue(originalproductPrice.equals(actualproductNames));

		// If using for loop then use below code

		/*
		 * for (WebElement webElement : productName) {
		 * 
		 * productNames = webElement.findElement(By.tagName("h4")).getText();
		 * productPrice = webElement.findElement(By.className("price")).getText();
		 * productDetails.add(productNames); productDetails.add(productPrice);
		 * 
		 * System.out.println(productDetails); }
		 */

		// System.out.println("Product details = "+productDetails);

		return productDetails;
	}

}
