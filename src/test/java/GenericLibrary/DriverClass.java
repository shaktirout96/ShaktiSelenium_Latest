package GenericLibrary;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class DriverClass 
{
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void beforemethod(String NAbrowser) throws Exception
	{
	if(NAbrowser.equals("CHROME"))
	{
		driver = new ChromeDriver();
	}
	else if (NAbrowser.equals("FIREFOX"))
	{
		driver = new FirefoxDriver();
	}
	
	driver.get(Readproperties.getValue("URL"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterTest
	public void Quit()
	{
		driver.quit();
	}
	
	
}
