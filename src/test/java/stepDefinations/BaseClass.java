package stepDefinations;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.LoginPage;

public class BaseClass {
	

		public AppiumDriver<WebElement> driver = null;
		public LoginPage lp = null;
		
		public static Logger logger;
		public Properties configProp;
		public static String apkPath = System.getProperty("user.dir")+ "\\apk\\Amazon_shopping.apk";
		
		
		
		//Created for generating random string for Unique email
//		public static String randomestring(){
//			String generatedString1 = RandomStringUtils.randomAlphabetic(5);
//			return (generatedString1);
//		}
		
		
		
		
		
	}


