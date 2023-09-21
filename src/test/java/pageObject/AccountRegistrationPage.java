package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
	WebDriver driver; 
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
	}


@FindBy(xpath="//input[@id='input-firstname']") WebElement txtFirstName;
@FindBy(xpath="//input[@id='input-lastname']") WebElement txtLastName;
@FindBy(xpath="//input[@id='input-email']") WebElement txtEMail;
@FindBy(xpath="//input[@id='input-password']") WebElement txtPassword;
@FindBy(xpath="//input[@name='agree']") WebElement txtAgree;
//@FindBy(xpath="//input[@name='agree']") WebElement agree;
//@FindBy(xpath="//button[normalize-space()='Continue']") WebElement BtnContinue;
@FindBy(xpath="//input[@value='Continue']") WebElement BtnContinue;
@FindBy(xpath="//input[@id='input-telephone']") WebElement txttelephone;

@FindBy(xpath="//input[@id='input-confirm']") WebElement txtpasswordConfirm;

//@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement txtConfirmationMsg;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement txtConfirmationMsg;
public void setFirstName(String fname)
{txtFirstName.sendKeys(fname);
}
public void setLastName(String lname)
{
	txtLastName.sendKeys(lname);
}

public void setEmail(String Email)
{
	txtEMail.sendKeys(Email);
}
public void setTelephone(String Phone)
{
	txttelephone.sendKeys(Phone);
}
public void setPassword(String pwd)
{
	txtPassword.sendKeys(pwd);
}
public void setConfirmPwd(String CPwd)
{
	txtpasswordConfirm.sendKeys(CPwd);
}

public void ClickAgree()
{
	
	txtAgree.click();
	
}
public void ClickContinue()
{
BtnContinue.submit();
}
public String getConfirmationMsg() {
	try {
		return (txtConfirmationMsg.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}

	
}
}




