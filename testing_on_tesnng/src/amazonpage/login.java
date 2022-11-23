package amazonpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class login {
	WebDriver d;
  @BeforeTest
  public void openigbrowser() {
	  System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=6465847870865448888&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302457&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=CjwKCAiA9qKbBhAzEiwAS4yeDUju2hOQvEZ8BVZ7We8O3AilBwVHhRSL5CqyjawMlaqZAjlCFaW-3hoC1wwQAvD_BwE");
	  d.manage().window().maximize();
	  
  }
  @Test(priority=1)
  public void title() {
	  
	 System.out.println(d.getTitle());
  }
  @Test(priority=2)
  public void currenturl() {
	  System.out.println(d.getCurrentUrl());
  }
}
	  
//  }
//  @Test(priority=3)
//  public void () {
//	  
//	 System.out.println(d.getTitle());
//  }
//  @Test(priority=1)
//  public void title() {
//	  
//	 System.out.println(d.getTitle());
//  }

