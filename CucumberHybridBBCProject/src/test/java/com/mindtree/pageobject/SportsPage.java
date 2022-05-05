package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.SportsUi;
import com.mindtree.utilities.CreateLog;

public class SportsPage {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	public SportsPage() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
		}
	
	public void verifysportsText() {
	System.out.println(	helper.getText(SportsUi.sport));
	log.info("verifying the text in sports page");
	}
}
