package screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import net.bytebuddy.utility.RandomString;

        public class ScreenShotOveride {
		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			
			File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String str=RandomString.make(4);
			File destination=new File("D:\\Java\\Screenshot\\"+str+".png");
			FileHandler.copy(source, destination);
		

	}

}
