package DB;

import java.awt.event.ItemListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Helper;

// Might hear about Webdriver Listeners just google it

public class BaseListener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getName() + " is finished ");
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getName() + " is started ");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult r) {
		// TODO Auto-generated method stub
		System.out.println(r.getName() + " is " + r.getStatus());
		Helper.screenShot();
	}
	
	
	

	public void onTestSkipped(ITestResult r) {
		// TODO Auto-generated method stub
		System.out.println(r.getName() + " is " + r.getStatus());
		
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
