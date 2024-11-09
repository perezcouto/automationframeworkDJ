package com.djapp.pagesobjects;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.djapp.base.BaseConfiguration;


public class JobSearchPage extends BaseConfiguration{
By jobSearch = By.xpath("//*[@id='tab-content-1']/div/a[1]");
	
	By featuredJobs = By.xpath("//h3[ contains(text(),'Featured Jobs')]");
	
    public boolean isPresentFeaturedJobsTitle() {
		
		waitElement(featuredJobs);
		
		return findElement(featuredJobs)!=null;
		
	}


}
