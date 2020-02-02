package com.w2a.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.relevantcodes.extentreports.LogStatus;
import com.w2a.base.Page;

import com.w2a.utilites.Utilites;

public class CustomListeners extends Page implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("on test start listener entering");
		test = rep.startTest(result.getName().toUpperCase());
		System.out.println("on test start exiting");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success entering");
		test.log(LogStatus.PASS, result.getName().toUpperCase()+" PASS");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		
		try {
			Utilites.captureScreenshot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+" Failed with exception :"+result.getThrowable());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilites.screenshotName));
		
		
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\"_blank\" href="+Utilites.screenshotName+">Screenshot</a>");
	    Reporter.log("<br>");
	    Reporter.log("<br>");
	    // for thumbnail
	    Reporter.log("<a target=\"_blank\" href="+Utilites.screenshotName+"><img src="+Utilites.screenshotName+" height=200 width=200></img></a>");
		
	    
	    rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName().toUpperCase()+" Skipped the test as the Run mode is NO");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
