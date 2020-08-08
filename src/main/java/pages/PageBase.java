package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
	protected static WebDriver driver ;
	protected static JavascriptExecutor js;
	protected static Select selectDay;
	protected static Select selectMonth;
	protected static Select selectYear;
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	protected static void SendValueToElement (WebElement element , String value)
	{
		element.sendKeys(value);
	}
	protected static void click(WebElement element)
	{
		element.click();
	}
	public static void ScrollToButton()
	{
		
		js.executeScript("scrollBy(0,2000)");
	}
}
