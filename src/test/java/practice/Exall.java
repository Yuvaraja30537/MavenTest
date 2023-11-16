package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Comment;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exall {

	private static void all() throws IOException {
		try {
		File file = new File("./data/Read.xlsx");
		FileInputStream open = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(open);
		Sheet sheet = book.getSheetAt(0);
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				System.out.print(stringCellValue + "\t");
			} 
			System.out.println();
		}
		book.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		all();
	}
}
