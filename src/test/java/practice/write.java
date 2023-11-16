package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write {
	
	public static void w() throws Exception {
		File file = new File("./data/Book1.xlsx");
		FileInputStream in = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(in);
		
		book.createSheet("New").createRow(0).createCell(0).setCellValue("Head");
		book.getSheet("New").getRow(0).createCell(1).setCellValue("Name");
		book.getSheet("New").createRow(1).createCell(0).setCellValue("Nothing");
		book.getSheet("New").getRow(1).createCell(1).setCellValue("No");
		FileOutputStream out = new FileOutputStream(file);
		book.write(out);
		System.out.println("Done");
		book.close();
	}
public static void main(String[] args) throws Exception {
	w();
}
}
