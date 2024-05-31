package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

//This program is not working

public class WriteDataToExcel {
	
	@Test
	public void dataToExcel() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\dipam\\Desktop\\Project Excel File.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("anyData");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\dipam\\Desktop\\Project Excel File.xlsx");
		wb.write(fos);
		wb.close();
	}

}
