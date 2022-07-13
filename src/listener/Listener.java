package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{
@Override
public void onTestFailure (ITestResult result)
{
	Reporter.log("screentest taken, please check TC",true);
}
@Override
public void onTestSuccess(ITestResult result)
{
	Reporter.log("TC is passed",true);
}
@Override
public void onTestSkipped(ITestResult result)
{
	Reporter.log("TC is Skipped please check dependant mrthod ",true);
}
	
}
