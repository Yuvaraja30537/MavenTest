package practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.opencsv.CSVReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSVfileRead {

	public static void csv() throws Exception, IOException {
		
		String file = "./data/csvfile.csv";
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		try(CSVReader reader = new CSVReader(new FileReader(file))){
			List<String[]> readAll = reader.readAll();
			
			for (String[] csv1 : readAll) {
				
				String username = csv1[0];
				System.out.println(username);
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				WebElement user = driver.findElement(By.xpath("(//p)[1]"));
				//p[text()='Username : Admin']
				String text = user.getText();
				System.out.println(text);
				if (text.equals(username)) {
					System.out.println("CSV String Matched: "+csv1);
					
				}else {
					System.out.println("CSV String not matched: "+csv1);
				}
			}	
		}
	}
	public static void main(String[] args) throws Exception, Exception {
		csv();
	}
}
