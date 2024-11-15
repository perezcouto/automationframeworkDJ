package com.djapp.pagesobjects;

import org.openqa.selenium.By;

import com.djapp.base.BaseConfiguration;

public class SavedJobsPage extends BaseConfiguration{
	
	By savedJobs = By.xpath("//*[@id='tab-content-1']/div/a[3]");
	
	public void clickSavedJobs () {
		waitElement(savedJobs);
		click(savedJobs);
	}
	
	By savedJobsResult = By.xpath("//*[@id=\"holder\"]/div[2]/div[2]/div/div[1]/h2");
	
    public boolean isPresentSavedJobsTitle() {
		
		waitElement(savedJobsResult);
		
		return findElement(savedJobsResult)!=null;
		
	}

}
