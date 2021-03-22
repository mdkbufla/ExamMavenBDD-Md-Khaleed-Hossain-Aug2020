package stepDefinitions;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BackgroundColorCheck3;

import util.BrowserFactory;


public class stepDefinition {
	
	WebDriver driver;
	BackgroundColorCheck3 backgroundColorCheck3;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.init();
		backgroundColorCheck3 = PageFactory.initElements(driver, BackgroundColorCheck3.class);
	}
	

	@Given("^User is on the Techfios test page$")
	public void user_is_on_the_Techfios_test_page() {
	   driver = BrowserFactory.init();
	driver.get("https://techfios.com/test/101/");
	}

	@Given("^user Set SkyBlue Background button exists$")
	public void user_Set_SkyBlue_Background_button_exists()  {
		//backgroundColorCheck3.Test1();
	  //  throw new PendingException();
	}

	@When("^user click on button$")
	public void user_click_on_button()  {
	    // Write code here that turns the phrase above into concrete actions
		//backgroundColorCheck3.Test1();
	}

	@Then("^background color is changed to sky blue$")
	public void background_color_is_changed_to_sky_blue(){
	    // Write code here that turns the phrase above into concrete actions
		backgroundColorCheck3.Test1();
	}
	@Given("^user Set SkyWhite Background button exists$")
	public void user_Set_SkyWhite_Background_button_exists() {
	    // Write code here that turns the phrase above into concrete actions
		//backgroundColorCheck3.Test2();
	}

	@Then("^background color is changed to White$")
	public void background_color_is_changed_to_White() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		backgroundColorCheck3.Test2(); 
	}
	
}
