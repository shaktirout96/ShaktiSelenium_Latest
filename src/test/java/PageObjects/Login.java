package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//a[@href='/login']")
	public WebElement SignIn;


	@FindBy(xpath = "//input[@name='logid']")
	public WebElement emailID;
	
	@FindBy(xpath = "//input[@name='pswd']")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement Login;
}
