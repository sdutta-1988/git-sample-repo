package NSHEPPWebsiteAutomation;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class testexcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		String path = "C:\\Users\\sdutta\\workspace\\selenium\\bin\\NSHEPPWebsiteAutomation\\testregistrationfile.xlsx";
		String sheetName = "Sheet1";
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			Cell = ExcelWSheet.getRow(0).getCell(0);
			String cellData = Cell.getStringCellValue();
			System.out.println("Cell Data: " + cellData);
			
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
}
