package Seleniumdeepesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement123 {

	public static void main(String[] args) throws InterruptedException {
		// TO do operation on elements we use  methods of webelement interface
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/pnbc1/login.do");

		WebElement d=driver.findElement(By.id("username"));
		d.sendKeys("seemagrover92@gmail.com");
		WebElement p=driver.findElement(By.name("pwd"));
		p.sendKeys("hHvQUPXv");
		
		https://online.actitime.com/pnbc1/tasks/tasklist.do
}
}