package poups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpoups {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	WebElement custid=driver.findElement(By.xpath("//input[@name='cusid'])"));
	WebElement submit=driver.findElement(By.xpath("//input[@name='submit'])"));
	
	custid.sendKeys("124");
	submit.click();
	
	//switch to the alert poups
	Alert al = driver.switchTo().alert();
	//click on ok button
	//al.accept();
	
	//click on cancel button
	al.dismiss();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
