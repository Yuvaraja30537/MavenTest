package runner;

import org.openqa.selenium.WebDriver;

import baseclass.Bases;

public class Rans extends Bases{
	
	public static WebDriver driver; 
	
	public static void main(String[] args) {
		browserlaunch("chrome");
		geturl("http://adactinhotelapp.com/");
	}
	

}
