package com.mindtree.testcases;


import org.testng.annotations.*;

import com.mindtree.pageobject.HomePage;
import com.mindtree.pageobject.SportsPage;
import com.mindtree.utilities.Baseclass;
import com.mindtree.utilities.SnapShots;

public class TestCase2 extends Baseclass {
	
	HomePage home;
	SportsPage sp;
	
	@BeforeClass
	public void baseclass() {
		setup();
		driver.get(baseUrl);
		home = new HomePage();
		sp= new SportsPage();
	}
	
    @Test
    public void sport() throws Exception {
       home.clickOnsport();
       Thread.sleep(2000);
       sp.verifysportsText();
       Thread.sleep(2000);
       SnapShots.captureScreen(driver, "sport");
   	    navigateBack();
       
   
    }
    
    @AfterClass
    public void afterclass() {
    	teardown();
    }

}
