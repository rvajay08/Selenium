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

public class checkboxes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://echoecho.com/htmlforms09.htm");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		//d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]")).click();
		d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]")).click();
		WebElement check=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement>check1=check.findElements(By.tagName("input"));
		System.out.println(check1.size());
		for(int i=0;i<check1.size();i++)
		{
			System.out.println(check1.get(i).getAttribute("checked")+" "+check1.get(i).getAttribute("value"));
			
		}
		File a1=((TakesScreenshot)d).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(a1,new File("C:\\Users\\Reddy\\OneDrive\\Pictures\\Saved Pictures\\new1.png"));
		
		
		
			}

}
