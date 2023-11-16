package practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class General {
	
	public void general() {
		try {
			File file = new File("./data/Read.xlsx");
			FileInputStream open = new FileInputStream(file);
			Workbook o = new XSSFWorkbook(open);
			Sheet sheet = o.getSheetAt(0);
			for(int i =0; i<sheet.getPhysicalNumberOfRows(); i++) {
				Row row = sheet.getRow(i);
				for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue + "\t");
				}
				System.out.println();
			}
			o.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

}
