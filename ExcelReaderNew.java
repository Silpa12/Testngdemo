package utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderNew {
	 public static Object[][] readTestData1(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet(sheetName);

	        int rowCount = sheet.getLastRowNum();
	        int colCount = sheet.getRow(0).getLastCellNum();

	        Object[][] data1 = new Object[rowCount][colCount];

	        for (int i = 1; i <= rowCount; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < colCount; j++) {
	                Cell cell = row.getCell(j);
	               data1[i - 1][j] = cell.toString();
	            }
	        }

	        workbook.close();
	        fis.close();

	        return data1;
	    }
}
