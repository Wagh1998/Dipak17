package testNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass2 {
	@Test(groups= {"sanity"})
	  public void p() 
	  {
		  Reporter.log("P is running,sanity",true);
	  }
	  @Test(groups= {"Regression"})
	  public void q()
	  {
		  Reporter.log("Q is running,regression",true);
	  }
	  @Test(groups= {"sanity"})
	  public void r()
	  {
	  Reporter.log("R is running,sanity",true);
	  }
	  @Test(groups= {"Regression"})
	  public void s()
	  {
		  Reporter.log("S is running,regression",true);
	  }
}
