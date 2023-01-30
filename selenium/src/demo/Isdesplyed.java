package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdesplyed {

	public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	driver.manage().window().maximize();
	
	
	//isdespleyed logo is visible or not
	
	//located fb logo webelement
	
	
	WebElement fblogo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
	
	boolean res=fblogo.isDisplayed();
	
	if (res==true) {
		System.out.println("logo is visible");
	}
	else
		System.out.println("logo is not visible");
	}
	
	
	}	

