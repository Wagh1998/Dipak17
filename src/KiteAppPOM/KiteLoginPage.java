package KiteAppPOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	private static final WebElement Password = null;
	//1.data members
	@FindBy(id="userid")private WebElement userName;
	@FindBy(id="password")private WebElement password;
    @FindBy(xpath="//button[@type='submit']")private WebElement loginButton;

	//2.Constructor
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.methos
	public void sendUserName(String UserName)
	{
		userName.sendKeys(UserName);
	}
	public void sendPassword(String password)
	{
		Password.sendKeys(password);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	

}
