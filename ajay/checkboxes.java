package ajay;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demoqa.com/checkbox");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		WebElement check=d.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]/svg"));
		List<WebElement>check1=d.findElements(By.tagName("spam"));
		System.out.println(check1.size());
		
		
		

	}

}
