package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readproperties 
{

	public static String getValue(String value) throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(value);
	}
}
