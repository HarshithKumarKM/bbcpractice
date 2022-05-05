package com.mindtree.uistore;

import org.openqa.selenium.By;

public class HomeUi {

	public static By searchicon = By.xpath("//a[@id='orbit-search-button']");
	public static By sportspage = By.xpath("//nav[@class='orbit-header-links international']//li[@class='orb-nav-sport']");
	public static By footer     = By.xpath("//a[contains(text(),'Terms of Use')]");
}
