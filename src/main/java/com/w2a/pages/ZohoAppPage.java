package com.w2a.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.base.Page;
import com.w2a.crm.pages.CRMHomePage;

public class ZohoAppPage extends Page {
	
	public CRMHomePage gotoCRM() throws Exception {
		System.out.println("entered in CRM Page");
	//	driver.findElement(By.cssSelector("div[class='ea-app-container'] > div:nth-child(7)")).click();
		
		click("crmlink_CSS");
		return new CRMHomePage();
	}

}
