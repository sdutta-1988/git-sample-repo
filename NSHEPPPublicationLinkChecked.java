package NSHEPPWebsiteAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NSHEPPPublicationLinkChecked {
	public static WebElement element = null;
	public static Object link2JS;
	
	public static List<WebElement> Link1(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 700);");
		WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		      if(link1JS.get(i).getAttribute("href") == null )
		      {
			     System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			     Inactiveactivelinks.add(link1JS.get(i));
			     for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }

			  }
		  	else if(link1JS.get(i).getAttribute("href") == "" )
			{
		  		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		  		Inactiveactivelinks.add(link1JS.get(i));
		  		for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
				
			}
		  	else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
		      {
			    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			    Inactiveactivelinks.add(link1JS.get(i));
			    for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
		      {
			System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			Inactiveactivelinks.add(link1JS.get(i));
			for(int j=0; j<Inactiveactivelinks.size(); j++)
		    {
		    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
		    	connection.connect();
		    	String response = connection.getResponseMessage();
		    	connection.disconnect();
		    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
		    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "#0" )
		     {
			 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			 Inactiveactivelinks.add(link1JS.get(i));
			 for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "#" )
			     {
				 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
				 Inactiveactivelinks.add(link1JS.get(i));
				 for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }
				
			      }
		     
		      else
		      {
		    	System.out.println("Link is  " +link1JS.get(i).getText());
		    	Thread.sleep(2000);
		    	System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
		    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
		    			link1JS.get(i), "color: red; border: 5px solid red;");
		    	link1JS.get(i).click();
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	 
	public static WebElement Link2(WebDriver driver) throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 400);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Most recent audited Financial Statements (as at December 31, 2019)."));
		if(link1JS.getAttribute("href") == null ){
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);

			}
		else if(link1JS.getAttribute("href") == "" )
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
	  // WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement Link3(WebDriver driver) throws InterruptedException, MalformedURLException, IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Investment Policy (SIP&P)"));
		if(link1JS.getAttribute("href") == null ){
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);


			}
		else if(link1JS.getAttribute("href") == "" )
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
	  // WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement Link4(WebDriver driver) throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 700);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector("div:nth-of-type(2) > .postGroup > ul > li:nth-of-type(3) > span > a[target='_blank']"));
		if(link1JS.getAttribute("href") == null ){
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);


			}
		else if(link1JS.getAttribute("href") == "" )
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
	  // WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement Link5(WebDriver driver) throws InterruptedException, IOException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 700);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Most recent consolidated Plan Text (as of December 31, 2016)."));
		if(link1JS.getAttribute("href") == null ){
			System.out.println("----->Inactive Link " +link1JS.getText());
			HttpURLConnection connection = (HttpURLConnection) new URL(link1JS.getAttribute("href")).openConnection();
	    	connection.connect();
	    	String response = connection.getResponseMessage();
	    	connection.disconnect();
	    	System.out.println(link1JS.getAttribute("href")+"--->"+response);


			}
		else if(link1JS.getAttribute("href") == "" )
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
	  // WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static List<WebElement> Link6(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500);");
		WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("Year in Review"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		      if(link1JS.get(i).getAttribute("href") == null )
		      {
			     System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			     Inactiveactivelinks.add(link1JS.get(i));
			     for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }

			  }
		  	else if(link1JS.get(i).getAttribute("href") == "" )
			{
		  		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		  		Inactiveactivelinks.add(link1JS.get(i));
		  		for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
				
			}
		  	else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
		      {
			    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			    Inactiveactivelinks.add(link1JS.get(i));
			    for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
		      {
			System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			Inactiveactivelinks.add(link1JS.get(i));
			for(int j=0; j<Inactiveactivelinks.size(); j++)
		    {
		    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
		    	connection.connect();
		    	String response = connection.getResponseMessage();
		    	connection.disconnect();
		    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
		    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "#0" )
		     {
			 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			 Inactiveactivelinks.add(link1JS.get(i));
			 for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "#" )
			     {
				 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
				 Inactiveactivelinks.add(link1JS.get(i));
				 for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }
				
			      }
		     
		      else
		      {
		    	System.out.println("Link is  " +link1JS.get(i).getText());
		    	Thread.sleep(2000);
		    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
		    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
		    			link1JS.get(i), "color: red; border: 5px solid red;");
		    	link1JS.get(i).click();
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	public static List<WebElement> Link7(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000);");
		WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("Newsletter for Active Members"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		      if(link1JS.get(i).getAttribute("href") == null )
		      {
			     System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			     Inactiveactivelinks.add(link1JS.get(i));
			     for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }

			  }
		  	else if(link1JS.get(i).getAttribute("href") == "" )
			{
		  		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		  		Inactiveactivelinks.add(link1JS.get(i));
		  		for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
				
			}
		  	else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
		      {
			    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			    Inactiveactivelinks.add(link1JS.get(i));
			    for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
		      {
			System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			Inactiveactivelinks.add(link1JS.get(i));
			for(int j=0; j<Inactiveactivelinks.size(); j++)
		    {
		    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
		    	connection.connect();
		    	String response = connection.getResponseMessage();
		    	connection.disconnect();
		    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
		    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "#0" )
		     {
			 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			 Inactiveactivelinks.add(link1JS.get(i));
			 for(int j=0; j<Inactiveactivelinks.size(); j++)
			    {
			    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
			    	connection.connect();
			    	String response = connection.getResponseMessage();
			    	connection.disconnect();
			    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
			    }
			
		      }
		      else if(link1JS.get(i).getAttribute("href") == "#" )
			     {
				 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
				 Inactiveactivelinks.add(link1JS.get(i));
				 for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }
				
			      }
		      else if(link1JS.get(i).getAttribute("href") == "" )
				{
			  		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
			  		Inactiveactivelinks.add(link1JS.get(i));
			  		for(int j=0; j<Inactiveactivelinks.size(); j++)
				    {
				    	HttpURLConnection connection = (HttpURLConnection) new URL(Inactiveactivelinks.get(j).getAttribute("href")).openConnection();
				    	connection.connect();
				    	String response = connection.getResponseMessage();
				    	connection.disconnect();
				    	System.out.println(Inactiveactivelinks.get(j).getAttribute("href")+"--->"+response);
				    }
					
				}
		     
		      else
		      {
		    	System.out.println("Link is  " +link1JS.get(i).getText());
		    	Thread.sleep(2000);
		    	System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
		    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
		    			link1JS.get(i), "color: red; border: 5px solid red;");
		    	link1JS.get(i).click();
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	
}


