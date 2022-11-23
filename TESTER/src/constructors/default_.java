package constructors;
//int a=10;
//int b=29;    sampleexample
//default_(){
//	int c=a+b;
//	System.out.println(c);
//}
//
//public static void main(String[] args) throws InterruptedException {
//	// TODO Auto-generated method stub
//	default_ a1=new default_();
//
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class default_ {
	WebDriver d;
	default_() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	d.manage().window().maximize();
	Thread.sleep(2000);
	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("sruthi");
	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	
	
//	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		default_ a1=new default_();

	}

}
