package seleniumStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	
		//driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9168020242");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345@d");
	//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Fastrack NN1474SM01 Party Analog Watch - For Men");
	//	Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(2000);
	//	driver.findElement(By.xpath("//div[@class='_2B099V']")).click();
	//	Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@type='button']")).click();
		
	}
}