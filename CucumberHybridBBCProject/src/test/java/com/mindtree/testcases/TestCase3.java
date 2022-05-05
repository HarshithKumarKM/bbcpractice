package com.mindtree.testcases;


import org.testng.annotations.*;

import com.mindtree.pageobject.Footer;
import com.mindtree.pageobject.HomePage;

import com.mindtree.utilities.Baseclass;
import com.mindtree.utilities.SnapShots;

public class TestCase3 extends Baseclass {
		
		HomePage home;
		Footer foot;
		
		@BeforeClass
		public void baseclass() {
			setup();
			driver.get(baseUrl);
			home = new HomePage();
			foot= new Footer();
		}
		
	    @Test
	    public void footer() throws Exception {
	       home.clickOntermsOfUse();;
	       Thread.sleep(2000);
	       foot.verifytermsofuseText();
	       Thread.sleep(2000);
	       SnapShots.captureScreen(driver, "footer");
	   	    navigateBack();
	       
	   
	    }
	    
	    @AfterClass
	    public void afterclass() {
	    	teardown();
	    }
}
