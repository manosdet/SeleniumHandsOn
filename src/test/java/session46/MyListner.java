package session46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {


	public void onStart(ITestContext context) {
		System.out.println("test execution strted");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test started...");
	}


	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}


	public void onTestFailure(ITestResult result) {
	System.out.println("test failed");
	}


	public void onTestSkipped(ITestResult result) {
		System.out.println("test got skipped");
	}


	public  void onFinish(ITestContext context) {
		System.out.println("test execution is completed....");
	}

}
