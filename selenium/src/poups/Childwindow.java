package poups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindow {
public static void main (String[]args) {
System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe") 	;
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement winbtn=driver.findElement(By.xpath("//button[@id='windowButton']"));
	winbtn.click();
	
	
	
	
	
	
	
	
}	
}
