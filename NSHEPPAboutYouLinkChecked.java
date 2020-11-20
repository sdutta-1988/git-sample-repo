package NSHEPPWebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NSHEPPAboutYouLinkChecked {
	
	public static WebElement element = null;
	public static Object link1JS;

	public static WebElement Link1(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500);");
		Thread.sleep(2000);
		WebElement link1JS = driver.findElement(By.linkText("annualized pensionable earnings"));
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
	public static WebElement Link2(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement link2JS = driver.findElement(By.linkText("credited service"));
		if(link2JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link2JS.getText());

    		}
		else if(link2JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link2JS.getText());
			
		}
		else if(link2JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link2JS.getText());
			
		}
		else if(link2JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link2JS.getText());
			
		}
		else
		System.out.println("Link is  " +link2JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link2JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link2JS);	
		Thread.sleep(2000);
       WebElement closebuttonlink2JS = driver.findElement(By.xpath("/html//a[@id='btnClose']"));
		js.executeScript("arguments[0].click();", closebuttonlink2JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link2JS, "color: red; border: 0px solid red;");
		return link2JS;

	}
	public static WebElement Link3(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement link3JS = driver.findElement(By.linkText("early retirement provisions"));
		if(link3JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link3JS.getText());

    		}
		else if(link3JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link3JS.getText());
			
		}
		else if(link3JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link3JS.getText());
			
		}
		else if(link3JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link3JS.getText());
			
		}
		else
		System.out.println("Link is  " +link3JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link3JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link3JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link3JS, "color: red; border: 0px solid red;");
		return link3JS;

	}
	public static WebElement Link4(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0, 600);");
		WebElement link4JS = driver.findElement(By.linkText("bridging benefits"));
		if(link4JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link4JS.getText());

    		}
		else if(link4JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link4JS.getText());
			
		}
		else if(link4JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link4JS.getText());
			
		}
		else if(link4JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link4JS.getText());
			
		}
		else
		System.out.println("Link is  " +link4JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link4JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link4JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link4JS, "color: red; border: 0px solid red;");
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link4JS, "color: red; border: 0px solid red;");
		return link4JS;

	}
	public static WebElement Link5(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 600);");
		WebElement link5JS = driver.findElement(By.linkText("inflation protection"));
		if(link5JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link5JS.getText());

    		}
		else if(link5JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link5JS.getText());
			
		}
		else if(link5JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link5JS.getText());
			
		}
		else if(link5JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link5JS.getText());
			
		}
		else
		System.out.println("Link is  " +link5JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link5JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link5JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link5JS, "color: red; border: 0px solid red;");
		return link5JS;

	}
	public static WebElement Link6(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 600);");
		WebElement link6JS = driver.findElement(By.linkText("pre-retirement"));
		if(link6JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link6JS.getText());

    		}
		else if(link6JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link6JS.getText());
			
		}
		else if(link6JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link6JS.getText());
			
		}
		else if(link6JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link6JS.getText());
			
		}
		else
		System.out.println("Link is  " +link6JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link6JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link6JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link6JS, "color: red; border: 0px solid red;");
		return link6JS;

	}
	public static WebElement Link7(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 600);");
		WebElement link7JS = driver.findElement(By.linkText("post-retirement"));
		if(link7JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link7JS.getText());

    		}
		else if(link7JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link7JS.getText());
			
		}
		else if(link7JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link7JS.getText());
			
		}
		else if(link7JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link7JS.getText());
			
		}
		else
		System.out.println("Link is  " +link7JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link7JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link7JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link7JS, "color: red; border: 0px solid red;");
		return link7JS;

	}
	public static WebElement Link8(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 600);");
		WebElement link8JS = driver.findElement(By.linkText("portability"));
		if(link8JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +link8JS.getText());

    		}
		else if(link8JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +link8JS.getText());
			
		}
		else if(link8JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +link8JS.getText());
			
		}
		else if(link8JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +link8JS.getText());
			
		}
		else
		System.out.println("Link is  " +link8JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link8JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link8JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link8JS, "color: red; border: 0px solid red;");
		return link8JS;

	}
	public static WebElement Link9(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 600);");
		WebElement link9JS = driver.findElement(By.xpath("/html//div[@id='contentView']//a[@href='/our-members']"));
		if(link9JS.getAttribute("href") == null ){
    		System.out.println("----->Inactive Link " +link9JS.getText());

    		}
		
		else
		System.out.println("Link is  " +link9JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link9JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link9JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link9JS, "color: red; border: 0px solid red;");
		return link9JS;

	}
	public static WebElement Link10(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 800);");
		WebElement link10JS = driver.findElement(By.xpath("/html//div[@id='contentView']//a[@href='/participating-employers']"));
		if(link10JS.getAttribute("href") == null ){
    		System.out.println("----->Inactive Link " +link10JS.getText());

    		}
		
		else
		System.out.println("Link is  " +link10JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				link10JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", link10JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				link10JS, "color: red; border: 0px solid red;");
		return link10JS;

	}
	public static WebElement Link11(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 900);");
		WebElement Link11JS = driver.findElement(By.linkText("deferred pension"));
		if(Link11JS.getAttribute("href") == "#" ){
    		System.out.println("----->Inactive Link " +Link11JS.getText());

    		}
		else if(Link11JS.getAttribute("href") == "javascript:void(0)" )
		{
			System.out.println("----->Inactive Link " +Link11JS.getText());
			
		}
		else if(Link11JS.getAttribute("href") == "javascript:{}" )
		{
			System.out.println("----->Inactive Link " +Link11JS.getText());
			
		}
		else if(Link11JS.getAttribute("href") == "#0" )
		{
			System.out.println("----->Inactive Link " +Link11JS.getText());
			
		}
		else
		System.out.println("Link is  " +Link11JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				Link11JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Link11JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				Link11JS, "color: red; border: 0px solid red;");
		return Link11JS;

	}
	public static WebElement Link12(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 3000);");
		WebElement Link12JS = driver.findElement(By.linkText("Asset Mix Policy"));
		if(Link12JS.getAttribute("href") == null ){
    		System.out.println("----->Inactive Link " +Link12JS.getText());

    		}
		
		else
		System.out.println("Link is  " +Link12JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				Link12JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Link12JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				Link12JS, "color: red; border: 0px solid red;");
		return Link12JS;

	}
	public static WebElement Link13(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 2500);");
		WebElement Link13JS = driver.findElement(By.linkText("Rates of Return on Investments"));
		if(Link13JS.getAttribute("href") == null ){
    		System.out.println("----->Inactive Link " +Link13JS.getText());

    		}
		
		else
		System.out.println("Link is  " +Link13JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				Link13JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Link13JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				Link13JS, "color: red; border: 0px solid red;");
		return Link13JS;

	}
	public static WebElement Link14(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, 2500);");
		WebElement Link14JS = driver.findElement(By.linkText("valuation report"));
		if(Link14JS.getAttribute("href") == null ){
    		System.out.println("----->Inactive Link " +Link14JS.getText());

    		}
		
		else
		System.out.println("Link is  " +Link14JS.getText());
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);",
				Link14JS, "color: red; border: 5px solid red;");
		 Thread.sleep(2000);
		js.executeScript("arguments[0].click();", Link14JS);	
		Thread.sleep(2000);
		js.executeScript("arguments[0].removeAttribute('style', arguments[1]);",
				Link14JS, "color: red; border: 0px solid red;");
		return Link14JS;

	}

}
