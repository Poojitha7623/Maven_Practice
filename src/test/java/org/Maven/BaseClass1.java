package org.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass1 {
	
	
	static WebDriver driver;
	public static void browserLaunch() {
		//driver = new ChromeDriver();
		driver = new EdgeDriver();	
	}
	
	public static void closeBrowser(){
		
		driver.close();
	}
	
	public static void maxWindow() {
		
		driver.manage().window().maximize();
	}
	public static void launchUrl(String url) {
		
		driver.get(url);
	}
	public static void pageTitle() {
		
		String title = driver.getTitle();
	    System.out.println(title);
	}
	public static void pageUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	

}
