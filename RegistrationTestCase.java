package NSHEPPWebsiteAutomation;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.Table.Cell;

public class RegistrationTestCase {
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
			//Iterator<Cell> cellIterator = Cell.iterator();
			int rowcount = ExcelWSheet.getLastRowNum();
			System.out.println("Cell Data: " + rowcount);
			//String cellData = Cell.getStringCellValue();
			//System.out.println("Cell Data: " + cellData);
			for (int i=1;i<rowcount+1;i++)
			{
				//Cell = ExcelWSheet.getRow(i).getCell(0);
				XSSFRow currentrow = ExcelWSheet.getRow(i);
				String value = currentrow.getCell(0).toString();
				System.out.println("Cell Data: " + value);
				driver.findElement(By.xpath("/html//input[@id='email']")).sendKeys(value);
				Thread.sleep(2000);
				String value1 = currentrow.getCell(1).toString();
				System.out.println("Cell Data: " + value1);
				driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys(value1);
				Thread.sleep(2000);
				String value2 = currentrow.getCell(1).toString();
				System.out.println("Cell Data: " + value2);
				driver.findElement(By.xpath("/html//input[@id='confirmPassword']")).sendKeys(value2);
				Thread.sleep(2000);
				String value3 = currentrow.getCell(2).toString();
				System.out.println("Cell Data: " + value3);
				driver.findElement(By.xpath("/html//input[@id='fullName']")).sendKeys(value3);
				String value4 = currentrow.getCell(3).toString();
				System.out.println("Cell Data: " + value4);
				driver.findElement(By.xpath("/html//input[@id='sin']")).sendKeys(value4);
				Thread.sleep(2000);
				String value5 = currentrow.getCell(4).toString();
				System.out.println("Cell Data: " + value5);
				driver.findElement(By.xpath("/html//input[@id='dob']")).sendKeys(value5);
				Thread.sleep(2000);
				String value6 = currentrow.getCell(5).toString();
				System.out.println("Cell Data: " + value6);
				driver.findElement(By.xpath("/html//input[@id='nsheppId']")).sendKeys(value6);
				Thread.sleep(2000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0, 2000);");
				
				WebElement link1JS = driver.findElement(By.xpath("/html//div[@id='contentView']//form//button[@type='submit']"));
				System.out.println("Link is  " +link1JS.getAttribute("href"));
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
						link1JS, "color: red; border: 5px solid red;");
				js.executeScript("arguments[0].click();", link1JS);	
				//link1JS.click();
				Thread.sleep(2000);
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, -500);");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, -500);");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, -500);");
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, -500);");
				driver.findElement(By.xpath("/html//input[@id='email']")).clear();
				driver.findElement(By.xpath("/html//input[@id='password']")).clear();
				driver.findElement(By.xpath("/html//input[@id='confirmPassword']")).clear();
				driver.findElement(By.xpath("/html//input[@id='fullName']")).clear();
				driver.findElement(By.xpath("/html//input[@id='sin']")).clear();
				driver.findElement(By.xpath("/html//input[@id='dob']")).clear();
				driver.findElement(By.xpath("/html//input[@id='nsheppId']")).clear();
				
				
			}
			
				
				
			
			
	
	
			
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
