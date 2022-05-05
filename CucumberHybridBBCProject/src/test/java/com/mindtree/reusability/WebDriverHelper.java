package com.mindtree.reusability;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import com.mindtree.utilities.Baseclass;

public class WebDriverHelper extends Baseclass{

	public void sendText(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public String getText(By element) {
		String text = driver.findElement(element).getText();
		return text;
	}
	
	public void clickOn(By element) {
		driver.findElement(element).click();
	}
	
	public void hover(By element) {
		 
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(element)).perform();
	}
}
