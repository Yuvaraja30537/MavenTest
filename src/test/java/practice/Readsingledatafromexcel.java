package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readsingledatafromexcel {

	private static void single() throws IOException {
		String location = "./data/Read.xlsx";
		FileInputStream file = new FileInputStream(location);
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheetAt = book.getSheetAt(0);
		XSSFRow row = sheetAt.getRow(3);
		XSSFCell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
}
	public static void main(String[] args) throws IOException {
		single();
	}
}