package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gen22 {

	public static void gen() throws Exception, Exception {
		String csv = "./data/csvfile.csv";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try(CSVReader reader = new CSVReader(new FileReader(csv))){
			List<String[]> readAll = reader.readAll();
			
			driver.get("https://en.wikipedia.org/wiki/Text_file");
			//th[@class='navbox-group']
			WebElement text = driver.findElement(By.xpath("(//th)[8]|(//th)[9]|(//th)[10]|(//th)[11]|(//th)[12]|(//th)[13]|(//th)[14]"));
			String text2 = text.getText();
			System.out.println(text2);
			
			for(int i=readAll.indexOf(csv); i<=6; i++) {
				if (string.equals(text2)) {
					System.out.println("Matched: "+string);
				}else {
					System.out.println("Not matched: "+string);
				}
			}
			
		}
		
	}
	public static void main(String[] args) throws Exception {
		gen();
	}
}
