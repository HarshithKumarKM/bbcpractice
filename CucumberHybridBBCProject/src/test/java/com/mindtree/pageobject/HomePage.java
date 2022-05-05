package com.mindtree.pageobject;


import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.HomeUi;
import com.mindtree.utilities.CreateLog;


public class HomePage {
      
	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public HomePage() {
		helper= new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
	}
	
	public void clickOnSearchicon() {
		helper.clickOn(HomeUi.searchicon);
		log.info("Successfully clicked on search icon");
		
	}
		public void clickOnsport() {
			helper.clickOn(HomeUi.sportspage);
			log.info("Successfully clicked on sports section");
		}
		
		public void clickOntermsOfUse() {
			helper.clickOn(HomeUi.footer);
			log.info("Successfully clicked on terms of use section in footer");
		}
	
}

