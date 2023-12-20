package com;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	WebDriver driver; 
  @Parameters({"browser", "url"})
  
  @BeforeMethod(groups= "UI")
  public void beforeMethod(String a, String b) {
	  if(a.equals("chrome") ) {
		  driver = new ChromeDriver();
		  
	  }
	  else if(a.equals("firefox")) {
		  driver = new FirefoxDriver();
		  
	  }
	  driver.get(b);
	
  }

  @AfterMethod(alwaysRun= true)
  public void afterMethod(ITestResult r) {
	  switch(r.getStatus()) {
	  case ITestResult.SUCCESS:{
		  System.out.println(r.getName()+"is passed");
		  break;
	  }
	  
	  case ITestResult.FAILURE:{
		  System.out.println(r.getName()+"is failed");
		  Helper.screenShot();
		  break;
	  }
	  
	  }
	  System.out.println("Close browser and take screnshot once test case failes");
  }

  @BeforeClass(enabled= false)
  public void beforeClass() {
	  System.out.println("Usually open browser agaist dependent test cases");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Close browser if browser is opened in before class");
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Usuallly configured project parameter inorder to run");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Close whatever open in before test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Usually configured reporting file");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Close whatever open in after suit");
  }

}
