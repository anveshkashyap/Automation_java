package example;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demoexcel {
	
	public static void main(String[] args) throws Exception {
		String path = "./data/Book1.xlsx";
		Workbook wb= WorkbookFactory.create(new FileInputStream(path));
		String v1= wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String v2= wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(v1+" "+v2);
		for(int i=0;i<5;i++) {
			String v=wb.getSheet("Sheet1").getRow(0).getCell(i).toString();
			System.out.print(v+" ");
		}
		
	}

}
