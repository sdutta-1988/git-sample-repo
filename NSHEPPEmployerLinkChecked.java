package NSHEPPWebsiteAutomation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NSHEPPEmployerLinkChecked {
	public static WebElement element = null;
	public static Object link2JS;

	public static WebElement FormsanddocumentsLink1(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Application for Enrollment/Re-Enrollment*"));
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
	public static WebElement FormsanddocumentsLink2(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Employee Change of Information*"));
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
	public static WebElement FormsanddocumentsLink3(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Option Form - Eligibility to join NSHEPP (part-time employee)"));
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
	public static WebElement FormsanddocumentsLink4(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Leaves of Absence (Unpaid)*"));
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
	public static WebElement FormsanddocumentsLink5(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Appendix A - Transfer Information Request and Authorization Form"));
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
	public static WebElement FormsanddocumentsLink6(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Notice of Termination"));
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
	public static WebElement FormsanddocumentsLink7(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Declaration of Spousal Status at Termination"));
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
	public static WebElement FormsanddocumentsLink8(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Notice of Retirement"));
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
	public static WebElement FormsanddocumentsLink9(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Declaration of Spousal Status at Retirement"));
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
	public static WebElement FormsanddocumentsLink10(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Retired Member Change of Information Form*"));
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
	public static WebElement FormsanddocumentsLink11(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 800);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Authorization for Direct Deposit"));
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
	public static WebElement FormsanddocumentsLink12(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Notice of Death"));
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
	public static WebElement FormsanddocumentsLink13(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Declaration of Spousal Status at Death"));
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
	public static WebElement FormsanddocumentsLink14(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Remittance Form"));
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
	public static WebElement FormsanddocumentsLink15(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Remittance Details"));
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
	public static List<WebElement> PlanHighlights1(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 400);");
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("pensionable earning"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		     
		  	 if(link1JS.get(i).getAttribute("href") == "" )
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
		    	WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		    	js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	public static List<WebElement> PlanHighlights2(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 400);");
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("YMPE"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		     
		  	 if(link1JS.get(i).getAttribute("href") == "" )
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
		    	WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		    	js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	public static WebElement PlanHighlights3(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("full-time employees"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights4(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("part-time employees"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights5(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(10) [role]"));
		
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
	  // WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static List<WebElement> PlanHighlights6(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1200);");
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("continuous service"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		     
		  	 if(link1JS.get(i).getAttribute("href") == "" )
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
		    	WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		    	js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	public static WebElement PlanHighlights7(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Trustees"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static List<WebElement> PlanHighlights8(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600);");
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("spouse"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		     
		  	 if(link1JS.get(i).getAttribute("href") == "" )
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
		    	WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		    	js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	public static List<WebElement> PlanHighlights9(WebDriver driver) throws InterruptedException, IOException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 600);");
		//WebDriverWait wait = new WebDriverWait(driver,100);
		//WebElement link1JS = driver.findElement(By.linkText("Employee Information Booklet (Prescription for a Financially Healthy Retirement)"));
		//List<WebElement> linksToClick = new ArrayList<WebElement>();
		List<WebElement> link1JS = driver.findElements(By.partialLinkText("deferred pension"));
		List<WebElement> Inactiveactivelinks = new ArrayList<WebElement>();
		 int size = link1JS.size();
		    System.out.println("Size of the list: " + size);
		    for (int i=0; i<size; i++)
		    {
		     
		  	 if(link1JS.get(i).getAttribute("href") == "" )
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
		    	WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		    	js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		    	Thread.sleep(2000);
		    	Thread.sleep(2000);
			     js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			    		 link1JS.get(i), "color: red; border: 0px solid red;");
		    

	          }
		
	         }
	        
			return link1JS;
	 }
	public static WebElement PlanHighlights10(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("commuted value"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights11(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("Locked-In Retirement Account"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights12(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(21) [role='link']:nth-child(3)"));
		
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
	   //WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights13(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2000);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(23) [role='link']:nth-child(3)"));
		
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
	   //WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights14(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2200);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(26) [role]"));
		
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
	   //WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		//js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		//Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights15(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2700);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("spousal status"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
	public static WebElement PlanHighlights16(WebDriver driver) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 2700);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("dependent children"));
		
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
	   WebElement closebuttonlink1JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink1JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link1JS, "color: red; border: 0px solid red;");
		return link1JS;
		
	}
}
