package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		//driver.switchTo().frame("iframeResult");

		//driver.findElement(By.xpath("//button[@type='button']")).click();

	}

}
