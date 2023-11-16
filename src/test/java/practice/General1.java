package practice;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class General1 {
	public static void read() {
		try {
			File file = new File("./data/Read.xlsx");
			FileInputStream open = new FileInputStream(file);
			Workbook book = new XSSFWorkbook(open);
			Sheet sheet = book.getSheetAt(0);
			for(int i =0; i<sheet.getPhysicalNumberOfRows(); i++ ) {
				Row row = sheet.getRow(i);
				for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
					Cell cell = row.getCell(j);
					String Value = cell.getStringCellValue();
					System.out.print(Value + "\t");
				}
				System.out.println();
			}
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		read();
	}
}
