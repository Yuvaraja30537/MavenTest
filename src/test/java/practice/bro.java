package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bro {

	@Test
	private void brow() {
		WebDriverManager.edgedriver().setup();
		EdgeOptions option = new EdgeOptions();
		WebDriver driver = new EdgeDriver(option);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.location=('https://www.amazon.in')");
		
		
	}
	
}
