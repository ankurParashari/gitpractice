package com.inetbanking;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		
		String filepath = ".\\datafiles\\countries.xlsx";
		
		FileInputStream fileInputStream = new FileInputStream(filepath);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		   int rowCount = sheet.getLastRowNum();
		   int colCount = sheet.getRow(0).getLastCellNum();
		   
		   XSSFCell cellValue = sheet.getRow(0).getCell(0);
		   System.out.println(cellValue);
		     
		     
	}

}
