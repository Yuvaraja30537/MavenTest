package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ba {
	
	public static WebDriver driver;

	public static String value;

	// 1
	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Selenium_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	// 2
	public static WebDriver get(String url) {
		driver.get(url);
		return driver;
	}

	// 3
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);

	}

	// 4
	public static void clickOnElement(WebElement element) {
		element.click();

	}

	// 5
	public static WebDriver close() {
		driver.close();

		return driver;

	}

	// 6
	public static WebDriver quit() {
		driver.quit();
		return driver;

	}

	// 7
	public static void dropDown(WebElement element, String type, String value) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("ByValue")) {
			s.selectByValue(value);

		} else if (value.equalsIgnoreCase("ByIndex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);
		} else if (type.equalsIgnoreCase("ByText")) {
			s.selectByVisibleText(value);

		}

	}

	// 8
	public static String readData(String path, int sheet_Index, int row_Index, int cell_Index) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet SheetAt = wb.getSheetAt(sheet_Index);
		Row row = SheetAt.getRow(row_Index);
		Cell cell = row.getCell(cell_Index);
		CellType abc = cell.getCellType();
		if (abc.equals(CellType.STRING)) {
			value = cell.getStringCellValue();

		} else if (abc.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int) numericCellValue;
			value = String.valueOf(data);
		}
		wb.close();
		return value;
	}

	// 9
	public static WebDriver navigat(String url) {
		driver.navigate().to(url);
		return driver;

	}

	// 10
	private WebDriver navigatBack(String url) {
		driver.navigate().back();
		driver.get(url);
		return driver;

	}

	// 11
	public static WebDriver navigatForward(String url) {
		driver.navigate().forward();
		driver.get(url);
		return driver;

	}

	// 12
	public static WebDriver navigatRefresh(String url) {
		driver.navigate().refresh();
		driver.get(url);
		return driver;

	}

	// 13
	public static WebDriver alert(String Pass) {
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().sendKeys(Pass);
		return driver;

	}

	// 14
	public static void action(WebDriver element, String url) {
		Actions a = new Actions(element);
		a.build().perform();
		a.click().build().perform();
		a.contextClick().build().perform();
		a.doubleClick().build().perform();

	}

	// 15
	public static WebDriver frame(int index, String text, String fram) {
		driver.switchTo().frame(index);
		driver.switchTo().frame(text);
		driver.switchTo().frame(fram);
		driver.switchTo().defaultContent();
		driver.switchTo().notify();
		driver.switchTo().notifyAll();
		driver.switchTo().parentFrame();

		return driver;

	}

	// 16
	public static void robot(int Index) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 17
	public static WebDriver WindoHandle() {
		driver.getWindowHandle();
		driver.getWindowHandles();
		return driver;

	}

	// 18
	public static void checkBox(WebElement element) {

	}

	// 19
	public static void isenable(WebElement element) {
		element.isEnabled();
	}

	// 20
	private void isdisplay(WebElement element) {
		element.isDisplayed();

	}

	// 21
	public static void isSelect(WebElement element) {
		element.isSelected();

	}

	// 22
	public static WebDriver gettitle() {
		driver.getTitle();
		return driver;
	}

	// 23
	public static void gettext(WebElement element) {
		element.getText();

	}

	// 24
	public static void getattribute(WebElement element, String url) {
		element.getAttribute(url);
	}

	// 25
	public static WebDriver waitt(long time) throws InterruptedException {
		driver.wait();
		driver.wait(time);
		driver.wait(time, 3);

		return driver;

	}

	// 26
	public static WebDriver takeScreenshot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(sr, dest);

		return driver;

	}

	// 27
	public static WebDriver scrollupAndscrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", element);// ScrollIntoView

		js.executeScript("window.scrollBy(0,2000);");// ScrollUp

		js.executeScript("window.scrollBy(0,-1000);");// ScrollDown

		return driver;

	}
	// 28

	public static void firstselectoption(WebElement element) {
		Select s = new Select(element);
		s.getFirstSelectedOption();

	}

	// 29
	public static void allSelectoption(WebElement element) {
		Select s = new Select(element);
		s.getAllSelectedOptions();
	}

	// 30
	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		s.isMultiple();

	}

	// 31
	private WebDriver currenturl() {
		driver.getCurrentUrl();
		return driver;
	}
	//32
	public static  void radiobutton() {
 
	}
	

}
