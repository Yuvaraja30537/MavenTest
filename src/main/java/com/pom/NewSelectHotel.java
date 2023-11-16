package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class NewSelectHotel {

	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;

	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continu;

	public NewSelectHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinu() {
		return continu;
	}

}
