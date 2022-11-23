package ajay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/text-box");
		d.manage().window().maximize();
		d.findElement(By.id("userName")).sendKeys("ajay");
		d.findElement(By.id("userEmail")).sendKeys("rvajay@gmail.com");
		d.findElement(By.id("currentAddress")).sendKeys("kbitragunta");
		d.findElement(By.id("permanentAddress")).sendKeys("kbitragunta");
		WebElement t=d.findElement(By.id("submit"));
		t.click();
		String s=d.findElement(By.xpath("//*[@id=\"output\"]")).getText();
		System.out.println(s);
		

	}

}