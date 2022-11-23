package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	 
	WebDriver d;
	public void openingbrowser() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		 d = new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	}
	public void navigate() {
		d.manage().window().maximize();
	}
	public void username() {
		d.findElement(By.name("userName")).sendKeys("ajay");
	}
	public void password() {
		d.findElement(By.name("password")).sendKeys("ajay143");
	}
	public void click() {
		d.findElement(By.name("submit")).click();
	}
	public void close() {
		d.close();
		
		
	}
	

}
