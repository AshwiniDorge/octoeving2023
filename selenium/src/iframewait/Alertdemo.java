package iframewait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver", "D:\\my space\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/");
	//driver.manage().window().maximize();
	
	WebElement custid=driver.findElement(By.xpath("/input[@name='emailid']"));
	WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
	
	
	custid.sendKeys("123");
	submit.click();
	Alert al=driver.switchTo().alert();
	al.accept();
	
	

	//al.dismiss();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
