package org.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	

	public static void main(String[] args) {
		
		
		
WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/login/");

		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		System.out.println(driver.getTitle());
	
		driver.findElement(By.id("email")).sendKeys("DNK");
		
		driver.findElement(By.name("pass")).sendKeys("55555");
		
		driver.close();
		
		WebDriver driver1 = new EdgeDriver();
		
		driver1.get("https://www.snapdeal.com/");
		
		
		
		
		
		
		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/login/");
//
//		driver.manage().window().maximize();
//	
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("DNK");
//		
//		WebElement pswrd = driver.findElement(By.name("pass"));
//		pswrd.sendKeys("55555");
		
	}

}
