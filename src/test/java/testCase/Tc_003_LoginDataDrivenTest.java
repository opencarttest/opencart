package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class Tc_003_LoginDataDrivenTest extends BaseClass
{ @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void TestLoginDDT(String email,String password,String exp)
	{
	try
	{
logger.info("********Tc_003_AccountRegistration Started***********");
HomePage hp=new HomePage(driver);
logger.info("Clicking on my account.......");
hp.clickmyaccount();
logger.info("Clicking on Login......");
hp.clickLogin();


LoginPage lp=new LoginPage(driver);

lp.EnterEmail(email);
lp.EnterPwd(password);
lp.ClickLogin();

MyAccountPage MACC=new MyAccountPage(driver);
		
boolean targetPage=MACC.isMyAccountPageExist();
//MyAccountPage myaccpage = new MyAccountPage(driver);
if(exp.equals("Valid"))
{
	if(targetPage==true)
	{//MyAccountPage MACC1=new MyAccountPage(driver);
		MACC.ClickLogout();
		Assert.assertTrue(true);
	}
	else
	{
		Assert.assertTrue(false);	
	}
	
	}
if(exp.equals("Invalid"))
{
	if(targetPage==true)
	{//MyAccountPage myaccpage = new MyAccountPage(driver);
		MACC.ClickLogout();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertTrue(true);	
	}
	
	}
}

catch(Exception e)
{
Assert.fail();
}
logger.info("********Tc_003_AccountRegistration finished***********");
}

}