package NSHEPPWebsiteAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NSHEPPHomePageLinkChecked {
	public static WebElement element = null;
	public static Object link2JS;

	public static WebElement HomePageLink1(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='homeView']/div[@class='articleList']/div[1]/p[2]/a[@role='link']"));
		if(link1JS.getAttribute("href") == null){
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
	public static WebElement HomePageImage1(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='homeView']/div[@class='articleList']/div[1]/a[@href='/news']/img"));
		if(link1JS.getAttribute("href") == "#" ){
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
	public static WebElement HomePageLink2(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='homeView']/div[@class='articleList']/div[2]/p[2]/a[@role='link']"));
		if(link1JS.getAttribute("href") == "#" ){
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
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		 WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='loginView']/a[@role='link']"));
			js.executeScript("arguments[0].click();", closebuttonlink1JS);	
			Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement HomePageImage2(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='homeView']/div[@class='articleList']/div[2]/a[@role='link']/img"));
		if(link1JS.getAttribute("href") == "#" ){
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
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='loginView']/a[@role='link']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement HomePageLink3(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("/html//div[@id='homeView']/div[@class='articleList']/div[3]/p[2]/a[@role='link']"));
		if(link1JS.getAttribute("href") == null ){
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
		// WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='loginView']/a[@role='link']"));
			//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
			//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement HomePageImage3(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='homeView']/div[@class='articleList']/div[3]/a[@href='/spouse-beneficiary']/img"));
		if(link1JS.getAttribute("href") == "#" ){
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
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		//WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='loginView']/a[@role='link']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement HomePageLink4(WebDriver driver) throws InterruptedException,  IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("/html//div[@id='homeView']/div[@class='articleList']/div[4]/p[2]/a[@role='link']"));
		if(link1JS.getAttribute("href") == null ){
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
		// WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='loginView']/a[@role='link']"));
			//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
			//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement HomePageImage4(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='homeView']/div[@class='articleList']/div[4]/a[@href='/retiring']/img"));
		if(link1JS.getAttribute("href") == "#" ){
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
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		//WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='loginView']/a[@role='link']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}
	public static WebElement HomePageLink5(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("SITEMAP"));
		if(link1JS.getAttribute("href") == null ){
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
	public static WebElement HomePageLink6(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='footerLinks']/a[2]"));
		if(link1JS.getAttribute("href") == "#" ){
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
	public static WebElement HomePageLink7(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 100);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.xpath("//div[@id='footerLinks']/a[3]"));
		if(link1JS.getAttribute("href") == "#" ){
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
	     
		else
		System.out.println("Link is  " +link1JS.getText());
		//System.out.println("Link is  " +link1JS.getAttribute("href"));
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link1JS);	
		Thread.sleep(2000);
		WebElement closebuttonlink1JS = driver.findElement(By.xpath("//div[@id='privacyPolicyView']/a[@role='link']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;

	}

}
