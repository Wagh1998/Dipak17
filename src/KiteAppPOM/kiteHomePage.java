package KiteAppPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomePage 
{
	//1.declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement userName;
    @FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
    
    //2.constructor
    public kiteHomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    //method
    public void validateUserName(String exepectedUserID)
    {
    	String exepectedUserName=exepectedUserID;
    	String actualUserName = userName.getText();
    	
    	if(exepectedUserName.equals(actualUserName))
    	{
    		System.out.println("actual and exepected user id are matching TC are paseed");
    	}
    	else
    	{
    	System.out.println("actual and exepected user id are not matching TC are failed");	
    		
    	}
    }
    
    public void logout() throws InterruptedException
    {
    	userName.click();
    	Thread.sleep(200);
    	logoutButton.click();
    }
}
