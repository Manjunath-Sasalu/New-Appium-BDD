package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.AmazonUtil.Utils;

import utils.Utils.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LoginPage {
	//Login Elements
	
	public AppiumDriver<WebElement> driver;
	

	public LoginPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	//Android WebElemnets
	
	//By.XPath("//android.widget.Button[contains(text(),'Already a customer? Sign in']");
//	@FindBy(xpath = "//android.widget.Button[contains(text(),'Already a customer? Sign in']")
//	@CacheLookup
	By logoAmazon = By.xpath("//android.widget.ImageView[contains(@resource-id,'sso_splash_logo')]");
	By btnAlredyCustomer = By.xpath("//android.widget.Button[contains(@resource-id,'sign_in_button')]");
	
	By rbgSignAlreadycustomer = By.xpath("//android.view.View[contains(@text,'Sign-In. Already a customer')]");
	
	By txtEmail = By.xpath("//android.widget.EditText[@resource-id='ap_email_login']");
	
	By btnContinue = By.xpath("//android.widget.Button[contains(@resource-id,'continue')]");
	By txtPassword = By.xpath("//android.widget.EditText[@resource-id='ap_password']");
	By btnSignin = By.xpath("//android.widget.Button[contains(@resource-id,'signInSubmit')]");
	
	By imgAmazonLogo = By.xpath("//android.widget.ImageView[@content-desc='Home']");
	By txtSearchBox = By.xpath("//android.widget.EditText[contains(@resource-id,'rs_search_src_text')]");
	By lstSearchItems = By.xpath("//android.widget.TextView[contains(@resource-id,'iss_search_dropdown_item_text')]");
	
	
	
	//Action Methods
	public void clickOnAlreadyCustomer() throws InterruptedException {
		//if(driver.findElement(logoAmazon).isDisplayed()) {
		Thread.sleep(5000);
		if(driver.findElement(logoAmazon).isDisplayed()) {
			System.out.println("Application is Lauched Sucessfully");
			driver.findElement(btnAlredyCustomer).click();
			
		}
	}
	
	//Select Already a customer 
	public void selectAlreadycustomerAndEnterEmail(String email) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(rbgSignAlreadycustomer).click();
		driver.findElement(txtEmail).sendKeys(email);
	}
	
	public void clickOnContinue()
	{
		driver.findElement(btnContinue).click();
	}
	
	public void verifyEmailAndEnterPassword(String password, String text) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(txtPassword).sendKeys(password);
		clickOnSignIn();
	}

	public void clickOnSignIn() {
		driver.findElement(btnSignin).click();
		
	}
	
	public void verifyHomePage() throws InterruptedException {
		//driver.findElement(imgAmazonLogo).isDisplayed()
		Thread.sleep(5000);
		//System.out.println("");
		if(driver.findElement(imgAmazonLogo).isDisplayed()) {
			
			Assert.assertEquals(driver.findElement(imgAmazonLogo).isDisplayed(), true);
		}
	}
	
	public void searchItemFromAmazon(String searchItem) throws InterruptedException {
		driver.findElement(txtSearchBox).clear();
		driver.findElement(txtSearchBox).sendKeys(searchItem);
		//driver.findElement(txtSearchBox).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		List<WebElement> items = driver.findElements(lstSearchItems);
		System.out.println("Search Result: "+items.size());
		
		
	
	}
}
