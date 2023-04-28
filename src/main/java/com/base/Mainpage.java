package com.base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage extends Baseclass{

	public  Mainpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='fromCity']")
	private WebElement from;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement inputfrom;

	@FindBy(xpath = "//p[text()='Bangkok, Thailand']")
	private WebElement selectinput;

	@FindBy(xpath = "//input[@id='toCity']")
	private WebElement to;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement inputto;

	@FindBy(xpath = "(//p[text()='Dubai, United Arab Emirates'])[2]")
	private WebElement selectto;

	@FindBy(xpath = "//div[@aria-label='Thu May 04 2023']")
	private WebElement selectdate;

	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getInputfrom() {
		return inputfrom;
	}

	public WebElement getSelectinput() {
		return selectinput;
	}

	public WebElement getto() {
		return to;
	}

	public WebElement getInputto() {
		return inputto;
	}

	public WebElement getSelectto() {
		return selectto;
	}

}