package POM;

import org.openqa.selenium.chrome.ChromeDriver;

public class pom2_calling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		pom2 a1=new pom2(d);
		a1.b();
		a1.c();
		a1.e();
		a1.f();
		
		// TODO Auto-generated method stub

	}

}
