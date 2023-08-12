package Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import Object.SauceDemoLoginObject;

public class SauceDemoLoginAction 
{
	SauceDemoLoginObject sauceObj;
	public SauceDemoLoginAction(WebDriver driver)
	{
		sauceObj = PageFactory.initElements(driver, SauceDemoLoginObject.class);
	}
	
	public void enterUsername(String userValue)
	{
		sauceObj.userName.sendKeys(userValue);
	}
	
	public void enterPassword(String passValue)
	{
		sauceObj.password.sendKeys(passValue);
	}
	
	public void clickLoginBtn()
	{
		sauceObj.loginbtn.click();
	}
	
	public String getErrorMsg()
	{
		String s = sauceObj.errorMsg.getText();
		return s;
	}
}
