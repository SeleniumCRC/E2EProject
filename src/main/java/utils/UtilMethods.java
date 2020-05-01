package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import base.TestBase;

public class UtilMethods extends TestBase{
	
	public void  getData(String sheetName) throws FileNotFoundException {
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Data\\registerCutomerData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
	
	 
	
	
	}
}
