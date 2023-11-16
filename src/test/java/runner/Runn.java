package runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import baseclass.Basic;

public class Runn extends Basic{

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
		browserlaunch("chrome");
		getUrl("http://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		String input = readDatauser(".\\data\\Password.xlsx", 0, 2, 0);
		send(username, input);
		WebElement password = driver.findElement(By.id("password"));
		String readData = readData(".\\data\\Password.xlsx", 0, 2, 1);
		send(password, readData);
		WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		clickelement(login);
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		dropDown(location, "ByValue", "Brisbane");
		
		
		
		
	}
}
