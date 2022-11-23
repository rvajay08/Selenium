
package selenium;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodscalling {
	
	public static void main(String[]args) throws IOException{
		
		methods  m1=new methods();
		FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\keys.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet xs=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row>row=xs.iterator();
		r=xs.getRow(2);
		while(row.hasNext()){
			r=row.next();
			c=r.getCell(2);
			String s1=c.getStringCellValue();
			if(s1.equals("openingbrowser")) {
			m1.openingbrowser();}
			else {
				if(s1.equals("navigate")) {
					m1.navigate();}
				else if(s1.equals("username")) {
					m1.username();}
				else if(s1.equals("password")) {
					m1.password();}
				else if(s1.equals("submit")) {
					m1.click();}
				
				else if(s1.equals("close")) {
					m1.close();}
				
						
				}
			}
			
			
		}
	}


