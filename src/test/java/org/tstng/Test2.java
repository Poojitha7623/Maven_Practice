package org.tstng;

import org.testng.annotations.Test;

public class Test2 {
	
	
	
	@Test(groups = "Hcl")
	private void tc5() {
		System.out.println("test5");
	}
	
	@Test(groups = "Tcs")
	private void tc6() {
		System.out.println("test6");
	}

	@Test(groups = "Tech")
	private void tc7() {
		System.out.println("test7");
	}

	@Test(groups = "Tcs")
	private void tc8() {
		System.out.println("test8");
	}


}
