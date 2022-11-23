package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class example1 {
	WebDriver d;
	By username=By.name("username");
	By password=By.name("password");
	By login=By.name("submit");
	 example1(WebDriver d){
		 this.d=d;
	 }
	 public void uname() {
		 d.findElement(username).sendKeys("Admin");
	 }
	 public void pass() {
		 d.findElement(password).sendKeys("admin123");
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
