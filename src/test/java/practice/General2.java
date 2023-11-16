package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.http2.Header;

public class General2 {

	
	
	public static void web() throws Exception {
		File file = new File("./data/Book1.xlsx");
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheetAt = book.getSheetAt(0);
		for(int i=0; i<sheetAt.getPhysicalNumberOfRows(); i++) {
			Row row = sheetAt.getRow(i);
			for(int j=0; j<row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.print(stringCellValue+"\t");
				}else if(cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					System.out.print(numericCellValue+"\t");
				}
			}
			System.out.println();
		}
		book.close();
		
	}
	

	public static void main(String[] args) throws Exception {
		web();
	}
	
}
