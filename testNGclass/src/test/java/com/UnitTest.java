package com;

import org.testng.annotations.Test;

public class UnitTest extends BaseTest {
	@Test
	public void signIn() {
		System.out.println("SignIn");
		
	}
	
	@Test(description= "this method id for sign out")
	public void signOut() {
		System.out.println("SignOut");
		
	}
	
	@Test(groups= "backend")
	public void validatBackEnd() {
		System.out.println("SignIn");
		
	}

}
