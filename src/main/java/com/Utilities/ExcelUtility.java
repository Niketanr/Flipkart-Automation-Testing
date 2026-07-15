package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Baseclass.Library;

public class ExcelUtility extends Library{
	
	public String excelread(String sheet,int RowNumber,int CellNumber) throws IOException
	{
		File path=new File("src/test/resources/TestData/FlipkartTestdata.xlsx");
		FileInputStream read=new FileInputStream(path);
		Workbook book=new XSSFWorkbook(read);
		Sheet sh=book.getSheet(sheet);
		Row row=sh.getRow(RowNumber);
		Cell c=row.getCell(CellNumber);
		c.getStringCellValue();
		logger.info("*********Read Excel Sheet************");
		return c.getStringCellValue();
	}
	
	public void excelwrite(String sheet,int RowNumber,int CellNumber,String text) throws IOException {
		
		File path1=new File("src/test/resources/TestData/FlipkartTestdata.xlsx");
		FileInputStream read=new FileInputStream(path1);
		Workbook book=new XSSFWorkbook(read);
		Sheet sh=book.getSheet(sheet);
		Row row=sh.getRow(RowNumber);
		Cell c=row.createCell(CellNumber);
		c.setCellValue(text);
		
		FileOutputStream write=new FileOutputStream(path1);
		book.write(write);
		logger.info("*********Wrote in Excel Sheet************");
		
	}

}
