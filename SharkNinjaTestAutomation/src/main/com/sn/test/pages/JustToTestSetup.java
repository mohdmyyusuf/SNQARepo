package com.sn.test.pages;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class JustToTestSetup {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before test");
	}

	@Test
	public void fTestOne() {
		
		System.out.println("1");
	}
	
	@Test
	public void fTestTwo() {
		System.out.println("2");
	}
	
	@Test
	public void fTestThree() {
		System.out.println("3");
	}
	
	@Test
	public void fTestFour() {
		
		System.out.println("4");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after test");
	}

}
