package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TravellerDetailspage {
	
	public TravellerDetailspage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath = "//button[@class='button buttonSecondry buttonBig fontSize12 relative']")
	private WebElement okayButton;

	public WebElement getOkayButton() {
		return okayButton;
	}

	@FindBy(xpath = "//button[@class='button buttonPrimary buttonBig fontSize14']")
	private WebElement confirm;

	@FindBy(xpath = "//button[text()='Yes, Please']")
	private WebElement yesPlease;

	public WebElement getYesPlease() {
		return yesPlease;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	@FindBy(xpath = "(//span[text()='View Prices'])[1]")
	private WebElement flightselect;

	@FindBy(xpath = "(//button[text()='Book Now'])[1]")
	private WebElement book;

	@FindBy(xpath = "//button[@class='addTravellerBtn']")
	private WebElement travellerdetails;

	@FindBy(xpath = "//input[@placeholder='First & Middle Name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@value='FEMALE']")
	private WebElement selectGender;

	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	private WebElement mobileNo;

	@FindBy(xpath = "//input[@placeholder='Email']")
	private WebElement emailId;

	@FindBy(xpath = "//div[@class='emailIds-dropdown']")
	private WebElement selectEmail;

	public WebElement getSelectEmail() {
		return selectEmail;
	}

	@FindBy(xpath = "(//div[@class='dropdown__control css-yk16xz-control'])[1]")
	private WebElement nationality;

	@FindBy(xpath = "//div[text()='India']")
	private WebElement nationalityCountry;

	public WebElement getNationalityCountry() {
		return nationalityCountry;
	}

	@FindBy(xpath = "//div[text()='Passport Issuing Country']")
	private WebElement issuingCountry;

	@FindBy(xpath = "(//div[text()='India'])[2]")
	private WebElement selectIssuingCountry;

	public WebElement getSelectIssuingCountry() {
		return selectIssuingCountry;
	}

	@FindBy(xpath = "//input[@placeholder='Passport No']")
	private WebElement passportNo;

	public WebElement getNationality() {
		return nationality;
	}

	public WebElement getIssuingCountry() {
		return issuingCountry;
	}

	public WebElement getPassportNo() {
		return passportNo;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	@FindBy(xpath = "//div[text()='Date']")
	private WebElement date;
	@FindBy(xpath = "//div[text()='01']")
	private WebElement selectDatepassport;
	@FindBy(xpath = "//div[text()='Month']")
	private WebElement month;
	@FindBy(xpath = "//div[text()='Jan']")
	private WebElement selectMonth;
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement seatContinue;

	@FindBy(xpath = "//button[text()='Yes, Please']")
	private WebElement seatYesPlease;

	public WebElement getSeatYesPlease() {
		return seatYesPlease;
	}

	public WebElement getSeatContinue() {
		return seatContinue;
	}

	public WebElement getSelectDatepassport() {
		return selectDatepassport;
	}

	public WebElement getSelectMonth() {
		return selectMonth;
	}

	public WebElement getSelectYear() {
		return selectYear;
	}

	@FindBy(xpath = "//div[text()='Year']")
	private WebElement year;
	@FindBy(xpath = "//div[text()='2024']")
	private WebElement selectYear;

	@FindBy(xpath = "//div[@class='oneCard-element']//following::button[@class='lato-black button buttonPrimary extraPadBtn fontSize16 ']")
	private WebElement continueButton;

	@FindBy(xpath = "//span[text()='Skip to add-ons']")
	private WebElement skip;

	public WebElement getSkip() {
		return skip;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getSelectGender() {
		return selectGender;
	}

	public WebElement getMobileNo() {
		return mobileNo;
	}

	public WebElement getEmailId() {
		return emailId;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getTravellerdetails() {
		return travellerdetails;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getFlightselect() {
		return flightselect;
	}

	
}
