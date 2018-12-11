package com.trivago_casestudy.travel.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trivago.base.Base;
import com.trivago_casestudy.travel.pages.Contactform;

public class ContactformTest extends Base{

	Contactform contfrm;
	
	public ContactformTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		contfrm= new Contactform();
	}
	
	@Test
	public void contactFormFill() {
		
		contfrm.ClickContact();
		System.out.println("this is a new method");
	
	}
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
