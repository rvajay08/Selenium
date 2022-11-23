package multipleframes;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindowmessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String parentid=d.getWindowHandle();
		System.out.println(parentid);
		d.findElement(By.id("messageWindowButton")).click();
		Set<String>childid=d.getWindowHandles();
		System.out.println(childid);
		for(String handle: childid) {
			if(!handle.equalsIgnoreCase(parentid)) {
				d.switchTo().window(handle);
				WebElement a=d.findElement(By.xpath("/html/body"));
				System.out.println(a.getText());
				Thread.sleep(2000);
				d.close();

	}
		
	}
	}
}
	

