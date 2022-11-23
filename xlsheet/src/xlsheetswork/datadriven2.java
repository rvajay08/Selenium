package xlsheetswork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datadriven2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\links.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet ws=wb.getSheet("sheet1");
Row r=null;
Cell c=null;
System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
ChromeDriver d=new ChromeDriver();
d.get("https://demo.guru99.com/test/newtours/");
d.manage().window().maximize();
WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
List<WebElement>a1=a.findElements(By.tagName("a"));
System.out.println(a1.size());
for (int i=0;i<a1.size();i++){
	System.out.println(a1.get(i).getText());
	a1.get(i).click();
	d.navigate().back();
	 a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
	a1=a.findElements(By.tagName("a"));
	r=ws.createRow(i);
//	String c=d.getTitle();
//	System.out.println(c);
	r.createCell(0).setCellValue(a1.get(i).getText());
	if(!a1.get(i).isSelected()) {
		r.createCell(1).setCellValue("pass");
	}
	else {
		r.createCell(1).setCellValue("fail");
	}
}
FileOutputStream f1=new FileOutputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\links.xlsx");
wb.write(f1);
f1.close();
	
	
	
}


	}


