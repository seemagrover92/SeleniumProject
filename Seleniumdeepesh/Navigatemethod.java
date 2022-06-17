package Seleniumdeepesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.navigate().to("https://www.facebook.com/login/");
		//navigate to hold history?
		//get does not hold history?
	//WebElement m	=driver.findElement(By.linkText("Forgot account?"));
	//m.click();
	
		driver.navigate().to("https://www.facebook.com/");
	WebElement d=driver.findElement(By.xpath("//div[normalize-space(text())='for a celebrity, brand or business.']"));
	String j=d.getText();
	System.out.println(j);
	
	Thread.sleep(2000);
	//driver.navigate().back();
	//Thread.sleep(2000);
	//driver.navigate().forward();
	
	//driver.navigate().refresh();
	
	//String url=driver.getCurrentUrl();
//String pagesource	=driver.getPageSource();
	
	//System.out.println(url);
	//System.out.println(pagesource);
	}

}
