package dropdown;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sceenshot {

public static void main(String[]args) throws IOException	{
	
	System.setProperty("webdrive.chrome.driver", "D:\\my space\\chromedriver.exe");
	
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	driver.manage().window().maximize();
	
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest =new File("D:\\Screenshot\\image.png");
	FileHandler.copy(src,dest);
	
	
	
	
}
}
