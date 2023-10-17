package DataProviders;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.DataProvider;

import GenericLibrary.ExcelRW;

public class Data_providers 
{
public static List<String[]> getdata() throws IOException
{
	ExcelRW rw = new ExcelRW();
	rw.WorkbookInitialize(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData.xlsx");
	XSSFSheet sh = rw.setSheet("Sheet1");
	int rows = rw.rowCount(sh);
	List<String[]> cart = new ArrayList<String[]>();
	String[] array = new String[3];
	
	array[0] =(rw.readcell(sh, 1, 0));
	array[1] =(rw.readcell(sh, 1, 1));
	array[2] =(rw.readcell(sh, 1, 2));
	cart.add(array);
	
	
	return cart;
}

@DataProvider(name="username")
public static Iterator<String[]> getusername() throws IOException
{
	List<String[]> iteratorData = getdata();
	return iteratorData.iterator();
}
}