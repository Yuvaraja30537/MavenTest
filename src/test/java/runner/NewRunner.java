package runner;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.NewBookAHotel;
import com.pom.NewLoginPage;
import com.pom.NewSearchHotel;
import com.pom.NewSelectHotel;
import com.pom.NewLoginPage;

import baseclass.NewBase;

public class NewRunner extends NewBase {

	public static WebDriver driver = NewBase.browserLaunch("chrome"); // chrome
	public static NewLoginPage lp = new NewLoginPage(driver);
	public static NewSearchHotel ss = new NewSearchHotel(driver);
	public static NewSelectHotel sh = new NewSelectHotel(driver);
	public static NewBookAHotel bh = new NewBookAHotel(driver);

	public static void login() throws Exception {
		driver=geturl("https://adactinhotelapp.com/");
		String username = readexcel("./data/Password.xlsx", 0, 1, 0);
		inputValueElement(lp.getUsername(), username);
		String password = readexcel("./data/Password.xlsx", 0, 1, 1);
		inputValueElement(lp.getPassword(), password);
		clickOnElement(lp.getLogin());
	}

	public static void searchHotel() {
		// Location

		locationSelect(ss.getLocation(), "ByValue", "Sydney", 0, null);
		locationSelect(ss.getLocation(), "ByIndex", null, 0, null);
		locationSelect(ss.getLocation(), "ByVisibleText", null, 0, "Sydney");
		// Hotels
		selectHotels(ss.getHotels(), "ByValue", "Hotel Sunshine", 0, null);
		selectHotels(ss.getHotels(), "ByIndex", null, 2, null);
		selectHotels(ss.getHotels(), "ByText", null, 0, "Hotel Sunshine");
		// Room Type
		roomtype(ss.getRoom_type(), "ByValue", "Deluxe", 0, null);
		roomtype(ss.getRoom_type(), "ByIndex", null, 3, null);
		roomtype(ss.getRoom_type(), "ByText", null, 0, "Deluxe");
		// No of rooms
		noOfRooms(ss.getRoom_nos(), "ByValue", "2", 0, null);
		noOfRooms(ss.getRoom_nos(), "ByIndex", null, 2, null);
		noOfRooms(ss.getRoom_nos(), "ByText", null, 0, "2 - Two");
		// Check In Date
		checkin(ss.getDatepick_in(), "20/11/2023");
		// Check Out Date
		checkout(ss.getDatepick_out(), "25/11/2023");
		// Adults per Room
		adultroom(ss.getAdult_room(), "ByValue", "2", 0, null);
		adultroom(ss.getAdult_room(), "ByIndex", null, 2, null);
		adultroom(ss.getAdult_room(), "ByText", null, 0, "2 - Two");
		// Children per Room
		children(ss.getChild_room(), "ByValue", "2", 0, null);
		children(ss.getChild_room(), "ByIndex", null, 2, null);
		children(ss.getChild_room(), "ByText", null, 0, "2 - Two");
		// Click Search
		search(ss.getSubmit());
	}

	public static void SelectHotel() {
		radiobutton(sh.getRadiobutton_0());
	}

	public static void continu() {
		continu(sh.getContinu());
	}

	public static void BookAHotel() {
		// First Name
		fname(bh.getFirst_name(), "Yuvaraj");
		// Last Name
		lname(bh.getLast_name(), "D");
		// Billing Address
		address(bh.getAddress(), "A to B, Chennai");
		// Credit Card No
		creditcard(bh.getCc_num(), "1234567891123456");
		// Credit Card Type
		cardType(bh.getCc_type(), "ByValue", "MAST", 0, null);
		cardType(bh.getCc_type(), "ByIndex", null, 3, null);
		cardType(bh.getCc_type(), "ByText", null, 0, "Master Card");
		// Expiry month
		month(bh.getCc_exp_month(), "ByValue", "5", 0, null);
		month(bh.getCc_exp_month(), "ByIndex", null, 5, null);
		month(bh.getCc_exp_month(), "ByText", null, 0, "May");
		// Expiry Year
		year(bh.getCc_exp_year(), "ByValue", "2015", 0, null);
		year(bh.getCc_exp_year(), "ByIndex", null, 5, null);
		year(bh.getCc_exp_year(), "ByText", null, 0, "2015");
		// cvv number
		cvv(bh.getCc_cvv(), "123");
		// Book Now
		book(bh.getBook_now());
	}

	public static void click() {
		WebElement bo = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
		book1(bo);

	}

	public static void main(String[] args) throws Exception {
		login();
		searchHotel();
		SelectHotel();
		continu();
		BookAHotel();
		click();

	}

}
