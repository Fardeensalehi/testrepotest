package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class LoginPageObject extends Base{

	public LoginPageObject() {
		PageFactory.initElements(driver,  this);
	}
	
	//Test environment link
	@FindBy(how= How.XPATH, using= "//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;
	
	//Login to class
	@FindBy(how= How.XPATH, using= "//a[text()='Login to Class']")
	private WebElement loginToClassLink;
	
	//
	@FindBy(how= How.ID, using= "//input[@id='mc4wp_email']")
	private WebElement subsEmailField;
	
	public void clickOnTestEnvironmentLink() {
		testEnvironmentLink.sendKeys(Keys.ENTER);
	}
	
	public void clickOnloginToClassLink() {
		loginToClassLink.sendKeys(Keys.ENTER);
	}
	
	public void sendValueToSubsEmailField(String emailValue) {
		subsEmailField.sendKeys(emailValue);
	}
	
	public String pageTitle() {
		String TekSchoolPageTitle = driver.getTitle();
		return TekSchoolPageTitle;
	}

	public String canvasPageTitle() {
		String CanvasPageTitle = driver.getTitle();
		return CanvasPageTitle;
	}
}
