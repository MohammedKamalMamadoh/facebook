package tests;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.LoadDataFromPropertiesFile;
import pages.DashBoardPage;

public class DashBoardTest extends TestBase {

	DashBoardPage dashboardObject;
	public String firstname=LoadDataFromPropertiesFile.userdata.getProperty("firstname");
	public String lastname =LoadDataFromPropertiesFile.userdata.getProperty("lastname");
	public String email =LoadDataFromPropertiesFile.userdata.getProperty("email");
	public String confirmEmail =LoadDataFromPropertiesFile.userdata.getProperty("confirmEmail");
	public String password =LoadDataFromPropertiesFile.userdata.getProperty("password");

	@Test
	public void UserRegisteration()
	{
		dashboardObject= new DashBoardPage(driver);
		dashboardObject.UserEnterHisInformation(firstname,lastname,email,confirmEmail,password);
		dashboardObject.ClickOnSignUpButton();
		Assert.assertNotEquals(driver.getCurrentUrl(), "https://web.facebook.com/?_rdc=1&_rdr");
	}
}
