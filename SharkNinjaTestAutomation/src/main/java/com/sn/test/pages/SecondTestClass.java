package com.sn.test.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sn.test.util.ReporterUtilityIt;

@Listeners(ReporterUtilityIt.class)
public class SecondTestClass {
	

@BeforeMethod
	public void beforeMethod() {
		System.out.println("before test");
	}

	@Test(priority = 1)
	public void fTestOne() {
		
		System.out.println("1");
	}
	
	@Test(priority = 2)
	public void fTestTwo() {
		System.out.println("2");
	}
	
	@Test(priority = 3)
	public void fTestThree() {
		System.out.println("3");
	}
	
	@Test(priority = 4)
	public void fTestFour() {
		
		System.out.println("4");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("after test");
	}



}
