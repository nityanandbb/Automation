package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworkpackage.BaseDriver;

public class LoginPage extends BaseDriver {

	public By myAccountDropdown = By.xpath("//li[@class='dropdown']/a/span[1]");
	public By BtnLoginpage = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[2]/a");
	public By txtEmail = By.xpath("//input[@id='input-email']");
	public By txtPassword = By.xpath("//input[@id='input-password']");
	public By BtnLogin = By.xpath("//input[@type='submit']");
	public By BtnLogout = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[5]/a");

	public LoginPage(WebDriver driver) {

		driver = this.getDriver();
	}

	public WebElement MyAccountDropdownMenu() {

		driver.findElement(myAccountDropdown).click();

		WebElement btnLoginPage = driver.findElement(BtnLoginpage);

		return btnLoginPage;

	}

	public void loginTest(String email, String password) {

		driver.findElement(txtEmail).sendKeys(email);
		driver.findElement(txtPassword).sendKeys(password);

		driver.findElement(BtnLogin).click();

	}

	public String getCurrentPageURL() {

		return driver.getCurrentUrl();
	}

	public WebElement logOutTest() {

		driver.findElement(myAccountDropdown).click();

		WebElement BtnToLogout = driver.findElement(BtnLogout);
		return BtnToLogout;

	}

}
