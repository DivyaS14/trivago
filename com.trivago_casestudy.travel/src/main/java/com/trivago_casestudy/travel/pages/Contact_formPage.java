package com.trivago_casestudy.travel.pages;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trivago.base.Base;

public class Contact_formPage extends Base {
	
	
	@FindBy(className="contact-msg")
	WebElement yourmessage;

	@FindBy(className="contact-input")
	WebElement fulname;
	
	@FindBy(id="contact-email")
	WebElement email;
	
	@FindBy(xpath="//input[@id='confirm']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[@class='contact-submit']")
	WebElement submitButton;
	
	public Contact_formPage() {
		PageFactory.initElements(driver,this);
	}
	   
	
	
	public void yourMessage() throws InterruptedException {
		PageFactory.initElements(driver, this);
		
		System.out.println("its about to click the button");
		
	String mainwindow= driver.getWindowHandle();
	
	Set<String> stWindow= driver.getWindowHandles();
	Iterator<String> itrWind= stWindow.iterator();
	
	while(itrWind.hasNext()) {
		
		String nextWind= itrWind.next();
		
		if (!mainwindow.equalsIgnoreCase(nextWind)) {
			
			driver.switchTo().window(nextWind);
			
			yourmessage.sendKeys("this is a great website");
			
			System.out.println("value is entered");  
		}
	}
		
	
		
	}
	
	public void fulName() {
		fulname.sendKeys("Harry potter");
	System.out.println("value is entered");
	
			
}
	
	public void email() {
		email.sendKeys("xyz@gmail.com");
	}
	
	public void checkbox() {
		checkbox.click();
	}
	
	public void submit() {
		submitButton.click();
	}
			
	}

