package crossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	@Parameters ("browserName")
  @Test
  public void myMethod(String name) 
  {
		WebDriver driver =null;
		
	 if(name.equals("firefox"))
	 {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Desktop\\selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
	 }
	 else if (name.equals("chrome")) 
		 
	 {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	 }
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		//Thread.sleep(2000);
  }
}
