package testCase;
//modified in logintest.......

import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;
import testBase.BaseClass;

public class Tc_002_LoginTest extends BaseClass
{
	@Test(groups= {"sanity","master"})
	
	
public void TestLoginAcc()
{	WebDriverManager.chromedriver().setup();
	
	try
	{
	//logger.info("********Tc_001_AccountRegistration Started***********");
	HomePage hp=new HomePage(driver);
	logger.info("Clicking on my account.......");
	hp.clickmyaccount();
	logger.info("Clicking on Login......");
	hp.clickLogin();
	
	
	LoginPage lp=new LoginPage(driver);
	
	lp.EnterEmail(rb.getString("email"));
	lp.EnterPwd(rb.getString("password"));
	lp.ClickLogin();
	
	MyAccountPage MACC=new MyAccountPage(driver);
			
	boolean targetPage=MACC.isMyAccountPageExist();
	
	Assert.assertEquals(targetPage, true);
	}

catch(Exception e)
	{
	Assert.fail();
	}
	//logger.info("********Tc_001_AccountRegistration finished***********");
}
	
	
}
