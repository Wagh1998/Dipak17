package KiteAppPOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		File myfile=new File("C:\\Users\\hp\\Desktop\\selenium\\TestExcel26MarchB.xlsx");
	    Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet2");
	    String UN = mySheet.getRow(5).getCell(0).getStringCellValue();
	    String PWD = mySheet.getRow(5).getCell(1).getStringCellValue();
	    String PIN = mySheet.getRow(5).getCell(2).getStringCellValue();
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName(UN);
		login.sendPassword(PWD);
		login.clickLoginButton();
		Thread.sleep(2000);
		
		kitePinPage pin=new kitePinPage(driver);
		pin.sendpin(PIN);
		pin.clickContinueButon();
		Thread.sleep(2000);
		
		kiteHomePage home=new kiteHomePage(driver);
		home.validateUserName(UN);
		home.logout();
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
