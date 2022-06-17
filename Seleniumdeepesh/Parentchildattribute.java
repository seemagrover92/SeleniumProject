package Seleniumdeepesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildattribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
//become a seller
		//WebElement d=driver.findElement(By.xpath("//a[@class='_3-PJz-']/span"));

       //String f=d.getText();
      // System.out.println(f);
//visible text
WebElement t=driver.findElement(By.xpath("//div[text()='Grocery']"));
String f1=t.getText();
System.out.println(f1);

	}
}
