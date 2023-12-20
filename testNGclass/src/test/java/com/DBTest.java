package com;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import DB.DBSource;
import DB.ReadData;

public class DBTest extends BaseTest {
	@Test(dataProviderClass = DBSource.class, dataProvider = "login")
	public void f(String n, String s) {
		driver.findElement(By.id("email")).sendKeys(n);
		System.out.println(n +"is typed user ID");
		Reporter.log(n +"is typed user ID");
		driver.findElement(By.id("pass")).sendKeys(s);
		Reporter.log(s +"is typed on password box");
	}
	@Test(dataProviderClass = ReadData.class, dataProvider = "test")
	public void g(String n, String s) {
		driver.findElement(By.id("email")).sendKeys(n);
		System.out.println(n +"is typed user ID");
		Reporter.log(n +"is typed user ID");
		driver.findElement(By.id("pass")).sendKeys(s);
		Reporter.log(s +"is typed on password box");
	}

	public void softAssult() {
		Assert.assertTrue(5 > 9);// Hard assert stops the whole case
		SoftAssert s = new SoftAssert();
		s.assertTrue(3 > 5);
		System.out.println("continue");
		s.assertFalse(3 > 9);
		s.assertAll();
	}

}
