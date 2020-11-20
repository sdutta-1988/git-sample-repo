package NSHEPPWebsiteAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NSHEPPEmployeeLinkChecked {
	public static WebElement element = null;
	public static Object link2JS;


public static WebElement PlanHighlightsLink1(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("full-time employees"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else
	System.out.println("Link is  " +link1JS.getText());
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
public static WebElement PlanHighlightsLink2(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("part-time employees"));
	System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else
	System.out.println("Link is  " +link1JS.getText());
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

public static List<WebElement> PlanHighlightsLink3(WebDriver driver) throws InterruptedException 
 {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("annualized pensionable earnings"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static List<WebElement> PlanHighlightsLink4(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("YMPE"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement PlanHighlightsLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("pensionable earnings"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else
	System.out.println("Link is  " +link1JS.getText());
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
public static WebElement PlanHighlightsLink6(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.xpath("/html//div[@id='contentView']//div[@class='contentText']/ul[4]//a[@role='link']"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else
	System.out.println("Link is  " +link1JS.getText());
	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
			link1JS, "color: red; border: 5px solid red;");
	 Thread.sleep(2000);
	js.executeScript("arguments[0].click();", link1JS);	
	Thread.sleep(2000);
	js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
			link1JS, "color: red; border: 0px solid red;");
	return link1JS;

}
public static List<WebElement> PlanHighlightsLink7(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1200);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("continuous service"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement PlanHighlightsLink8(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("Trustees"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> PlanHighlightsLink9(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1700);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("spouse"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement PlanHighlightsLink10(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1700);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.xpath("/html//div[@id='contentView']//div[@class='contentText']/p[5]/a[2]"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement PlanHighlightsLink11(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1700);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.xpath("/html//div[@id='contentView']//div[@class='contentText']/p[7]/a[2]"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> PlanHighlightsLink12(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1900);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("deferred pension"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement PlanHighlightsLink13(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1900);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("commuted value"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement PlanHighlightsLink14(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1900);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("Locked-In Retirement Account"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
   public static WebElement PlanHighlightsLink15(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2100);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(26) [role]"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement PlanHighlightsLink16(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("spousal status"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement PlanHighlightsLink17(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("dependent children"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> ContributionsLink1(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("annualized pensionable earnings"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static List<WebElement> ContributionsLink2(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("YMPE"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static List<WebElement> ContributionsLink3(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("pensionable earnings"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement ContributionsLink4(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 2500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("Trustees"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement ContributionsLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("Plan Sponsors"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement NamingaBenLink1(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("Employee Change of Information form"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == null ){
		System.out.println("----->Inactive Link " +link1JS.getText());

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
public static WebElement NamingaBenLink2(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(16) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement NamingaBenLink3(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(20) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement NamingaBenLink4(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(21) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement NamingaBenLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(21) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> JoiningtheplanLink1(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("full-time employee"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement JoiningtheplanLink2(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("Full-time employees"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> JoiningtheplanLink3(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.partialLinkText("YMPE"));
	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else
	      {
	    	System.out.println("Link is  " +link1JS.get(i).getText());
	    	Thread.sleep(2000);
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	    			link1JS.get(i), "color: red; border: 5px solid red;");
	    	link1JS.get(i).click();
	    	Thread.sleep(2000);
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
public static WebElement JoiningtheplanLink4(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("credited service"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement JoiningtheplanLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 150);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("here"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == null ){
		System.out.println("----->Inactive Link " +link1JS.getText());

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
public static WebElement EmploymentchangesLink1(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("commuted value"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink2(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("here"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink3(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(4) li:nth-child(2) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink4(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText span .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText span .glossaryLink:nth-of-type(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink6(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.linkText("contact us"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink7(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ol:nth-child(27) li:nth-of-type(1) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement EmploymentchangesLink8(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ol:nth-child(27) li:nth-of-type(2) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink1(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(3) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> LifeEventsLink2(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("dependent children"));
	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else
	      {
	    	System.out.println("Link is  " +link1JS.get(i).getText());
	    	Thread.sleep(2000);
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	    			link1JS.get(i), "color: red; border: 5px solid red;");
	    	link1JS.get(i).click();
	    	Thread.sleep(2000);
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
public static List<WebElement> LifeEventsLink3(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("commuted value"));
	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else
	      {
	    	System.out.println("Link is  " +link1JS.get(i).getText());
	    	Thread.sleep(2000);
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	    			link1JS.get(i), "color: red; border: 5px solid red;");
	    	link1JS.get(i).click();
	    	Thread.sleep(2000);
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
public static List<WebElement> LifeEventsLink4(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 200);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("dependent child"));
	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else
	      {
	    	System.out.println("Link is  " +link1JS.get(i).getText());
	    	Thread.sleep(2000);
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	    			link1JS.get(i), "color: red; border: 5px solid red;");
	    	link1JS.get(i).click();
	    	Thread.sleep(2000);
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
public static WebElement LifeEventsLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(3) .glossaryLink:nth-of-type(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink6(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(5) li:nth-of-type(1) span .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink7(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText li:nth-of-type(1) span .glossaryLink:nth-of-type(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink8(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText span .glossaryLink:nth-of-type(5)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink9(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText span .glossaryLink:nth-of-type(6)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink10(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(5) li:nth-of-type(3) span .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink11(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(8) li:nth-of-type(1) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> LifeEventsLink12(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("pensionable earnings"));
	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else
	      {
	    	System.out.println("Link is  " +link1JS.get(i).getText());
	    	Thread.sleep(2000);
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	//System.out.println("Link is  " +link1JS.get(i).getAttribute("href"));
	    	js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
	    			link1JS.get(i), "color: red; border: 5px solid red;");
	    	link1JS.get(i).click();
	    	Thread.sleep(2000);
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
public static WebElement LifeEventsLink13(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(8) span .glossaryLink:nth-of-type(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink14(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(14) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink15(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(17) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink16(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(17) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink17(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(19) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink18(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(22) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink19(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(24) li:nth-of-type(2) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink20(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(24) li:nth-of-type(3) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink21(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(30) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink22(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(30) .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink23(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .popupLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement LifeEventsLink24(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(32) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink1(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText > p:nth-child(4) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink2(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText > p:nth-child(4) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink3(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(5) p:nth-of-type(1) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink4(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(5) p:nth-of-type(3) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink5(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(5) p:nth-of-type(5) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink6(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText > p:nth-child(7) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink7(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText > p:nth-child(7) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink8(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText > p:nth-child(9) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink9(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(12) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink10(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(14) .darkBlue:nth-of-type(1) b .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink11(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) .darkBlue:nth-of-type(1) b .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink12(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) b .glossaryLink:nth-child(4)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink13(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(2) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink14(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(2) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink15(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(2) .glossaryLink:nth-of-type(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink16(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(4) > .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink17(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(4) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink18(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(4) i .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink19(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .darkBlue:nth-of-type(8) b .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink20(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .darkBlue:nth-of-type(8) b .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink21(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(14) p:nth-of-type(9) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink22(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(9) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink23(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(11) .glossaryLink:nth-child(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink24(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(14) p:nth-of-type(11) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink25(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(13) > .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink26(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(13) i .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink27(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(15) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink28(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(15) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink29(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(16) .glossaryLink:nth-child(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink30(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(16) .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink31(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(16) .glossaryLink:nth-child(4)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink32(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(16) .glossaryLink:nth-child(5)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink33(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(16) .glossaryLink:nth-child(6)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink34(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) .darkBlue:nth-of-type(1) b .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink35(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) .darkBlue:nth-of-type(1) b .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink36(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) b .glossaryLink:nth-child(4)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink37(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(2) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink38(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(2) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink39(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(2) .glossaryLink:nth-of-type(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink40(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(4) > .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink41(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(4) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink42(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(4) i .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink43(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .darkBlue:nth-of-type(6) b .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink44(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .darkBlue:nth-of-type(6) b .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink45(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(7) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink46(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(7) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink47(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .formulaBox:nth-child(20) p:nth-of-type(9) > .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink48(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-of-type(9) i .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink49(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(21) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink50(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 300);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(21) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static List<WebElement> RetiringLink51(WebDriver driver) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	List<WebElement> link1JS = driver.findElements(By.linkText("continuous service"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	 int size = link1JS.size();
	    System.out.println("Size of the list: " + size);
	    for (int i=0; i<size; i++)
	    {
	      if(link1JS.get(i).getAttribute("href") == "#" )
	      {
		     System.out.println("----->Inactive Link " +link1JS.get(i).getText());

		  }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:void(0)" )
	      {
		    System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "javascript:{}" )
	      {
		System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
	      }
	      else if(link1JS.get(i).getAttribute("href") == "#0" )
	     {
		 System.out.println("----->Inactive Link " +link1JS.get(i).getText());
		
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
public static WebElement RetiringLink52(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(30) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink53(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(31) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink54(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(31) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink55(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(33) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink56(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .noBullets:nth-child(34) li:nth-of-type(1) p:nth-of-type(2) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink57(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 600);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .noBullets:nth-child(34) p:nth-of-type(2) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink58(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .noBullets:nth-child(34) li:nth-of-type(2) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink59(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(35) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink60(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 500);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .noBullets:nth-child(36) p:nth-of-type(2) .glossaryLink:nth-of-type(1)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink61(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 400);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .noBullets:nth-child(36) p:nth-of-type(2) .glossaryLink:nth-of-type(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink62(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 2000);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText p:nth-child(53) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink63(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 650);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText .popupLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink64(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 2000);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".contentText ul:nth-child(61) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink65(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 1000);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".sidebar li:nth-of-type(2) .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink66(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".sidebar li:nth-of-type(3) b .glossaryLink"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink67(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".sidebar span .glossaryLink:nth-child(2)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink68(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".sidebar span .glossaryLink:nth-child(3)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
public static WebElement RetiringLink69(WebDriver driver) throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("window.scrollBy(0, 800);");
	Thread.sleep(2000);
	WebElement link1JS = driver.findElement(By.cssSelector(".sidebar span .glossaryLink:nth-child(4)"));
	//System.out.println("Link is  " +link1JS.getAttribute("href"));
	if(link1JS.getAttribute("href") == "#" ){
		System.out.println("----->Inactive Link " +link1JS.getText());

		}
	else if(link1JS.getAttribute("href") == "javascript:void(0)" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "javascript:{}" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
	}
	else if(link1JS.getAttribute("href") == "#0" )
	{
		System.out.println("----->Inactive Link " +link1JS.getText());
		
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
