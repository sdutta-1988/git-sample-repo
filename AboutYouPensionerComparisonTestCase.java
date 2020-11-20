package NSHEPPWebsiteAutomation;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

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

public class AboutYouPensionerComparisonTestCase {
	private WebDriver driver;
	private String baseurl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdutta\\workspace\\libs\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseurl = "https://nshepp-development.azurewebsites.net/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}


	@Test
	public void test() {
		
		XSSFWorkbook ExcelWBook;
		XSSFSheet ExcelWSheet;
		XSSFCell Cell;
		String path = "C:\\Users\\sdutta\\workspace\\selenium\\bin\\NSHEPPWebsiteAutomation\\Aboutyou.xlsx";
		String sheetName = "Sheet1";
		try {
			FileInputStream ExcelFile = new FileInputStream(path);
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(sheetName);
			Cell = ExcelWSheet.getRow(1).getCell(0);
			//Iterator<Cell> cellIterator = Cell.iterator();
			int rowcount = ExcelWSheet.getLastRowNum();
			System.out.println("Cell Data: " + rowcount);
		
			String cellData = Cell.getStringCellValue();
			//System.out.println("Cell Data: " + cellData);
			for (int i=1;i<rowcount+1;i++)
				
			{
				driver.get(baseurl);
				WebElement link1JS = driver.findElement(By.xpath("//div[@id='header']/button[.=' Secure login ']"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", link1JS);	
				//Cell = ExcelWSheet.getRow(i).getCell(0);
				XSSFRow currentrow = ExcelWSheet.getRow(i);
				String value = currentrow.getCell(0).toString();
				System.out.println("Username: " + value);
				driver.findElement(By.xpath("/html//input[@id='username']")).sendKeys(value);
				Thread.sleep(2000);
				String value1 = currentrow.getCell(1).toString();
				System.out.println("Password: " + value1);
				driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys(value1);
				Thread.sleep(2000);
				WebElement link2JS = driver.findElement(By.xpath("/html//button[@id='submit']"));
				js.executeScript("arguments[0].click();", link2JS);
				js.executeScript("window.scrollBy(0, 200);");
				WebElement link3JS = driver.findElement(By.xpath("/html//div[@id='contentView']//a[@href='/pensioner-about']"));
				js.executeScript("arguments[0].click();", link3JS);
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, 400);");
				String Lastname =  driver.findElement(By.xpath("/html//div[@id='contentView']//app-pensioners-about/div/div[@class='ng-star-inserted']/div[1]/div[@class='readOnly']")).getText();
				System.out.println("Website Data: " + Lastname.trim());
				String value2 = currentrow.getCell(2).toString();
				System.out.println("Excel Data: " + value2.trim());
				String value5 = currentrow.getCell(5).toString();
				//object result = System.out.println(Lastname.trim().equals(value2.trim()));
				if(Lastname.equals(" "))
				{
					String Lastname1 = "null";
					System.out.println("Website Data: " + Lastname1.trim());
					if(Lastname1.trim().equals(value2.trim()) == true)
					{
						System.out.println("Both LastNames have null values for the nshepp id " + value5);
						
					}
				}
				else if(Lastname.trim().equals(value2.trim()) == true)
				{
					System.out.println("Last name matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Last name doesnt match for the nshepp id " + value5);
				js.executeScript("window.scrollBy(0, 500);");
				String Firstname =  driver.findElement(By.xpath("/html//div[@id='contentView']//app-pensioners-about/div/div[@class='ng-star-inserted']/div[2]/div[@class='readOnly']")).getText();
				System.out.println("Website Data: " + Firstname.trim());
				String value3 = currentrow.getCell(3).toString();
				System.out.println("Excel Data: " + value3.trim());
				if(Firstname.equals(" "))
				{
					String Firstname1 = "null";
					System.out.println("Website Data: " + Firstname1.trim());
					if(Firstname1.trim().equals(value3.trim()) == true)
					{
						System.out.println("Both FirstNames have null values for the nshepp id " + value5);
						
					}
				}
				if(Firstname.trim().equals(value3.trim()) == true)
				{
					System.out.println("First Name matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("First Name doesnt match for the nshepp id " + value5);
				String MiddleName =  driver.findElement(By.xpath("/html//div[@id='contentView']//app-pensioners-about/div/div[@class='ng-star-inserted']/div[3]/div[@class='readOnly']")).getText();
				//System.out.println("Website Data: " + MiddleName.trim());
				String value4 = currentrow.getCell(4).toString();
				System.out.println("Excel Data: " + value4.trim());
				if(MiddleName.equals(" "))
				{
					String MiddleName1 = "null";
					System.out.println("Website Data: " + MiddleName1.trim());
					if(MiddleName1.trim().equals(value4.trim()) == true)
					{
						System.out.println("Both MiddleName have null values for the nshepp id " + value5);
						
					}
				}
				else if(MiddleName.trim().equals(value4.trim()) == true)
				{
					System.out.println("MiddleName matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("MiddleName doesnt match for the nshepp id " + value5);
				js.executeScript("window.scrollBy(0, 800);");
				String Address1 =  driver.findElement(By.xpath("/html//input[@id='editStreet1']")).getAttribute("value");
				System.out.println("Website Data: " + Address1.trim());
				String value6 = currentrow.getCell(6).toString();
				System.out.println("Excel Data: " + value6.trim());
				if(Address1.equals(""))
				{
					String Address11 = "null";
					System.out.println("Website Data: " + Address1.trim());
					if(Address11.trim().equals(value6.trim()) == true)
					{
						System.out.println("Both Address1 fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(Address1.trim().equals(value6.trim()) == true)
				{
					System.out.println("Address1 matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Address1 doesnt match for the nshepp id " + value5);
				String Address2 =  driver.findElement(By.xpath("/html//input[@id='editUnit']")).getAttribute("value");
				System.out.println("Website Data: " + Address2.trim());
				String value7 = currentrow.getCell(7).toString();
				System.out.println("Excel Data: " + value7.trim());
				if(Address2.equals(""))
				{
					String Address22 = "null";
					System.out.println("Website Data: " + Address22.trim());
					if(Address22.trim().equals(value7.trim()) == true)
					{
						System.out.println("Both Address2 fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(Address2.trim().equals(value7.trim()) == true)
				{
					System.out.println("Address2 matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Address2 doesnt match for the nshepp id " + value5);
				js.executeScript("window.scrollBy(0, 1000);");
				String city =  driver.findElement(By.xpath("/html//input[@id='editCity']")).getAttribute("value");
				System.out.println("Website Data: " + city.trim());
				String value8 = currentrow.getCell(8).toString();
				System.out.println("Excel Data: " + value8.trim());
				if(city.equals(""))
				{
					String city1 = "null";
					System.out.println("Website Data: " + Address1.trim());
					if(city1.trim().equals(value8.trim()) == true)
					{
						System.out.println("Both city fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(Address1.trim().equals(value6.trim()) == true)
				{
					System.out.println("City matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("City doesnt match for the nshepp id " + value5);
				js.executeScript("window.scrollBy(0, 1000);");
				String Province =  driver.findElement(By.xpath("/html//input[@id='editProvince']")).getAttribute("value");
				System.out.println("Website Data: " + Province.trim());
				String value9 = currentrow.getCell(9).toString();
				System.out.println("Excel Data: " + value9.trim());
				if(Province.equals(""))
				{
					String Province1 = "null";
					System.out.println("Website Data: " + Province1.trim());
					if(Province1.trim().equals(value9.trim()) == true)
					{
						System.out.println("Both Province fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(Province.trim().equals(value9.trim()) == true)
				{
					System.out.println("Province matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Province doesnt match for the nshepp id " + value5);
				js.executeScript("window.scrollBy(0, 1000);");
				String Postalcode =  driver.findElement(By.xpath("/html//input[@id='editPostalCode']")).getAttribute("value");
				System.out.println("Website Data: " + Postalcode.trim());
				String value10 = currentrow.getCell(10).toString();
				System.out.println("Excel Data: " + value10.trim());
				if(Postalcode.equals(""))
				{
					String Postalcode1 = "null";
					System.out.println("Website Data: " + Postalcode1.trim());
					if(Postalcode1.trim().equals(value10.trim()) == true)
					{
						System.out.println("Both Postalcode fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(Postalcode.trim().equals(value10.trim()) == true)
				{
					System.out.println("Postalcode matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Postalcode doesnt match for the nshepp id " + value5);
				js.executeScript("window.scrollBy(0, 1500);");
				String Country =  driver.findElement(By.xpath("/html//input[@id='editCountry']")).getAttribute("value");
				System.out.println("Website Data: " + Country.trim());
				String value11 = currentrow.getCell(11).toString();
				System.out.println("Excel Data: " + value11.trim());
				if(Country.equals(""))
				{
					String Country1 = "null";
					System.out.println("Website Data: " + Country1.trim());
					if(Country1.trim().equals(value11.trim()) == true)
					{
						System.out.println("Both Country fields have null values for the nshepp id " + value11);
						
					}
				}
				else if(Country.trim().equals(value11.trim()) == true)
				{
					System.out.println("Country matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Country doesnt match for the nshepp id " + value5);
				//js.executeScript("window.scrollBy(0, 1500);");
				String Phone =  driver.findElement(By.xpath("/html//input[@id='editPhone']")).getAttribute("value");
				System.out.println("Website Data: " + Phone.trim());
				String value12 = currentrow.getCell(12).toString();
				System.out.println("Excel Data: " + value12.trim());
				if(Phone.equals(""))
				{
					String Phone1 = "null";
					System.out.println("Website Data: " + Phone1.trim());
					if(Phone1.trim().equals(value12.trim()) == true)
					{
						System.out.println("Both Phone fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(Phone.trim().equals(value12.trim()) == true)
				{
					System.out.println("Phone matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Phone doesnt match for the nshepp id " + value5);
				String email =  driver.findElement(By.xpath("/html//input[@id='editStreet']")).getAttribute("value");
				System.out.println("Website Data: " + email.trim());
				String value13 = currentrow.getCell(13).toString();
				System.out.println("Excel Data: " + value13.trim());
				if(email.equals(""))
				{
					String email1 = "null";
					System.out.println("Website Data: " + email1.trim());
					if(email1.trim().equals(value13.trim()) == true)
					{
						System.out.println("Both Email fields have null values for the nshepp id " + value5);
						
					}
				}
				else if(email.trim().equals(value13.trim()) == true)
				{
					System.out.println("Email matches for the nshepp id " + value5);
					
				}
				else
					System.out.println("Email doesnt match for the nshepp id " + value5);
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, -2000);");
				WebElement linkuser = driver.findElement(By.xpath("//div[@id='header']/button/img"));
				js.executeScript("arguments[0].click();", linkuser);
				Thread.sleep(2000);
				WebElement logout = driver.findElement(By.xpath("//div[@id='userMenu']/a[@role='link']"));
				js.executeScript("arguments[0].click();", logout);
				Thread.sleep(2000);
				
			}
		}
				
				
				
			
			
				
				
			
			
	
	
			
			catch (Exception e) {
		e.printStackTrace();
			}
	}
}
	
	
	


