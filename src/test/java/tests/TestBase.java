package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import helper.ScreenShot;
import helper.WebDriverEventListenerC;

public class TestBase extends AbstractTestNGCucumberTests {
	
	public static WebDriver driver;
	public static WebDriverEventListenerC WebListenr;
	public static EventFiringWebDriver EventDriver;
	
	@BeforeMethod
	public static void StartDriver()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		WebListenr = new WebDriverEventListenerC();
		EventDriver = new EventFiringWebDriver(driver);
		EventDriver.register(WebListenr);
		driver=EventDriver; 

	}
	
	@AfterMethod
	public void CloseDriver(ITestResult result ) throws IOException
	{
		if (ITestResult.FAILURE==result.getStatus()) {
			ScreenShot.CaptureScreenShots(driver, result.getName());
		}
		driver.quit();
	}

}
