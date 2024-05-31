package com.crm.ExternelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
    
    public static String excelFile(int row, int cell) throws EncryptedDocumentException, IOException {
        FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginFile.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet("Sheet4");
        String Excel_Result = sheet.getRow(row).getCell(cell).toString();
        return Excel_Result;
    }
}
