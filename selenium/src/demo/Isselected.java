package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[]args) {
	
	//launch
	
	System.setProperty("webdriver.chrome.driver", "D:\\my space\\chromedriver.exe");
	
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com/signup");
	
	driver.manage().window().maximize();
	//locate female
	WebElement female =driver.findElement(By.xpath("//input[@value='1']"));
	
	//locate male
	WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
	//click on female webelement
	female.click();
	
	//isselected for female
	
	boolean res=female.isSelected();
	
	if (res==true) {
		
		System.out.println("female is selected");
		
		
		
	}
	else
		System.out.println();
	
	
	//is selected for male 
	
	boolean res1=male.isSelected();
	
	if (res1==true) {
	
		System.out.println("male is slected");
		
	}
	
	else
		System.out.println("male is not selected");
	
	}	
}
