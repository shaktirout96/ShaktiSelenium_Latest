package TestScenarios;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import CommonFunctions.SeleniumFunctions;
import GenericLibrary.DriverClass;
import PageObjects.Login;
import PageObjects.Popular_Science;
import dev.failsafe.internal.util.Assert;


public class booksDashboard  extends DriverClass
{
@Test(dataProvider = "username",dataProviderClass = DataProviders.Data_providers.class)	
public void dashboard(String Login,String UserName,String Password)
{
	//Verify the text
	Popular_Science ps = new Popular_Science(driver);
	assertEquals("Ravinder Singh", SeleniumFunctions.GetText(ps.ranvindertext));
	
	//Enter the Username and Password
	Login ls = new Login(driver);
	SeleniumFunctions.Click(ls.SignIn);
	ls.emailID.sendKeys(UserName);;
}
}
