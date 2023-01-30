package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfillup {
public static void main (String[]args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	//upcasting
	
	WebDriver driver =new ChromeDriver();
	
	//give url
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	//locat all element
	
	WebElement fname=driver.findElement(By.xpath("//input[@name='firstName']"));
	WebElement lname=driver.findElement(By.xpath("//input[@name='lastName']"));
	WebElement phno=driver.findElement(By.xpath("//input[@name='phone']"));
	WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
	WebElement addrs=driver.findElement(By.xpath("//input[@name='address1']"));
	WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
	WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
	WebElement pincode=driver.findElement(By.xpath("//input[@name='postalCode']"));
	WebElement username=driver.findElement(By.xpath("//input[@name='email']"));
	WebElement passwrd=driver.findElement(By.xpath("//input[@name='password']"));
	WebElement conpaswrd=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
	WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
	
	
	//send key
	fname.sendKeys("ashwini");
	lname.sendKeys("dorge");
	phno.sendKeys("90000876456");
	email.sendKeys("ashwini@gmail.com");
	addrs.sendKeys("gopalpatti");
	city.sendKeys("pune");
	state.sendKeys("maharashtra");
	pincode.sendKeys("412307");
	username.sendKeys("ashwini")	;	
	passwrd.sendKeys("ashwini@123");		
	conpaswrd.sendKeys("ashwini@123");		
		submit.click();	
			
}
	
}
