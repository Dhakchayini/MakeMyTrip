package com.base;

import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static JavascriptExecutor js;
	public static WebDriverWait wait;

	public static void browserLaunch(String value) {
		if (value.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions option = new ChromeOptions();
			option.addArguments("Incognito");
			option.addArguments("start-maximized");
			driver = new ChromeDriver(option);
		} else if (value.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("Incognito");
			driver = new FirefoxDriver(option);
		}
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void inputvalue(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void jsclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void getOptions(WebElement element) {
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}

	public static void validateElements(WebElement Element, String value) {
		if (value.equalsIgnoreCase("displayed")) {
			System.out.println(Element.isDisplayed());
		} else if (value.equalsIgnoreCase("enabled")) {
			System.out.println(Element.isEnabled());
		} else if (value.equalsIgnoreCase("selected")) {
			System.out.println(Element.isSelected());
		}
	}

	public static void windowHandles() {

		Set<String> windowhandles = driver.getWindowHandles();
		for (String string : windowhandles) {
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}

	}

	public static void windowHandles(String value) {

		Set<String> windowhandles = driver.getWindowHandles();

		Iterator<String> iterator = windowhandles.iterator();
		while (iterator.hasNext()) {
			String next = iterator.next();
			if (driver.switchTo().window(next).getTitle().contains(value)) {
				driver.close();
			}
		}
	}

	public static void scrollviewelement() {

		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}

	public static void explicitywait(WebElement element, String value) {
		if (value.equalsIgnoreCase("singlevisible")) {
			wait.until(ExpectedConditions.visibilityOf(element));
		} else if (value.equalsIgnoreCase("allvisible")) {
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
		} else if (value.equalsIgnoreCase("clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	}

	public static void scrollView(String value) {
		if (value.equalsIgnoreCase("down")) {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1550)");
		} else if (value.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0,-300)");
		}

	}

	public static void dropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

	public static void robotdown() throws Throwable {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

	public static void screenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screen = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Swathy\\Makemytrip\\screenshot\\"+filename+".png");
		FileUtils.copyFile(screen, dest1);

	}

	
	public static void quit() {
		driver.quit();
	}
}