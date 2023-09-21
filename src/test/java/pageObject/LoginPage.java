package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	WebDriver driver ; 
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

//Locaters
	

@FindBy(xpath="//input[@id='input-email']") WebElement eMailAddress;
@FindBy(xpath="//input[@id='input-password']") WebElement password;
@FindBy(xpath="//input[@value='Login']") WebElement login;

//ActionMethods

public void EnterEmail(String Email)
{
	eMailAddress.sendKeys(Email);	
}
public void EnterPwd(String p)
{
	password.sendKeys(p);
}
public void ClickLogin()
{
	login.click();
}
}




