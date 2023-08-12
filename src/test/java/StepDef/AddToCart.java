package StepDef;

import Action.AddToCartAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert; 

public class AddToCart 
{
	String productName;
	String productPrice;
	
	AddToCartAction actions = new AddToCartAction (Hooks.driver);
	
	@Given("user launch the application")
	public void user_launch_the_application() 
	{
		Hooks.driver.get("https://www.saucedemo.com/");
	}
	@When("user enter username and password as {string} and {string}")
	public void user_enter_username_and_password_as_and(String string, String string2) 
	{
		actions.enterUserName(string);
		actions.enterPassword1(string2);
	}
	@When("user click  on login button")
	public void user_click_on_login_button() 
	{
		actions.clickLoginButton();
	}
	@Then("user get name and price of first available item")
	public void user_get_name_and_price_of_first_available_item() 
	{
		productName = actions.getProductName();
		productPrice = actions.getProductPrice();
	}
	@Then("user click on add to cart button")
	public void user_click_on_add_to_cart_button() 
	{
		actions.clickAddToCart();
	}
	@Then("user navigate to cart")
	public void user_navigate_to_cart() 
	{
		actions.openCart();
	}
	@Then("user continue to checkout the item")
	public void user_continue_to_checkout_the_item() 
	{

	}
	@Then("user fill the details for delivery")
	public void user_fill_the_details_for_delivery() throws InterruptedException 
	{	
		Thread.sleep(4000);
		actions.checkout();
	}
	
	@Then("user verify the confirmation message")
	public void user_verify_the_confirmation_message() 
	{
		Assert.assertEquals(productName,actions.getActualProductName());
		Assert.assertEquals(productPrice,actions.getActualProductPrice());
		Assert.assertEquals("Thank you for your order!",actions.verifyConfirmationMessage());

	}
	    
}

