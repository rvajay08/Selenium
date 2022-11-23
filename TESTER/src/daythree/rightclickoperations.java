package daythree;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class rightclickoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver a=new FirefoxDriver();
		a.get("https://www.google.co.in/");
		a.manage().window().maximize();
		WebElement link=a.findElement(By.linkText("Gmail"));
		Actions act=new Actions(a);
		act.contextClick(link).sendKeys("L").build().perform();
	}

	
}
				

	
