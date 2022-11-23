package xlsheetswork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Reddy\\OneDrive\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row>row=ws.iterator();
		while(row.hasNext())
		{
			r=row.next();
			Iterator<Cell>cell=r.iterator();
			System.out.println();
			while(cell.hasNext())
			{
				c=cell.next();
				if(c.getCellType()==c.CELL_TYPE_NUMERIC) {
					System.out.print(c.getNumericCellValue()+" ");
				}
				else if(c.getCellType()==c.CELL_TYPE_STRING)
				System.out.print(c.getRichStringCellValue()+" ");
			}
			
			
		}
		// TODO Auto-generated method stub

	}

}
