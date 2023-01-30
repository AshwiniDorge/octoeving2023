package dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot2 {
public static void main (String []args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
	//upcasting
	
	WebDriver driver=new ChromeDriver();
	
	//give url
	
	driver.get("https://www.facebook.com/");
	
	//maximize
	
	driver.manage().window().maximize();
	
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("\"D:\\Ashwini1\\fb.png");
	FileHandler.copy(source,dest);
	
	
	
	
	
	
	
	
}
}