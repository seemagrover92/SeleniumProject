package test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Variable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","chromedriver-8.exe" );

		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Create New Account")));
	//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Create New Account"))));
		
	driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
	
		Thread.sleep(1000)	;
		
			
Select sel=new Select(driver.findElement(By.id("month")));
	
List<WebElement>option	=sel.getOptions();

for(WebElement wb:option) 
	
{System.out.println(wb.getText());}

    sel.selectByIndex(6);
	
	Thread.sleep(1000)	;
	
Select sel1=new Select(driver.findElement(By.id("day")));
	
	sel1.selectByValue("3");
	
	Thread.sleep(1000)	;
	
Select sel2=new Select(driver.findElement(By.id("year")));

	sel2.selectByVisibleText("1994");
	
	List<WebElement>option1	=sel2.getOptions();

	for(WebElement wb1:option1) 
		
	{System.out.println(wb1.getText());
}

}}
