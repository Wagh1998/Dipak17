package KiteAppPOM;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitePinPage {
	private static final WebElement pin = null;
	//1.declaration
	@FindBy(id="pin")private WebElement PIN;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	//2.constructor
	public kitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methods
	public void sendpin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	public void clickContinueButon()
	{
	continueButton.click();
	}
	
	
	}
	


