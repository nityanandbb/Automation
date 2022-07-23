package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworkpackage.BaseDriver;

public class AllDesktopPage extends BaseDriver {

	WebDriver driver;

	public List<WebElement> WebElement;

	public AllDesktopPage(WebDriver driver) {

		driver = this.getDriver();
	}

	public WebElement openAllDesktopPage(WebDriver driver) {

		WebElement desktopTab = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[1]"));

		desktopTab.click();

		WebElement allDesktopBtn = desktopTab.findElement(By.xpath("//div[@class='dropdown-menu']/a[1]"));

		return allDesktopBtn;

	}

	public WebElement sortProductsAtoZ(WebDriver driver) {

		WebElement SortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));

		WebElement sortingOptions = SortBtn
				.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));

		WebElement aTozSorting = sortingOptions.findElement(By.xpath("//*[@id='input-sort']/option[2]")); // ("Name (A
																											// -
																											// Z)")).click();

		return aTozSorting;

	}

	public WebElement sortProductsZtoA(WebDriver driver) {

		WebElement sortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));

		WebElement sortingOptions = sortBtn
				.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));

		WebElement zToaSorting = sortingOptions.findElement(By.xpath("//*[@id='input-sort']/option[3]")); // ("Name (A
																											// -
																											// Z)")).click();

		return zToaSorting;

	}

	public WebElement sortProductsPriceLowtoHigh(WebDriver driver) {
		WebElement sortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));

		WebElement sortingOptions = sortBtn
				.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));

		WebElement priceLowToHighSorting = sortingOptions.findElement(By.xpath("//*[@id='input-sort']/option[4]")); // ("Name
																													// (A
																													// -
																													// Z)")).click();

		return priceLowToHighSorting;

	}

	public WebElement sortProductsPriceHightoLow_(WebDriver driver) {
		WebElement sortBtn = driver.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]"));

		WebElement sortingOptions = sortBtn
				.findElement(By.xpath("//div[@class='col-md-4 col-xs-6']/div/select[1]/option"));

		WebElement priceHighToLowSorting = sortingOptions.findElement(By.xpath("//*[@id='input-sort']/option[4]")); // ("Name
																													// (A
																													// -
																													// Z)")).click();

		return priceHighToLowSorting;

	}

}
