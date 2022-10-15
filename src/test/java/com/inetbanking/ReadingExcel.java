package com.inetbanking;

import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.xssf.usermodel.*;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		
		String excelpath = ".\\datafiles\\countries.xlsx";
		
		FileInputStream inputStream = new FileInputStream(excelpath);
		
		// initialize workbook
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
		
		// XSSFSheet sheet = workbook.getSheetAt(0);  // getting sheet from index instead sheet name.
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(1).getLastCellNum();
		
		// outer for loop is - rows
		for(int r=0; r<=rows; r++){
			
		XSSFRow row=sheet.getRow(r);
			
			System.out.println();
			
			
			// inner loop is representing cells in the sheet
			for(int c=0; c<columns; c++){
				
				XSSFCell cell = row.getCell(c);
					
				
				switch(cell.getCellType()){
					
				case STRING: System.out.print(cell.getStringCellValue()+ "      |       ");
				break;
				
				case NUMERIC: System.out.print(cell.getNumericCellValue()+ "     |        ");
				break;
				
				case BOOLEAN: System.out.print(cell.getBooleanCellValue()+ "      |       ");
				break;
				}
				
			}
			System.out.println();
		}
		
		
		

	}

}
