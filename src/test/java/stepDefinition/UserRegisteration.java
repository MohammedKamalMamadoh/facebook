package stepDefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DashBoardPage;
import tests.TestBase;

public class UserRegisteration extends TestBase{
	DashBoardPage dashboardObject;
	
	@Given("^userin dashboard page$")
	public void userin_dashboard_page()  {

	}

	@When("^enter his information\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void enter_his_information(String firstname, String lastname,
			String email, String confirmEmail, String password) {
		dashboardObject= new DashBoardPage(driver);
		dashboardObject.UserEnterHisInformation(firstname,lastname,email,confirmEmail,password);
	    
	}

	@When("^click on sign up button$")
	public void click_on_sign_up_button() {
		dashboardObject= new DashBoardPage(driver);
		dashboardObject.ClickOnSignUpButton();

	}

	@Then("^user can register successfully$")
	public void user_can_register_successfully() {
		driver.navigate().refresh();
	}

}
