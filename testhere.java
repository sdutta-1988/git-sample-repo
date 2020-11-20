package NSHEPPWebsiteAutomation;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testhere {
	private WebDriver driver;
	private String baseurl;
	private String baseurl1;
	private JavascriptExecutor js;

	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sdutta\\workspace\\libs\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor)driver;
		baseurl1 = "https://nshepp-development.azurewebsites.net/joining";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseurl1);
		js.executeScript("window.scrollBy(0, 200);");
		
		    
	
}
}
	

