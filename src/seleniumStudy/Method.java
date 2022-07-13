package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		WebElement textBox =Driver.findElement(By.xpath("//input[@id='displayed-text']"));
		//WebElement hideBtn =Driver.findElement(By.name("hide-textbox"));
		//WebElement showBtn =Driver.findElement(By.name("show-textbox"));
		if(textBox.isDisplayed())
		{
			System.out.println("The Textbox is visible");
		}
		else
		{
			//hideBtn.click();
			System.out.println("The Textbox is not Visible");
		}
		
	}

}
