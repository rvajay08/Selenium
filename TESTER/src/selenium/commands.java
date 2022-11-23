package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=6726421906708684418&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=CjwKCAjw8JKbBhBYEiwAs3sxN4MaFeJzwYkSxoSLDEy0gouugX64-kxWN9nqKETFBf7C0RQ7zNGt4xoCrn0QAvD_BwE");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		boolean enabled=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(enabled);
		boolean displayed=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(displayed);
		
		

	}

}
