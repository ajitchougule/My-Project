package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this file contain related method,which is used to read the data from excel wb
 * 
 * @author Ajit
 *
 */

public class FileLib {
	/**
	 * it is used to get property key value from commondata.properties.
	 * 
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./Common Data/config.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String value = pObj.getProperty(key);
		return value;
	}

	/**
	 * 
	 * @param sheet
	 * @param rowNum
	 * @param cellNum
	 * @return
	 * @throws Throwable
	 */

	public String getExcelData(String sheet, int rowNum, int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNum);
		String data = cel.getStringCellValue();
		return data;

	}

	/**
	 * 
	 * @param sheet
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Throwable
	 * @throws IOException
	 */
	public void setExcelData(String sheet, int rowNum, int cellNum, String data) throws Throwable, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo\\Desktop\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Row row = sh.getRow(rowNum);
		Cell cel = row.getCell(cellNum);
		cel.setCellValue(data);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Book1.xlsx");
		wb.write(fos);
		wb.close();

	}

}
