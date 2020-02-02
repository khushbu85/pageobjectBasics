package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.AccountsPage;

public class TopMenu {
	
	/*
	 * 
	 * TopMenu ISA Page..?? No
	 * 
	 * HomePage HASA TopMenu
	 * AccountsPage HASA TopMenu
	 * Every Page HASA TopeMenu
	 * 
	 * so in case of HASA encapsulation takes place whereas in case of ISA Inheritance takes place
	 * 
	 * 
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver = driver;
	}

	public void gotoHome() {

	}

	public void gotoLeads() {

	}

	public void gotoContacts() {

	}

	public AccountsPage gotoAccounts() {

		//driver.findElement(By.cssSelector("div[data-value='Accounts']")).click();
		Page.click("accountstab_CSS");
		return new AccountsPage();
		
	}

	public void gotoDeals() {

	}

	public void gotoSignout() {

	}

}
