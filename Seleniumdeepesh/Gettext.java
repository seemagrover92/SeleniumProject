package Seleniumdeepesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/pnbc1/login.do");

		WebElement d=driver.findElement(By.id("username"));
		d.sendKeys("seemagrover92@gmail.com");
		WebElement p=driver.findElement(By.name("pwd"));
		p.sendKeys("hHvQUPXv");
		WebElement t=driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div"));
		t.click();
		
			Thread.sleep(2000);
		
		
		//got difficulty to understand x path.why not taken as link text
		WebElement g=driver.findElement(By.xpath("//div[text()='Tasks']"));
		g.click();
		
		//class6/10 at 28.04 (7149 class)
	//WebElement s=driver.findElement(By.xpath("//div[@class='collapseButtonPlaceholder']/following-sibling::div[@class='title']"));
	WebElement s=driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[1]/div[2]"));
	
	String text=s.getText();

System.out.println(text);
	}

}
