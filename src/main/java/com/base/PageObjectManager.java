package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class PageObjectManager extends Baseclass {
	
	public PageObjectManager(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	private Mainpage mp;
	private TravellerDetailspage tdp;
	
	public Mainpage getMp() {
		mp= new Mainpage(driver);
		return mp;
	}
	public TravellerDetailspage getTdp() {
		tdp= new TravellerDetailspage(driver);
		return tdp;
	}
	

	
}
