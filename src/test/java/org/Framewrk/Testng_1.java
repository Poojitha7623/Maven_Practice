package org.Framewrk;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng_1 {
	
	@BeforeClass
	private void bfrcls() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	}
	// Test Case 1
	@Test(priority = -1)
	public void test1() {
	System.out.println("Test Case 1");
	}// Test Case 2
	@Test(priority = 100)
	public void test2() {
	System.out.println("Test Case 2");
	}
	
	@Test(priority = 67)
	public void tc1() {
		System.out.println("TC1");
	}
	@Test
	public void tc2() {
		System.out.println("TC2");
	}
	
	@Test(priority = -5)
	public void tc3() {
		System.out.println("TC3");
	}
	
	@AfterMethod
	public void Aftermethod() {
	System.out.println("After Method");
	}
	
	@AfterClass
	private void aftrcls() {
		System.out.println("After Class");

	}
}
