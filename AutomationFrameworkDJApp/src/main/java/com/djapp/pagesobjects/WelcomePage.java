package com.djapp.pagesobjects;

import org.openqa.selenium.By;

import com.djapp.base.BaseConfiguration;

public class WelcomePage extends BaseConfiguration {

	By tabsContainerAfuera = By.id("tabs");
	By tabsContainer = By.id("tab-nav-2");
	By jobTitleFilter = By.xpath("//*[@id='criterion271_22']");
	By cityFilter = By.xpath("//*[@id='criterion272_29']");
	By findJobsButton = By.xpath("//*[@name='submit.quickJobSearch' and @type='button']");
	By jobSearch = By.xpath("//*[@id='tab-content-1']/div/a[1]");
	
	public boolean isPresentTabAfuera() {
		waitElement(tabsContainerAfuera);
		return findElement(tabsContainerAfuera)!=null;
	}
	
	public boolean isPresentTabGeneral() {
		waitElement(tabsContainer);
		return findElement(tabsContainer)!=null;
	}
	
	public boolean isPresentFindJobsButton() {
		
		waitElement(findJobsButton);
		
		return findElement(findJobsButton)!=null;
	}
	
	public void clickJobSearch () {
		waitElement(jobSearch);
		click(jobSearch);
	}
	
	
}
