package pack1;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromXLSheet {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("C://Users//lenovo//Desktop//Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		
		for (int i=0;i<sh.getLastRowNum();i++)
		{Row row =sh.getRow(i);
			String firstCell= row.getCell(0).getStringCellValue();
			String SecondCell= row.getCell(1).getStringCellValue();
			System.out.println(firstCell+" "+ " "+SecondCell);
			
		}
	}

}
