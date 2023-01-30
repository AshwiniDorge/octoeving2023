package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox1 {

	public static void main (String[]args) {
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
	//upcasting
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	
	// 1.locate the listbox or dropdown
	
	WebElement country =driver.findElement(By.xpath("//select[@mane='country'"));
	
	//2.creat object of select class
	
	Select s= new Select(country);
	// s.selectByVisibleText("INDIA");
	
	//s.selectByValue("INDIA");
	s.selectByIndex(20);
	
	}	
}
