package iframewait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumwait {

	public static void main (String[]args) {
	
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe" );
	
	//upcasting
	
	WebDriver driver=new ChromeDriver();
	
	//get url
	
	driver.get("https://demo.guru99.com/");
	
	//ipmlicit wait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
