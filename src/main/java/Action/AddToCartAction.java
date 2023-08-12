package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import Object.AddToCartObject;

public class AddToCartAction 
{
	 AddToCartObject obj; 
	 Actions act;
	 
	 public AddToCartAction (WebDriver driver)
	 {
		 obj = PageFactory.initElements(driver,AddToCartObject.class);
		 act = new Actions(driver);
	 }
	 
	 public void enterUserName(String s)
	 {
		 obj.username.sendKeys(s);
	 }
	 
	 public void enterPassword1(String s1)
	 {
		  obj.passvalue.sendKeys(s1);
	 }
	  
	 public void clickLoginButton()
	 {
		 obj.loginButton.click();
	 }
	 
	 public String getProductName()
	 {
		 return obj.productName.getText();
	 }
	 
	 public String getProductPrice()
	 {
		 return obj.productPrice.getText();
	 }
	 
	 public void clickAddToCart()
	 {
		 obj.addToCartBtn.click();
	 }
	 
	 public void openCart()
	 {
		 obj.cartBtn.click();
	 }
	  
	 public void checkout()
	 {
		 obj.checkout.click();
		 obj.firstName.sendKeys("pranjali");
		 obj.lastName.sendKeys("Mahajan");
		 obj.postalCode.sendKeys("425305");
		 obj.continueBtn.click();
	 }
	 
	 public String getActualProductName()
	 {
		 return obj.actualproductName.getText();
	 }
	 
	 public String getActualProductPrice()
	 {
		 return obj.actualproductPrice.getText();
	 }
	 
	
	 public String verifyConfirmationMessage()
	 {
		 obj.finishBtn.click();
		 return obj.confirmationMsg.getText();
	 }

}

