package test;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newtours {
	WebDriver d;

@Given("opening new tours application")
public void opening_new_tours_application() {
	System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
    d=new ChromeDriver();
    d.get("https://demo.guru99.com/test/newtours/");
    d.manage().window().maximize();
    
}

@When("Giving user name and password")
public void giving_user_name_and_password() throws IOException, InterruptedException {
	objrepos obj12=new objrepos();
	    String a=obj12.get_uname();
	    String b=obj12.get_pword();
	    d.findElement(By.name("userName")).sendKeys(a);
	    d.findElement(By.name("password")).sendKeys(b);
	    Thread.sleep(2000);
	    
	    
    
}

@Then("capture the screenshot")
public void capture_the_screenshot() throws IOException {
	File x=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
    Files.copy(x,new File("Desktop"));
}
   

@And("click register push country names to excel")
public void click_register_push_country_names_to_excel() throws IOException {
	FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\spy123.xlsx");
    @SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(f);
    XSSFSheet ws=wb.getSheet("Sheet1");
    Row r=null;
    d.findElement(By.linkText("REGISTER")).click();
    WebElement drop=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
    List<WebElement>drop2=drop.findElements(By.tagName("option"));
    System.out.println(drop2.size());
    for(int i=0;i<drop2.size();i++) {
    	r=ws.createRow(i);
    	r.createCell(0).setCellValue(drop2.get(i).getText());
    }
    FileOutputStream f1=new FileOutputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\spy123.xlsx");
    wb.write(f1);
    f1.close();
    f1.close();
    
}


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
