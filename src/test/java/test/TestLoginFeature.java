package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;

import frameworkpackage.BaseDriver;
import junit.framework.Assert;
import pageobjects.LoginPage;
import pageobjects.RegistrationPage;

public class TestLoginFeature extends BaseDriver {

	@Test
	public void TestInvalidLogin() throws InterruptedException {

		LoginPage obj1 = new LoginPage(getDriver());

		obj1.MyAccountDropdownMenu().click();

		obj1.loginTest("nityanandb@gmail.com", "1234abcd");

		Assert.assertEquals(obj1.getCurrentPageURL(), "http://tutorialsninja.com/demo/index.php?route=account/login");

		Reporter.log(" Login Unsuccessful");

	}

	@Test
	public void TestValidLogin() {

		LoginPage obj2 = new LoginPage(getDriver());
		Reporter.log("Navigating to Login page to test valid credentials");

		obj2.MyAccountDropdownMenu().click();

		obj2.loginTest("nityanandb700@gmail.com", "9990#nity");

		Assert.assertEquals(obj2.getCurrentPageURL(), "http://tutorialsninja.com/demo/index.php?route=account/account");

		if (obj2.getCurrentPageURL().equals("http://tutorialsninja.com/demo/index.php?route=account/account")) {

			Reporter.log("Login Successful");

		} else {
			Reporter.log("Login Failed with Valid Credentials");
		}

	}

	@Test
	public void logoutTest() {
		LoginPage obj3 = new LoginPage(getDriver());

		obj3.logOutTest().click();
		Assert.assertEquals(obj3.getCurrentPageURL(), "http://tutorialsninja.com/demo/index.php?route=account/logout");

		Reporter.log("Logged Out");
	}
}
