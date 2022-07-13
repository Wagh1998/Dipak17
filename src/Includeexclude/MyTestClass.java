package Includeexclude;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestClass {
  @Test
  public void d() 
  {
	Reporter.log("d is running",true);  
  }
  @Test()
  public void a()
  {
	  Reporter.log("a is running",true);   
  }
  @Test(priority=0)
  public void c()
  {
	  Reporter.log("c is running",true);   
  }
  
}
