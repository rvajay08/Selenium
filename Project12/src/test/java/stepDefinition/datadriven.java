package stepDefinition;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datadriven {
	WebDriver d;
	@Given("user opens newtours website")
	public void user_opens_newtours_website() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		
	    
	}

	@When("click register link")
	public void click_register_link() {
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));
	}
	    

	@Then("user needs to select india from dropdown")
	public void user_needs_to_select_india_from_dropdown() throws IOException {
		
	

	
	FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\cucumber.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	Row r=null;
	Cell c=null;
	    WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
	    List<WebElement>a1=a.findElements(By.tagName("country"));
	    System.out.println(a1.size());
	    for (int i=0;i<a1.size();i++) {
	    	System.out.println(a1.get(i).getText());
	    	r=ws.createRow(i);
	    	r.createCell(0).setCellValue(i+1);
	    	r.createCell(0).setCellValue(a1.get(i).getText());
	    	a1.get(i).click();
	    	if(!a1.get(i).isSelected()){
	    		r.createCell(1).setCellValue("fail");
	    	}
	    	else{
	    		r.createCell(1).setCellValue("pass");
	    	}
	    	
	    }
	    FileOutputStream f1=new FileOutputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\cucumber.xlsx");
		wb.write(f1);
		f1.close();
	}

	@And("navigate to home page")
	public void navigate_to_home_page() {
	    d.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
