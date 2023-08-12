package StepDef;

import org.junit.Assert;
import Action.SauceDemoLoginAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoLogin 
{
	SauceDemoLoginAction sauceAct = new SauceDemoLoginAction(Hooks.driver);
	
	@Given("user launch the application with {string}")
	public void user_launch_the_application_with(String string) 
	{
	   Hooks.driver.get(string);
	}

	@When("user enter valid username {string}")
	public void user_enter_valid_username(String string) 
	{
	    sauceAct.enterUsername(string);
	}

	@And("user enter valid password {string}")
	public void user_enter_valid_password(String string) 
	{
		sauceAct.enterPassword(string);
	}

	@And("user click login button")
	public void user_click_login_button() 
	{
	   sauceAct.clickLoginBtn();
	}
	
	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() 
	{
		Assert.assertEquals("https://www.saucedemo.com/inventory.html",Hooks.driver.getCurrentUrl());
	}
	
	@When("user enter invalid inputs as {string} and {string}")
	public void user_enter_invalid_inputs_as_and(String string1, String string2) 
	{
		sauceAct.enterUsername(string1);
		sauceAct.enterPassword(string2);
	}
	
	@Then("user should see some error message")
	public void user_should_see_some_error_message() throws InterruptedException 
	{
		Thread.sleep(5000);
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",sauceAct.getErrorMsg());
	}

}       
