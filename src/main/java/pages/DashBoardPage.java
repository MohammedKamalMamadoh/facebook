package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DashBoardPage extends PageBase{

	public DashBoardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "firstname")
	WebElement firstName;
	
	@FindBy(name = "lastname")
	WebElement lastName;

	@FindBy(name = "reg_email__")
	WebElement emailOrPhone;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement confirmEmailtxt;

	@FindBy(name = "reg_passwd__")
	WebElement passwordtxt;

	@FindBy(id = "day")
	WebElement day;

	@FindBy(name = "birthday_month")
	WebElement month; 

	@FindBy(id = "year")
	WebElement year;
 
	@FindBy(css = "input[value='2']")
	WebElement  Gender;

	@FindBy(name = "websubmit")
	WebElement signUpButton;

	public void UserEnterHisInformation(String firstname, String lastname,
			String email, String confirmEmail, String password)
	{
		SendValueToElement(firstName, firstname);
		SendValueToElement(lastName, lastname);
		SendValueToElement(emailOrPhone, email);
		SendValueToElement(confirmEmailtxt, confirmEmail);
		SendValueToElement(passwordtxt, password);
		selectDay= new Select(day);
		selectDay.selectByVisibleText("20");
		selectMonth=new Select(month);
		selectMonth.selectByVisibleText("Feb");
		selectYear = new Select(year);
		selectYear.selectByVisibleText("1992");
		click(Gender);
	}
	public void ClickOnSignUpButton()
	{
		click(signUpButton);
	}
	
}
