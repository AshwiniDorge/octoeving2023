package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsermethod {

public static void main	(String[]args) {
	
	//launch browser
	
	System.setProperty("webdriver.chrome.driver", "D:\\my space\\chromedriver.exe");
	
	
	
	//upcasting
	
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	String title=driver.getTitle();
	
	System.out.println(title);
	
	
	driver.manage().window().maximize();
	
	
	
	driver.close();
	
	
}
}
