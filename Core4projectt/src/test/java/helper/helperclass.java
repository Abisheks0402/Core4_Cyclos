package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class helperclass {
    public static int password1;
    public static String Username;
    public static void run() throws IOException {
    File f = new File("C:\\Users\\rmaruthamuthu\\eclipse-workspace\\Core4projectt\\exel\\Book2 (1).xlsx");

    FileInputStream fis = new FileInputStream(f);

     

    XSSFWorkbook wb = new XSSFWorkbook(fis);

    Sheet mysheet = (Sheet) wb.getSheet("Sheet1");

    Row row = mysheet.getRow(1);

     

    Cell cell = row.getCell(0);

    Cell cell2 = row.getCell(1);

     

    String username = cell.getStringCellValue();

    int password = (int) cell2.getNumericCellValue();

     

  String pass = Integer.toString(password);
    

    }
}

