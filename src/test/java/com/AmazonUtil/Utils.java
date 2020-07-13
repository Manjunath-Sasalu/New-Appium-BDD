package com.AmazonUtil;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class Utils {
	
	/**
	 * @author Manjunath
	 * @param driver
	 * @param element
	 * @param value
	 */
	public static void typeText(AppiumDriver<WebElement> driver, String element, String value) {
		System.out.println("Type the value in text field: ");
		WebElement txtElement = returnWebElemt(driver, element);
		txtElement.clear();
		txtElement.sendKeys(value);
	}
	
	public static void clickOnElement(AppiumDriver<WebElement> driver, String element) {
		WebElement clkElement = returnWebElemt(driver, element);
		clkElement.click();
		
	}

	
	
	public static WebElement returnWebElemt(AppiumDriver<WebElement> driver, String element) {
		// TODO Auto-generated method stub
		if(element.startsWith("/"))
		{
			return driver.findElementByXPath(element);
		}else {
			return driver.findElementById(element);
		}
		
	}
}
