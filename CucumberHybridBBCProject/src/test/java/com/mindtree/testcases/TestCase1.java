package com.mindtree.testcases;



import org.testng.annotations.*;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.Search;
import com.mindtree.utilities.Baseclass;
import com.mindtree.utilities.ReadExcel;
import com.mindtree.utilities.SnapShots;

public class TestCase1 extends Baseclass {
	
	ReadExcel excel ;
	HomePage home;
	Search s;
	
	@BeforeClass
	public void baseclass() {
		setup();
		driver.get(baseUrl);
		home = new HomePage();
		s = new Search();
	}
	
    @Test
    public void search() throws Exception {
       home.clickOnSearchicon();
       Thread.sleep(2000);
       s.searchpage("london");
       Thread.sleep(2000);
       s.search();
       Thread.sleep(2000);
       s.verifyText();
       SnapShots.captureScreen(driver, "search");
   	    navigateBack();
   	 navigateBack();
       
   
    }
    
    @AfterClass
    public void afterclass() {
    	teardown();
    }
}
