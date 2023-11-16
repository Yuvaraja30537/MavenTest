package practice;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gen2 {

	public static void open() throws Exception, Exception {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		Map<String, Object> p = new HashMap<>();
		p.put("C:\\Users\\yuvar\\Downloads", System.getProperty("user.dir")+File.separator+"Downloads"+File.separator+"FilesDownloadChrome");
		ChromeOptions o = new ChromeOptions();
		o.setExperimentalOption("prefs", p);
		ChromeDriver driver = new ChromeDriver(o);	
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a[text()='4.15.0']")).click();
		
	}

	public static void main(String[] args) throws Exception {
		open();
	}

}