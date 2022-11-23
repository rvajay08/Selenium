package selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class dropdownelements {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAjw8JKbBhBYEiwAs3sxN4scpQD8l1NGVtFyQuQZpuxaGaNjb5gw307VERCNGVOpyDx3OfdFuRoCn6UQAvD_BwE_k_&gclid=CjwKCAjw8JKbBhBYEiwAs3sxN4scpQD8l1NGVtFyQuQZpuxaGaNjb5gw307VERCNGVOpyDx3OfdFuRoCn6UQAvD_BwE");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		WebElement drop=d.findElement(By.id("searchDropdownBox"));
		List<WebElement>drop1=drop.findElements(By.tagName("option"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++) {
			System.out.println(drop1.get(i).getText());
			drop1.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			d.get("https://www.amazon.in/?ie=UTF8&tag=googmantxtmob50-21&ascsubtag=_k_CjwKCAjw8JKbBhBYEiwAs3sxN4scpQD8l1NGVtFyQuQZpuxaGaNjb5gw307VERCNGVOpyDx3OfdFuRoCn6UQAvD_BwE_k_&gclid=CjwKCAjw8JKbBhBYEiwAs3sxN4scpQD8l1NGVtFyQuQZpuxaGaNjb5gw307VERCNGVOpyDx3OfdFuRoCn6UQAvD_BwE");
			drop=d.findElement(By.id("searchDropdownBox"));
			drop1=drop.findElements(By.tagName("option"));
			

	}
		File b1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(b1,new File("C:\\Users\\Reddy\\OneDrive\\Pictures\\Saved Pictures.png"));
		

}
}
