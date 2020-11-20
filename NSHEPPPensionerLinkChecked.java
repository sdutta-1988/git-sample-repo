package NSHEPPWebsiteAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NSHEPPPensionerLinkChecked {
	public static WebElement element = null;
	public static Object link2JS;

	public static WebElement PensionPaymentsLink1(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(5) li:nth-of-type(1) [tabindex]"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink2(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(5) li:nth-of-type(2) [tabindex]"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink3(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText li:nth-of-type(3) [tabindex]"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink4(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText li:nth-of-type(4) [tabindex]"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink5(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1300);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(11) .popupLink"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		   WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='contactView']/a[@role='link']"));
			js.executeScript("arguments[0].click();", closebuttonlink1JS);	
			Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink6(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(14) [tabindex]"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink7(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector("p:nth-of-type(9) > a[target='_blank']"));
		if(link1JS.getAttribute("href") == null)
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink8(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector("p:nth-of-type(10) > a[target='_blank']"));
		if(link1JS.getAttribute("href") == null )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
			else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink9(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(19) .popupLink"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		   WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='contactView']/a[@role='link']"));
			js.executeScript("arguments[0].click();", closebuttonlink1JS);	
			Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement PensionPaymentsLink10(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".glossaryLink"));
		if(link1JS.getAttribute("href") == "" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == " " )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else if(link1JS.getAttribute("href") == "#" )
		{
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			
		}
		else
		System.out.println("Link is  " +link1JS.getText());
		System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
			js.executeScript("arguments[0].click();", closebuttonlink1JS);	
			Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}

	}


