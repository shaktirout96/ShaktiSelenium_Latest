package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Popular_Science
{
public Popular_Science(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//a[text()='Ravinder Singh']")
public WebElement ranvindertext;

}
