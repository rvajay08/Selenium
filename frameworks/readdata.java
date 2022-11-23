package frameworks;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class readdata {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\eclipse-workspace\\day6\\src\\frameworks\\a1.properties");
		Properties a1=new Properties();
		a1.load(f);
		
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		
		d.get(a1.getProperty("url"));
		d.manage().window().maximize();
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input")).sendKeys(a1.getProperty("username"));
		//d.get(a1.getProperty("username"));
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")).sendKeys(a1.getProperty("password"));
		System.out.println(a1.getProperty("password"));
		d.findElement(By.name("username")).sendKeys(a1.getProperty("username"));
		System.out.println(a1.getProperty("username"));
		d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[4]/td[2]/div/input")).click();
		d.close();
		

	}

}
