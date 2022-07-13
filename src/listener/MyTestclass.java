package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestclass {
  @Test
  public void myMethod1() {
	  Reporter.log("Hi I am MyMethod1");
  }
  @Test
  public void myMethod2()
  {
	  Assert.fail();
	  Reporter.log("Hi I am MyMethod2");
  }
  @Test(dependsOnMethods= {"myMethod2"})
  public void myMethod3()
  {
	  Reporter.log("Hi I Am MyMethod3");
  }
}
