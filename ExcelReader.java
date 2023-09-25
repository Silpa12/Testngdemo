package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

 

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

 

import com.sun.org.apache.bcel.internal.classfile.Method;

public class ExcelReader {

	    public static Object[][] readTestData(String filePath, String sheetName) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = new XSSFWorkbook(fis);
	        Sheet sheet = workbook.getSheet(sheetName);

	        int rowCount = sheet.getLastRowNum();
	        int colCount = sheet.getRow(0).getLastCellNum();

	        Object[][] data = new Object[rowCount][colCount];

	        for (int i = 1; i <= rowCount; i++) {
	            Row row = sheet.getRow(i);
	            for (int j = 0; j < colCount; j++) {
	                Cell cell = row.getCell(j);
	                data[i - 1][j] = cell.toString();
	            }
	        }

	        workbook.close();
	        fis.close();

	        return data;
	    }
	}
 

