package com.mindtree.pageobject;



import org.apache.logging.log4j.Logger;

import com.mindtree.reusability.WebDriverHelper;
import com.mindtree.uistore.SearchUi;
import com.mindtree.utilities.CreateLog;



public class Search {

	WebDriverHelper helper;
	CreateLog logutil;
	Logger log;
	public Search() {
		helper = new WebDriverHelper();
		logutil = new CreateLog();
		log = logutil.createLog();
		}
	
	
	public void searchpage(String text) {
		helper.sendText(SearchUi.searchtext, text);
		log.info("Successfully sent the text to search bar");
	}
	public void search() {
		helper.clickOn(SearchUi.find);
		log.info("Successfully clicked on search icon");
	}
	
	public void verifyText() {
		System.out.println(helper.getText(SearchUi.text));
		log.info("verifying the text in result page");
	}
	}

