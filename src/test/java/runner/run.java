package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v116.browser.Browser;

import baseclass.ba;

public class run extends ba {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		driver = browserLaunch("chrome");
		get("http://adactinhotelapp.com/");
		WebElement name = driver.findElement(By.id("username"));
		String aa = readData(".data\\Password.xlsx", 0, 1, 0);
		inputValueElement(name, aa);
		WebElement password = driver.findElement(By.id("password"));
		String pa = readData(".data\\Password.xlsx", 0, 1, 1);
		inputValueElement(password, pa);
		WebElement log = driver.findElement(By.id("login"));
		clickOnElement(log);	
	}
}
