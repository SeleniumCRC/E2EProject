package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import base.TestBase;

public class UtilMethods extends TestBase {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int k=0;
		int coloumn = 0;
		
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Data\\registerCutomerData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
		if(workbook.getSheetName(i).equalsIgnoreCase("data"))
		{
		XSSFSheet sheet=workbook.getSheetAt(i);
		//Identify Testcases coloum by scanning the entire 1st row

		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
	
		Row firstrow= rows.next();
		while(rows.hasNext())
		{
			k++;
		}
		System.out.println(k);
		
		Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
		while(ce.hasNext())
		{
			coloumn++;
		}
		System.out.println(coloumn);
		
	}
		}
	
	}
		// TODO Auto-generated method stub
		
	}

			/*Cell value=ce.next();

		if(value.getStringCellValue().equalsIgnoreCase("TestCases"))
		{
		coloumn=k;

		}

		k++;
		}
		System.out.println(coloumn);

		////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		while(rows.hasNext())
		{

		Row r=rows.next();

		if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName))
		{

		////after you grab purchase testcase row = pull all the data of that row and feed into test

		Iterator<Cell>  cv=r.cellIterator();
		while(cv.hasNext())
		{
		Cell c= cv.next();
		if(c.getCellTypeEnum()==CellType.STRING)
		{

		a.add(c.getStringCellValue());
		}
		else{

		a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

		}
		}
		}


		}









		}
		}
		return a;

		}

		public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		}

		}
*/