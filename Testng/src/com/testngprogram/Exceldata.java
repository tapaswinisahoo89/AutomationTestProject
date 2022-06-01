package com.testngprogram;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.math3.analysis.function.Ceil;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Exceldata {
	@Test
	public void Readexceldata() throws EncryptedDocumentException, IOException
	{
		String filepath="C:\\Users\\hruda\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
        Sheet sh=wb.getSheet("Sheet1");
        Row rw=sh.getRow(1);
        String username=rw.getCell(1).getStringCellValue();
        System.out.println(username);
        String password=rw.getCell(2).getStringCellValue();
        System.out.println(password);
		
	}
	@Test
	public void getcountofTestcases() throws EncryptedDocumentException, IOException
	{
		String filepath="C:\\Users\\hruda\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println("total number of testcases="+rowcount);
	}
	@Test
	public void writeexceldata() throws EncryptedDocumentException, IOException
	{
		String filepath="C:\\Users\\hruda\\OneDrive\\Desktop\\Book1.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row  rw=sh.getRow(3);
		Cell cell=rw.createCell(2);
		cell.setCellType(CellType.STRING);
		FileOutputStream fos=new FileOutputStream(filepath);
		cell.setCellValue("TestDemo2");
		wb.write(fos);
		wb.close();
	}

}
