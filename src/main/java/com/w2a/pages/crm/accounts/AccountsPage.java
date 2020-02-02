package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class AccountsPage extends Page {

	public CreateAccountPage gotoCreateAccounts() {
		
		//driver.findElement(By.cssSelector("button[data-zcqa='cv_createbtn']")).click();
		click("createaccountbtn_CSS");
		return new CreateAccountPage();
		
	}
	
	public void gotoImportsAccounts() {
		
		
	}
	
}
