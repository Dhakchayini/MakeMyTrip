package com.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testngrunner extends Baseclass {

	public static PageObjectManager hpo = new PageObjectManager(driver);

	
	@BeforeSuite()
	public static void browserLaunch() {

		browserLaunch("chrome");
		launchUrl("https://www.makemytrip.com/");
	}
	
	
	@Test(priority = 1)
	public static void selectCity() throws InterruptedException {

		clickOnElement(hpo.getMp().getFrom());
		inputvalue(hpo.getMp().getInputfrom(), "bangok");
		clickOnElement(hpo.getMp().getSelectinput());
		clickOnElement(hpo.getMp().getto());
		inputvalue(hpo.getMp().getInputto(), "dubai");
		Thread.sleep(2000);
		clickOnElement(hpo.getMp().getSelectto());
		Thread.sleep(2000);
		clickOnElement(hpo.getMp().getSelectdate());
		clickOnElement(hpo.getMp().getSearch());
		// Thread.sleep(3000);
	}

	@Test(priority = 2)
	public static void flightSelect() throws Throwable {

		clickOnElement(hpo.getTdp().getOkayButton());
		jsclick(hpo.getTdp().getFlightselect());
		windowHandles();
		clickOnElement(hpo.getTdp().getBook());
		Thread.sleep(2000);
		windowHandles();
		scrollView("down");
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public static void travellerDetails() throws Throwable {

		clickOnElement(hpo.getTdp().getTravellerdetails());
		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getFirstName());
		inputvalue(hpo.getTdp().getFirstName(), "Swathy");
		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getLastName());
		inputvalue(hpo.getTdp().getLastName(), "Raj");
		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getSelectGender());
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getNationality());
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getNationalityCountry());
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getPassportNo());
		inputvalue(hpo.getTdp().getPassportNo(), "987456132");
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getIssuingCountry());
		clickOnElement(hpo.getTdp().getSelectIssuingCountry());
//		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getDate());
		clickOnElement(hpo.getTdp().getSelectDatepassport());
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getMonth());
		clickOnElement(hpo.getTdp().getSelectMonth());
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getYear());
		clickOnElement(hpo.getTdp().getSelectYear());
		inputvalue(hpo.getTdp().getMobileNo(), "9897654321");
		// Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getEmailId());
		inputvalue(hpo.getTdp().getEmailId(), "xyz@gmail.com");
		clickOnElement(hpo.getTdp().getSelectEmail());
		// Thread.sleep(000);
		clickOnElement(hpo.getTdp().getContinueButton());
		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getConfirm());
		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getYesPlease());
		windowHandles();
		scrollView("down");
		clickOnElement(hpo.getTdp().getSeatContinue());
		scrollView("down");
		clickOnElement(hpo.getTdp().getSeatYesPlease());
		scrollView("down");
		Thread.sleep(2000);
		clickOnElement(hpo.getTdp().getSkip());
		scrollView("down");
		screenshot("Bookingcomplete");
	}

	
	@AfterSuite()
	public static void browserclose() {
		quit();
	}

}
