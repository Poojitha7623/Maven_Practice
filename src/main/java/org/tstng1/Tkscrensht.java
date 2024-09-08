package org.tstng1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tkscrensht {
	
	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	
	//1.downcasting
	// child ref = (child)parnt_ref;
	
	TakesScreenshot ts = (TakesScreenshot)driver;

	//2.to call the method -- rtn ty --file
	File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	
	// create foldr of scrensht
	//--/Maven_Practice/Screenshot  -- fldr path
	// --  D:\Test_Leaf\Maven_Practice\Screenshot -- fldr loc
	
	//3. scrnsht File loc in our prjct
	
	File f = new File("D:\\Test_Leaf\\Maven_Practice\\Screenshot\\fbpage.png");
	
	
	//4.copy file -- mrg 2&3 steps
	
	FileUtils.copyFile(screenshotAs, f);
			
			
			
	}
}
