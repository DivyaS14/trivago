package com.trivago_casestudy.travel.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.trivago.base.Base;
import com.trivago_casestudy.travel.pages.Contactform;


public class Contactform_linkTest extends Base{
 
	
	Contactform contatfrm;
 
 public Contactform_linkTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() throws Exception {
		initialization();
		contatfrm= new Contactform();
		
	}

	@Test
	public void ContactformFill() throws Exception {
		contatfrm.ClickContact();
		
		Thread.sleep(5000);
		System.out.println("Title of new page: " + driver.getTitle());
		
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	

}

