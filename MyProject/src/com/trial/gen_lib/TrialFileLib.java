package com.trial.gen_lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TrialFileLib {
/**
 * 
 * @param key
 * @return
 * @throws IOException
 */
	public String getPropertyKeyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./CommonData/data.properties");

		Properties pObj = new Properties();

		pObj.load(fis);
		String data = pObj.getProperty(key);
		return data;
	}


		public String getExcelData(String sheet, int rowNum, int cellNum) throws Throwable, Throwable
		{
			FileInputStream fis = new FileInputStream("./CommonData/ExcelData/Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Row row=sh.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			String value = cell.getStringCellValue();
			return value;
		}	
		public void setExcelData(String sheet, int rowNum, int cellNum,String data) throws Throwable, Throwable
		{
			FileInputStream fis = new FileInputStream("./CommonData/ExcelData/Book1.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Row row=sh.getRow(rowNum);
			Cell cell = row.getCell(cellNum);
			cell.setCellValue(data);
			FileOutputStream fos = new FileOutputStream("./CommonData/ExcelData/Book1.xlsx");
			wb.write(fos);
			wb.close();
		}	
}

