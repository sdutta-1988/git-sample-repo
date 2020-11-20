package NSHEPPWebsiteAutomation;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testexceldata {
	private WebDriver driver;
	private String baseurl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdutta\\workspace\\libs\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseurl = "https://nshepp-development.azurewebsites.net/registration";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseurl);
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		String path = "C:\\Users\\sdutta\\workspace\\selenium\\bin\\NSHEPPWebsiteAutomation\\testregistrationfile.xlsx";
		String sheetName = "Sheet1";
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			Cell = ExcelWSheet.getRow(1).getCell(0);
			String cellData = Cell.getStringCellValue();
			System.out.println("Cell Data: " + cellData);
			driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys(cellData);
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	}


