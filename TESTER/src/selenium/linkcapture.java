package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.jetty.server.Response.OutputType;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcapture {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement>b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			b.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
			b=a.findElements(By.tagName("a"));
			
			
			
			
		}
		File b1=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(b1, new File("C:\\Users\\Reddy\\OneDrive\\Desktop.png"));
		
			
		
	}

}
