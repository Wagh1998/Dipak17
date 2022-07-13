package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void mymethod() 
  {
	  Reporter.log("User ID Validated",true);
	  
  }
  @BeforeMethod
  public void logintoKiteApp()
  {
	  Reporter.log("Login sucess",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("browser launched ",true);
  }
  @AfterMethod
  public void logoutFromKiteApp()
  {
	  Reporter.log("lpgging out....",true);
	  
  }
  @AfterClass
  public void closedBrowser()
  {
	  Reporter.log("browser closed",true);
  }
}
