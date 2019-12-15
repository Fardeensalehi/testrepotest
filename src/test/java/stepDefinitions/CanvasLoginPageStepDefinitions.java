  package stepDefinitions;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.LoginPageObject;
import org.testng.Assert;

public class CanvasLoginPageStepDefinitions extends Base {
	
	LoginPageObject loginPage;
	
	@Given("^User click on Login button on top of the page$")
	public void user_click_on_Login_button_on_top_of_the_page() throws Throwable {
		Base.initializeDriver();
		loginPage = new LoginPageObject();
		loginPage.clickOnloginToClassLink();
	}

	@Then("^User should see Canvas Login Page$")
	public void user_should_see_Canvas_Login_Page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Log In to Canvas");
	}
}
