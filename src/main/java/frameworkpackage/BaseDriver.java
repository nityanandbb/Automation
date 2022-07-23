package frameworkpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseDriver {

	WebDriver driver = null;

	public WebDriver getDriver() {

		return this.driver;

	}

	@BeforeClass
	public void setupApplication() {

		Reporter.log("=====Browser Session Started=====", true);

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://tutorialsninja.com/demo/");

		Reporter.log("=====Application Started=====", true);
	}

	@AfterClass
	public void closeApplication() throws InterruptedException {
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
	}

}
