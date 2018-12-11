package com.trivago_casestudy.travel.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trivago.base.Base;

public class Contactform extends Base{

	@FindBy(xpath="//*[@id='footer-main']//a[text()='Contact']")
	WebElement ClickContact;

	public Contactform() {
		PageFactory.initElements(driver,this);
	}
	

	public Contact_formPage ClickContact() {
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0, document.body.scrollHeight)");
		ClickContact.click();
		return new Contact_formPage();
	
	}
	
}
