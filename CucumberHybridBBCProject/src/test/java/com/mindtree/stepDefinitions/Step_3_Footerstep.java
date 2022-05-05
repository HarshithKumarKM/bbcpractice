package com.mindtree.stepDefinitions;

import com.mindtree.pageobject.Footer;
import com.mindtree.pageobject.HomePage;
import com.mindtree.utilities.Baseclass;
import com.mindtree.utilities.SnapShots;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Step_3_Footerstep extends Baseclass{
	
	HomePage home;
	Footer foot;	
	@Before
	public void baseclass() {
	
		home = new HomePage();
		foot= new Footer();
		
	}
	
	@Given("^click on terms on use in footer in home page$")
	public void click_on_terms_on_use_in_footer_in_home_page() throws Throwable {
		 home.clickOntermsOfUse();;
	       Thread.sleep(2000);
	}

	@Given("^Verify that text is present in terms on use page$")
	public void verify_that_text_is_present_in_terms_on_use_page() throws Throwable {
		 foot.verifytermsofuseText();
	       Thread.sleep(2000);

	}

	@Then("^Navigate back to home page from terms on use page$")
	public void navigate_back_to_home_page_from_terms_on_use_page() throws Throwable {
		 SnapShots.captureScreen(driver, "footer");
	   	    navigateBack();
	}
   

}
