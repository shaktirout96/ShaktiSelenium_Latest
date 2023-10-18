package CommonFunctions;

import org.openqa.selenium.WebElement;

public class SeleniumFunctions 
{
	public static String GetText(WebElement element)
	{
		return element.getText(); 
	}
	public static void Click(WebElement element)
	{
		 element.click(); 
	}
}
