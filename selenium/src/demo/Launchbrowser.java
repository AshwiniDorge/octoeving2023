package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowser {

public static void main(String[]args)	{
//launch chrome browser	
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
	//upcasting
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	
	
	
	
	
	
}	
	
}
