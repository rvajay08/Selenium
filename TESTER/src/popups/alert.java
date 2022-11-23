package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {
	WebDriver d;
	public void opening_browser() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demoqa.com/alerts");
		d.manage().window().maximize();
	}
	public void get_title() {
		String a=d.getTitle();
		System.out.println(a);
	}
	public void get_current_url() {
		String b=d.getCurrentUrl();
		System.out.println(b);
		}
	public void alert_message(){
		d.findElement(By.id("alertButton")).click();
		
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}

	public static void main(String[] args){
		alert a1=new alert();
		a1.opening_browser();
		a1.get_current_url();
		a1.alert_message();
		// TODO Auto-generated method stub

	}

}
