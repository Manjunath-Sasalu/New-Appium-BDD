package stepDefinations;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pageObjects.LoginPage;

import org.openqa.selenium.WebElement;

public class Steps extends BaseClass{
	
	//Login steps
	
	
	
//	@Given("User Launch Amazon Mobile App")
//	public void user_Launch_Amazon_Mobile_App() throws MalformedURLException {
//		//setDesiredCapabilities();
//	}
	
	@Before
	public void setDesiredCapabilities() throws MalformedURLException {
        DesiredCapabilities dc= new DesiredCapabilities();
        //dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); 
        //dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, 11);//Version is number here
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability(MobileCapabilityType.APP, apkPath);
        //dc.setCapability(MobileCapabilityType., value);
        URL url =new URL("http://127.0.0.1:4723/wd/hub");
        System.out.println("Done");
        driver=new AppiumDriver<WebElement>(url, dc);
        //driver=new AppiumDriver<WebElement>(dc);
	}
	
	//Gherkin implemeted methods
	
	@Given("User Launch Amazon Mobile App and select on {string} Already a customer? Sign in Option")
	public void user_Launch_Amazon_Mobile_App_and_select_on_Already_a_customer_Sign_in_Option(String string) throws InterruptedException {
		
		//System.out.println("+++++++++++++++"+apkPath);
		lp=new LoginPage(driver);
	    lp.clickOnAlreadyCustomer();
	}

	@Given("User Enter the Email as {string}")
	public void user_Enter_the_Email_as(String email) throws InterruptedException {
	    lp.selectAlreadycustomerAndEnterEmail(email);
	}

	@Given("User clicks on {string} Continue button")
	public void user_clicks_on_Continue_button(String string) {
	    lp.clickOnContinue();
	}

	@Given("User Enter Password as {string} and clicks on {string} Sign In Button")
	public void user_Enter_Password_as_and_clicks_on_Sign_In_Button(String password, String string2) throws InterruptedException {
	   lp.verifyEmailAndEnterPassword(password, string2);
	   lp.clickOnSignIn();
	}

	@Given("User is Landed to Amazon Home page")
	public void user_is_Landed_to_Amazon_Home_page() throws InterruptedException {
	    lp.verifyHomePage();
	}

	@Given("User Entered the search as {string}")
	public void user_Entered_the_search_as(String searchItem) throws InterruptedException {
	   lp.searchItemFromAmazon(searchItem);
	}

	@Then("User should select the Items Randomly")
	public void user_should_select_the_Items_Randomly() {
	    
	}

	@Then("User should able to buy the selected Item")
	public void user_should_able_to_buy_the_selected_Item() {
	   
	}

	

}
