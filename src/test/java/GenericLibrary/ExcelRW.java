package GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRW
{
FileInputStream fis;
XSSFWorkbook wb;

public void WorkbookInitialize(String path) throws IOException
{
	fis = new FileInputStream(path);
	wb = new XSSFWorkbook(fis);
}

public XSSFSheet setSheet(String sName)
{
	XSSFSheet sheet = wb.getSheet(sName);
	return sheet;
}
public int rowCount(XSSFSheet tsheet)
{
	int lastrownum = tsheet.getLastRowNum();
	return lastrownum;
}
public int columncount(XSSFSheet tsheet)
{
	int lastcellnum = tsheet.getRow(0).getFirstCellNum();
	return lastcellnum;
}

public String readcell(XSSFSheet tsheet,int row,int column)
{
	XSSFCell cell = tsheet.getRow(row).getCell(column);
	String celltext="";
	
	if(cell.getCellType()==CellType.STRING)
	{
		celltext = cell.getStringCellValue();
	}
	else if(cell.getCellType()==CellType.NUMERIC)
	{
		celltext = String.valueOf(cell.getNumericCellValue());
	}
	else if(cell.getCellType()==CellType.BLANK)
	{
		celltext = "";
	}
	return celltext;
}

public void writeCell(XSSFSheet sheet,int row,int column,String writeval)
{
	XSSFCell cellwrite=sheet.getRow(row).getCell(column);
	cellwrite.setCellValue(writeval);
}
public void saveFile(String path) throws IOException
{
	fis.close();
	FileOutputStream fos = new FileOutputStream(path);
	fos.close();
}

}
