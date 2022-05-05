package com.mindtree.stepDefinitions;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.SportsPage;
import com.mindtree.utilities.Baseclass;
import com.mindtree.utilities.SnapShots;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Step_2_Sportstep extends Baseclass{
	
	HomePage home;
	SportsPage sp;
	
	@Before
	public void baseclass() {

     	home = new HomePage();
    	sp= new SportsPage();
}
    
    @Given("^click on sport section in home page$")
    public void click_on_sport_section_in_home_page() throws Throwable {
    	home.clickOnsport();
        Thread.sleep(2000);
    }

    @And("^Verify that Sport is present in sports page$")
    public void verify_that_Sport_is_present_in_sports_page() throws Throwable {
    	sp.verifysportsText();
        Thread.sleep(2000);
    }

    @Then("^Navigate back to home page from sports page$")
    public void navigate_back_to_home_page_from_sports_page() throws Throwable {
    	SnapShots.captureScreen(driver, "sport");
   	    navigateBack();
    }


}
