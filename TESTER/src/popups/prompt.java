package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prompt {

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
		public void promptwindow(){
			
			d.findElement(By.id("promtButton")).click();
			
			Alert alt=d.switchTo().alert();
			System.out.println(alt.getText());
			alt.sendKeys("ajay");
			alt.accept();
		   WebElement a2=d.findElement(By.id("promptResult"));
		   System.out.println(a2.getText());
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prompt a1=new prompt();
		a1.opening_browser();
		a1.get_title();
		a1.get_current_url();
		a1.promptwindow();

	}

}
