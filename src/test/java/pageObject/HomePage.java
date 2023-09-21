package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{ 
	WebDriver driver ; 
public HomePage(WebDriver driver)
{
	super(driver);
}
//locaters

@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement lnkmyAccount;
@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkregister;
@FindBy(linkText="Login")
WebElement lnklogin;

//Actions
public void clickmyaccount()
{
	lnkmyAccount.click();
}

public void clickRegister()
{
	lnkregister.click();
}

public void clickLogin()
{
	lnklogin.click();
}
}
