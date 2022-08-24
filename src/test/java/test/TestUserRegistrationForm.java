package test;

import org.junit.Assert;
import org.testng.annotations.Test;

import frameworkpackage.BaseDriver;
import pageobjects.RegistrationPage;

public class TestUserRegistrationForm extends BaseDriver {

	@Test
	public void RegistrationFormTest() throws InterruptedException {

		RegistrationPage obj = new RegistrationPage(getDriver());

		obj.MyAccountDropdownMenu().click();

		obj.registrationForm("Nityanand", "Bharati", "nityanandb700@gmail.com", "9561222237", "9990#nity", "9990#nity");

		Assert.assertEquals(obj.getCurrentPageURL(), "http://tutorialsninja.com/demo/index.php?route=account/success");
	}
}
