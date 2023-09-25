package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName) {
		
		try {
			 XSSFWorkbook workbook = new XSSFWorkbook("C:/Users/SilpaNair/eclipse-workspace/SwagLabsDemo/Excel/data.xlsx");
			 XSSFSheet sheet=workbook.getSheet("Sheet1");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]) {
		getCelldata(1,0);
		getCelldata(1,1);

	}
	

	public static void getCelldata(int rowNum,int colNum) {
		
		
		try {
		
		 String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		 String celldata1 = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
 
		 System.out.println(celldata);
		 System.out.println(celldata1);

		 
		
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		
	}
	
public static void getRowcount(int rowNum,int colNum) {	
		try {
	        	
          int rowcount=  sheet.getPhysicalNumberOfRows();
		 System.out.println("no of rows"+rowcount);
		
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}		
	}
	
public static void getColcount(int rowNum,int colNum) 
{	
	try 
	{
        	
      int colcount=  sheet.getPhysicalNumberOfRows();
	 System.out.println("no of columns"+colcount);
	
	}catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}		
}

public static void getCellDataNumber(int rowNum,int colNum) 
{	
	try 
	{
        	
      double celldata=  sheet.getPhysicalNumberOfRows();
	 System.out.println(celldata);
	
	}catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}		
}


public static void getCellDataString(int rowNum,int colNum) 
{	
	try 
	{
        	
      String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

	 System.out.println(celldata);
	
	}catch(Exception exp)
	{
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}		
}

}
