package com.trivago_casestudy.travel.testcase;

import java.util.ArrayList;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.trivago.base.Base;
import com.trivago_casestudy.travel.pages.Contact_formPage;
import com.trivago_casestudy.travel.pages.Contactform;

public class ContactForm_pageTest extends Base{


	Contactform contfrm;
	Contact_formPage contPg;
	
	public ContactForm_pageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		contfrm= new Contactform();
		contPg = new Contact_formPage();
	}
	/*
	@Test(priority=1)
	public void contactFormFill() throws InterruptedException {
		
		contfrm.ClickContact();
		System.out.println("this is a new method");
		
		
	
	}*/
	//Fillinf all the details and submitting the contact details.
	@Test(priority=1)
	public void FormFilling() throws InterruptedException {
		contfrm.ClickContact();
		contPg.yourMessage();
		contPg.fulName();
		contPg.email();
		contPg.checkbox();
		contPg.submit();
	}
	
	//Skipping one field,and trying to submit the details.
	@Test(priority=2)
	public void FormFilling2() throws InterruptedException {
		contfrm.ClickContact();
		contPg.yourMessage();
		//contPg.fulName();
		contPg.email();
		contPg.checkbox();
		contPg.submit();
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
