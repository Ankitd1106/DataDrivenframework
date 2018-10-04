package generic;

import java.io.FileInputStream;
import java.io.FilterInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String abc(String file, String sheet, int row, int cell)
	{
		String s="";
		
		try
		{
			FileInputStream f = new FileInputStream(file);
			Workbook wb = WorkbookFactory.create(f);
			s=wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		}
		catch(Exception e)
		{
			
		}
		return s;
	}
	

}
