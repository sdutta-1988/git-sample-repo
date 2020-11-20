package NSHEPPWebsiteAutomation;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	private WebDriver driver;
	private String baseurl;
	private JavascriptExecutor js;



	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdutta\\workspace\\libs\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		baseurl = "https://nshepp-development.azurewebsites.net/plan-highlights";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl);
		
		
	}

}
