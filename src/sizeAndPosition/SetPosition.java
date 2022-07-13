package sizeAndPosition;

import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);

		System.out.println(driver.manage().window().getPosition());
		org.openqa.selenium.Point p=new org.openqa.selenium.Point(500,10 );
		//using setposition method we can set the browser position
		driver.manage().window().setPosition(p);
	}

}
