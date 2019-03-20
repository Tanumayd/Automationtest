package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelCode
{	
	XSSFWorkbook wb; //xlsx
	XSSFSheet sh; //xlsx

//	HSSFWorkbook wb;//Xls
//	HSSFSheet sh;   //xls
	public excelCode(String path)throws Exception
	{
		File src =new File(path);
		FileInputStream fis=new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheetAt(0);
		
	}
	
	public String readData(int rown,int coln)
	{
		String data=sh.getRow(rown).getCell(coln).getStringCellValue();
		System.out.println(data);
		
		return data;
		
	}
}
