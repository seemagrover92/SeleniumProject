package Seleniumdeepesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1234 {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://online.actitime.com/pnbc1/login.do");
WebElement  k=driver.findElement(By.id("keepLoggedInCheckBox"));
k.click();
boolean g=k.isSelected();
System.out.println(g);
k.click();
boolean t=k.isSelected();
System.out.println(t);

WebElement  l=driver.findElement(By.id("loginButton"));
l.isEnabled();
boolean b2=k.isEnabled();
System.out.println(b2);
WebElement b3=driver.findElement(By.id("keepLoggedInLabel"));

System.out.println(b3.getText());
//boolean g3=
b3.isDisplayed();
System.out.println(b3.isDisplayed());



	}

}
