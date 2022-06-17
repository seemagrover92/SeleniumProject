package Seleniumdeepesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://online.actitime.com/pnbc1/login.do");

//WebElement d=driver.findElement(By.id("username"));

WebElement d=driver.findElement(By.name("username"));
d.sendKeys("seemagrover92@gmail.com");
WebElement p=driver.findElement(By.name("pwd"));
p.sendKeys("hHvQUPXv");
WebElement t=driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div"));
t.click();
String f=driver.getTitle();
System.out.println(f);

	}

}
