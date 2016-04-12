package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWrite {
	public static void ExcelWrite(String Result ,int row, int col) throws IOException{
		File f=new File("F://Git//MyMavenProject//TestData.xls");
		FileInputStream fis =new FileInputStream(f);
	    HSSFWorkbook Wb = new HSSFWorkbook(fis);
	    HSSFSheet ws = Wb.getSheet("sheet1");
	    HSSFRow Row = ws.getRow(row);
	    HSSFCell cell = Row.getCell(col, Row.RETURN_BLANK_AS_NULL);
	    if(cell==null){
	    	Row.createCell(col);
	    	cell.setCellValue(Result);
	    }
	    else{
	    	cell.setCellValue(Result);
	    }
	    
		FileOutputStream Fout =new FileOutputStream("F://Git//MyMavenProject//TestData.xls");
		Wb.write(Fout);
		Fout.flush();
		Fout.close();
	}
}
