package testCase;

import org.testng.Assert;

import org.testng.annotations.Test;

import pageObject.AccountRegistrationPage;
import pageObject.HomePage;
import testBase.BaseClass;


public class Tc_001_AccountRegistration extends BaseClass 

{    
	

@Test(groups= {"regression","master"})
public void testAccountRegistation()
{
	logger.info("********Tc_001_AccountRegistration Started***********");
	HomePage hp=new HomePage(driver);
	logger.info("Clicking on my account....");
	hp.clickmyaccount();
	logger.info("Clicking on register.....");
	hp.clickRegister();
	
	AccountRegistrationPage Ac=new AccountRegistrationPage(driver);
	logger.info("Providing customer details...");
	Ac.setFirstName(randomeString().toUpperCase());
	Ac.setLastName(randomeString().toUpperCase());
	Ac.setEmail(randomeString()+"@gmail.com");
	String password=randomAlphaNumeric();
	Ac.setPassword(password);
	Ac.setConfirmPwd(password);
	Ac.ClickAgree();
	Ac.setTelephone(randomeNumber());
	Ac.ClickContinue();
	String confmsg=Ac.getConfirmationMsg();
	
	if(confmsg.equals("Your Account Has Been Created!"))
	
	{
		logger.info("Registration successful..");
		Assert.assertTrue(true);
	}
	else
	{
		logger.error("Registration failed");
		Assert.fail();
	}
	Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	logger.info("********Tc_001_AccountRegistration Finished***********");
}







}

