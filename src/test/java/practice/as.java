package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class as {
	
	private static void ex() throws Exception {
		File f = new File("C:\\Users\\yuvar\\Desktop\\Write Data.xlsx");
		FileInputStream d = new FileInputStream(f);
		Workbook s = new XSSFWorkbook(d);
		
		s.createSheet("hello").createRow(0).createCell(0).setCellValue("Welccome");
		s.getSheet("hello").getRow(0).getCell(1).setCellValue("gg");
		FileOutputStream g = new FileOutputStream(f);
		s.write(g);
		s.close();
		
		
	}
	public static void main(String[] args) throws Exception {
		ex();
	}

}
