package com.mindtree.pageobject;

import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.FooterUi;
import com.mindtree.utilities.CreateLog;

public class Footer {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	
	public Footer() {
		helper= new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
}
	public void verifytermsofuseText() {
		System.out.println(	helper.getText(FooterUi.terms));
		log.info("Verifying text in terms of use page");
		}
}
