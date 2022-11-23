package classesandobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_amazon {
	WebDriver d;
	public void Openingchrome(){
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=5143874284758147893&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=Cj0KCQjwk5ibBhDqARIsACzmgLSh-q_Cz98bCwx9je1NlQ2sp6WcixUmuM2w1OmZKoh8I4UdvthfK3caAk1_EALw_wcB");
		d.manage().window().maximize();
	}
	public void gettitle(){
		System.out.println(d.getTitle());
		
	}
	public void getcurrenturl() {
		System.out.println(d.getCurrentUrl());
		
	}
	public void drop() {
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<=drop1.size();i++) {
			System.out.println(drop1.get(i).getText());
			
		}
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
