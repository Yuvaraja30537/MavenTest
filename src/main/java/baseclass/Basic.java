package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {
	
	public static WebDriver driver;
	public static String value;
	
	public static WebDriver browserlaunch(String brow) {
		if(brow.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(brow.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getUrl(String url) {
		driver.get(url);
		return driver;
	}
	
	public static void send(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static String readDatauser(String path, int index, int row, int cell) throws Exception {
		File file = new File(path);
		FileInputStream input =  new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheetAt(index);
		Row row2 = sheet.getRow(row);
		Cell cell2 = row2.getCell(cell);
		CellType Type = cell2.getCellType();
		if(Type.equals(Type.STRING)) {
			value = cell2.getStringCellValue();
		}else if (Type.equals(Type.NUMERIC)) {
			double numericCellValue = cell2.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);
		}
		book.close();
		return value;
	}
	public static String readData(String path, int index, int row, int cell) throws Exception {
		File file = new File(path);
		FileInputStream input = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(input);
		Sheet sheet = book.getSheetAt(index);
		Row row2 = sheet.getRow(row);
		Cell cell2 = row2.getCell(cell);
		CellType Type = cell2.getCellType();
		if(Type.equals(Type.STRING)) {
			value = cell2.getStringCellValue();
		}else if (Type.equals(Type.NUMERIC)) {
			double numericCellValue = cell2.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);
		}
		book.close();
		return value;
	}
	
	public static void clickelement(WebElement element) {
		element.click();
	}
	public static void dropDown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("ByValue")) {
			s.selectByValue(value);
		}else if(type.equalsIgnoreCase("ByIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		}else if(type.equalsIgnoreCase("ByText")) {
			s.selectByVisibleText(value);
		}
	}
}
