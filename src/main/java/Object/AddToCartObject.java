package Object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartObject 
{
	@FindBy(xpath="(//*[@name='user-name'])")
	public WebElement username;
	
	@FindBy(xpath="(//*[@name='password'])")
	public WebElement passvalue;
	
	@FindBy(xpath="(//*[@name='login-button'])")
	public WebElement loginButton;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	public WebElement productName;
	
	@FindBy(xpath="(//div[@class='inventory_item_price'])[1]")
	public WebElement productPrice;
	
	@FindBy(xpath="(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")
	public WebElement addToCartBtn;
	
	@FindBy(xpath="(//a[@class='shopping_cart_link'])")
	public WebElement cartBtn;
	
	@FindBy(xpath="(//button[@name='checkout'])")
	public WebElement checkout;
	
	@FindBy(xpath="(//*[@name='firstName'])")
	public WebElement firstName;
	
	@FindBy(xpath="(//*[@name='lastName'])")
	public WebElement lastName;
	
	@FindBy(xpath="(//*[@name='postalCode'])")
	public WebElement postalCode;
	
	@FindBy(xpath="(//*[@name='continue'])")
	public WebElement continueBtn;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])")
	public WebElement actualproductName;

	@FindBy(xpath="(//div[@class='inventory_item_price'])")
	public WebElement actualproductPrice;

	@FindBy(xpath="(//button[@name='finish'])")
	public WebElement finishBtn;

	@FindBy(xpath="(//h2[@class='complete-header'])")
	public WebElement confirmationMsg;


}
	