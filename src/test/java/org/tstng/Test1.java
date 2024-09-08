package org.tstng;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups = "Tcs")
	private void tc1() {
		System.out.println("test1");
	}
	
	@Test(groups = "HCL")
	private void tc2() {
		System.out.println("test2");
	}

	@Test(groups = "Tech")
	private void tc3() {
		System.out.println("test3");
	}

	@Test(groups = "Tcs")
	private void tc4() {
		System.out.println("test4");
	}

}
