package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {

	
	public static String ExcelRead(int row, int col) throws IOException{
		File f=new File("F://Git//MyMavenProject//TestData.xls");
		FileInputStream fis =new FileInputStream(f);
	    HSSFWorkbook Wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = Wb.getSheet("sheet1");
	    HSSFRow Row = ws.getRow(row);
	    HSSFCell cell = Row.getCell(col);
	    String Val = cell.getStringCellValue();
	    return Val;
		
	}
}
