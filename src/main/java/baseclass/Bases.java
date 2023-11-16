package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bases {
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(type.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void geturl(String url) {
		// TODO Auto-generated method stub

	}
	 

}
