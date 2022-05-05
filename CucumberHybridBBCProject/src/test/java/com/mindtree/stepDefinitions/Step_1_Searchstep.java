package com.mindtree.stepDefinitions;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.Search;
import com.mindtree.utilities.Baseclass;
import com.mindtree.utilities.SnapShots;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class Step_1_Searchstep extends Baseclass{
	
	HomePage home;
	Search s;
	
	@Before
	public void baseclass() {
		setup();
		driver.get(baseUrl);
		home = new HomePage();
		s = new Search();
	}
	
    @After
    public void afterclass() {
    	teardown();
    
    }
    
    @Given("^click on search icon in home page$")
    public void click_on_search_icon_in_home_page() throws Throwable {
    	home.clickOnSearchicon();
    	Thread.sleep(2000);
    }

    @When("^user enters (.+) search bar$")
    public void user_enters_search_bar(String text) throws Throwable {
    	 s.searchpage(text);
         Thread.sleep(2000);
    }

    @And("^click search$")
    public void click_search() throws Throwable {
    	 s.search();
         Thread.sleep(2000);
    }

    @Then("^in result page verify the text is present$")
    public void in_result_page_verify_the_text_is_present() throws Throwable {
    	 s.verifyText();
    }

    @And("^navigate back$")
    public void navigate_back() throws Throwable {
    	SnapShots.captureScreen(driver, "search");
   	    navigateBack();
   	 navigateBack();
    }

}
