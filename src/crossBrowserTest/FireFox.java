package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FireFox {
  @Test
  public void myMethod() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\selenium\\geckodriver.exe");
		//WebDriver driver=new Driver();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(2000);
		
  }
  
}
