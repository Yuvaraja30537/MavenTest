package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewBase {

	public static WebDriver driver;
	public static String value;

	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver geturl(String url) {
		driver.get(url);
		return driver;

	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static String readexcel(String path, int sheet_index, int row_index, int cell_index) throws Exception {
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(fis);
		Sheet sheetAt = book.getSheetAt(sheet_index);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			value = cell.getStringCellValue();
		} else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);
		}
		book.close();
		return value;

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void locationSelect(WebElement element, String type, String value, int index, String text) {
		Select loc = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			loc.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			loc.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByVisibleText")) {
			loc.selectByVisibleText(text);
		}
	}

	public static void selectHotels(WebElement element, String type, String value, int index, String text) {
		Select hotel = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			hotel.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			hotel.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			hotel.selectByVisibleText(text);
		}
	}

	public static void roomtype(WebElement element, String type, String value, int index, String text) {
		Select roomtype = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			roomtype.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			roomtype.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			roomtype.selectByVisibleText(text);
		}
	}

	public static void noOfRooms(WebElement element, String type, String value, int index, String text) {
		Select noofrooms = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			noofrooms.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			noofrooms.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			noofrooms.selectByVisibleText(text);
		}
	}

	public static void checkin(WebElement element, String date) {
		element.click();
		element.clear();
		element.sendKeys(date);
	}

	public static void checkout(WebElement element, String date) {
		element.click();
		element.clear();
		element.sendKeys(date);
	}

	public static void adultroom(WebElement element, String type, String value, int index, String text) {
		Select room = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			room.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			room.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			room.selectByVisibleText(text);
		}
	}

	public static void children(WebElement element, String type, String value, int index, String text) {
		Select children = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			children.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			children.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			children.selectByVisibleText(text);
		}
	}

	public static void search(WebElement element) {
		element.click();
	}

	public static void radiobutton(WebElement element) {
		element.click();
	}

	public static void continu(WebElement element) {
		element.click();
	}

	public static void fname(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void lname(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void address(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void creditcard(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void cardType(WebElement element, String type, String value, int index, String text) {
		Select cardType = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			cardType.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			cardType.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			cardType.selectByVisibleText(text);
		}
	}

	public static void month(WebElement element, String type, String value, int index, String text) {
		Select month = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			month.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			month.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			month.selectByVisibleText(text);
		}
	}

	public static void year(WebElement element, String type, String value, int index, String text) {
		Select year = new Select(element);
		if (type.equalsIgnoreCase("ByValue")) {
			year.selectByValue(value);
		} else if (type.equalsIgnoreCase("ByIndex")) {
			year.selectByIndex(index);
		} else if (type.equalsIgnoreCase("ByText")) {
			year.selectByVisibleText(text);
		}
	}

	public static void cvv(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void book(WebElement element) {
		element.click();
	}

//	public static void bookingconfirmation(List<WebElement> details, String text) {
//		String text1 = ((WebElement) details).getText();
//		System.out.println(text);
//
//	}
	public static void book1(WebElement element) {
		element.click();
	}
}
