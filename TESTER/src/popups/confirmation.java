package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation {
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
		public void confirmation1() throws InterruptedException{
			d.findElement(By.id("confirmButton")).click();
			Alert alt=d.switchTo().alert();
			System.out.println(alt.getText());
			Thread.sleep(20);
			alt.accept();
	   	WebElement text=d.findElement(By.id("confirmResult"));
	   	System.out.println(text.getText());
		}
			public static void main(String[] args) throws InterruptedException{
				confirmation a1=new confirmation();
				a1.opening_browser();
				a1.get_title();
				a1.get_current_url();
				a1.confirmation1();
				
			
		// TODO Auto-generated method stub

	}

}
