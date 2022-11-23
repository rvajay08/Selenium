package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class pom2 {
	WebDriver d;
	By fname=By.name("firstName");
	By lname=By.name("lastName");
	By ph=By.name("phone");
	By uname=By.name("userName");

	pom2(WebDriver d){
		this.d=d;
	
		// TODO Auto-generated constructor stub
	}
	public void b() {
		d.findElement(fname).sendKeys("ajay");
		
	}
	public void c() {
		d.findElement(lname).sendKeys("naidu");
	}
	public void e() {
		d.findElement(ph).sendKeys("8106045810");
	}
	public void f() {
		d.findElement(uname).sendKeys("ajaynaiu08");
	}
	

	
}
