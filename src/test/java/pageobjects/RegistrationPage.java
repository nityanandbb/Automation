package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import frameworkpackage.BaseDriver;
import junit.framework.Assert;

public class RegistrationPage extends BaseDriver {

	public By myAccountDropdown = By.xpath("//li[@class='dropdown']/a/span[1]");
	public By BtnRegister = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");

	public By txtFirtstname = By.xpath("//input[@id='input-firstname']");
	public By txtLastname = By.xpath("//input[@id='input-lastname']");

	public By txtEmail = By.xpath("//input[@id='input-email']");

	public By txtTelephone = By.xpath("//input[@id='input-telephone']");

	public By inputPassword = By.xpath("//input[@id='input-password']");

	public By inputConfirmPassword = By.xpath("//input[@id='input-confirm']");

	public By BtnRadioSelNo = By.xpath("//div[@class='form-group']/div/label[2]/input");

	public By privacyPolicyCheckbox = By.xpath("//input[@name='agree']");

	public By BtnContinue = By.xpath("//input[@class='btn btn-primary']");

	public By registractionSuccesfull = By.xpath("//*[@id='content']/h1");

	public RegistrationPage(WebDriver driver) {

		driver = this.getDriver();
	}

	public WebElement MyAccountDropdownMenu() {

		driver.findElement(myAccountDropdown).click();

		WebElement linkRegister = driver.findElement(BtnRegister);

		return linkRegister;

	}

	public void registrationForm(String firstName, String lastName, String Email, String telePhone, String password,
			String confirmPassword) {

		driver.findElement(txtFirtstname).sendKeys(firstName);
		driver.findElement(txtLastname).sendKeys(lastName);
		driver.findElement(txtEmail).sendKeys(Email);
		driver.findElement(txtTelephone).sendKeys(telePhone);
		driver.findElement(inputPassword).sendKeys(password);
		driver.findElement(inputConfirmPassword).sendKeys(confirmPassword);

		boolean newsLetteSelectState = driver.findElement(BtnRadioSelNo).isSelected();
		if (newsLetteSelectState == false) {

			driver.findElement(BtnRadioSelNo).click();

		}

		// Privacy policy checkbox checking

		driver.findElement(privacyPolicyCheckbox).click();

		driver.findElement(BtnContinue).click();

		String SuccessfulRegistration = driver.findElement(registractionSuccesfull).getText();

		Assert.assertTrue(SuccessfulRegistration.equals("Your Account Has Been Created!"));

		if (SuccessfulRegistration.equals("SuccessfulRegistration")) {

			Reporter.log("Registration is successful");
		}

	}

	public String getCurrentPageURL() {

		return driver.getCurrentUrl();

	}
}
