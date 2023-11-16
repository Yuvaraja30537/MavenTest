package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllExcellTask1 {
	private static void Alldata() throws Exception {
		File file = new File("./data/Book1.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheetAt = book.getSheetAt(0);
		int s = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < s; i++) {
			Row row = sheetAt.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue + "\t");
				} else if (cellType.equals(cellType.NUMERIC)) {
					double value = cell.getNumericCellValue();
					int data = (int) value;
					System.out.print(data + "\t");
				}
			}
			System.out.println();
		}
		book.close();
	}
	public static void main(String[] args) throws Exception {
		Alldata();
	}
}
