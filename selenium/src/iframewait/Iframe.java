package iframewait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
public static void main(String[]args) {
	
	System.setProperty("webdriver.chrome.driver","D\\my space\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.guru99.com/test/delete_customer.php");

	driver.manage().window().maximize();
	
	WebElement title =driver.findElement(By.xpath("/div[@id='post-2632']"));
	
	String t=title.getText();
	System.out.println(t);
	
	//switch to frame 1
	
	driver.switchTo().frame("//div[@class='panel-content fade']");
	
	driver.switchTo().defaultContent();
	
	
	
	
	
	
	
	
}	
}
