package org.moleculardevices.pagedetailsproperty;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private static XSSFSheet ExcelWSheet;

	private static XSSFWorkbook ExcelWBook;
	

	private static XSSFCell Cell;

	private static XSSFRow Row;
	static int i = 0;

	public static void setExcelFile(String path, String Sheetname) throws IOException {
		File f = new File(path);
		FileInputStream ExcelFile = new FileInputStream(f);
		ExcelWBook = new XSSFWorkbook(ExcelFile);
		ExcelWSheet = ExcelWBook.getSheet(Sheetname);
		
		System.out.println("setexcel");

	}

	public static String getCellData(int RowNum, int ColNum) throws Exception {
		try {

			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String celldata = Cell.getStringCellValue();
			System.out.println("getCellData =" + celldata);
			return celldata;
		} catch (Exception e) {
			return "";
		}

	}
	

	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception {

		
		Row = ExcelWSheet.getRow(RowNum);
		if (Row==null) {
			ExcelWSheet.createRow(RowNum);
			
		}
		System.out.println("inside setcelldata= row and col"+ RowNum +" "+ColNum);
		Cell = Row.getCell(ColNum);
		if (Cell == null) {
			 
            Cell = Row.createCell(ColNum);

            Cell.setCellValue(Result);

            } else {

                Cell.setCellValue(Result);

            }
		

		System.out.println("inside");
		FileOutputStream fileOut = new FileOutputStream("D:\\test1.xlsx");

		ExcelWBook.write(fileOut);

		fileOut.flush();

		fileOut.close();
	}

	public static int lastrow() {
		try {
			i = ExcelWSheet.getLastRowNum();

			return i;
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("exception last row");
			return 0;
		}

	}
	public static int lastCol() {
		try {
			Row = ExcelWSheet.getRow(0);
			int i=Row.getLastCellNum();
			

			return i;
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("exception last row");
			return 0;
		}
		
		
	}

}
