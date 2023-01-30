package iframewait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
public static void main(String[]args) {
	
System.setProperty("webdriver.chrome.driver", "D:\\my space\\chromedriver.exe")	;
	
	//upcasting
	WebDriver driver=new ChromeDriver();
	
	//get url
	driver.get("https://www.facebook.com/signup");
	driver.manage().window().maximize();
	WebElement logo =driver.findElement(By.xpath("//img[@alt'Facebook']"));

	WebDriverWait w=new WebDriverWait(driver, 20);
	
	w.until(ExpectedConditions.visibilityOf(logo));
	 
	
}
}
