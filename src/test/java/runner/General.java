package runner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class General {

	private static void browser() throws InterruptedException, Exception {
		
		int[] num1 = {3,5,6,8,9};
		int[] num2 = {5,3,2,7,1};

		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num2.length; j++) {
				if (num1[i]==num2[j]) {
					int j2 = num2[j];
					System.out.println(j2);
				}
			}
		}	
	}
	public static void main(String[] args) throws Exception {
		browser();
	}
}
