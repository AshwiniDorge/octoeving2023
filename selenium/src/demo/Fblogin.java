package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main (String[]args) throws EncryptedDocumentException, IOException {
	
		System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
ChromeDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com");
	FileInputStream File =new FileInputStream("C:\\Users\\Dell\\Desktop\\my excel.xlsx");
	
	
	Sheet sh =WorkbookFactory.create(File).getSheet("Sheet1");
		
		String USN  = sh.getRow(0).getCell(0).getStringCellValue();
		String paswrd  = sh.getRow(1).getCell(0).getStringCellValue();
		System.out.println(USN);
		System.out.println(paswrd);
		
		
		
	
	//locate webElement
	
	WebElement uname =driver.findElement(By.xpath("//input[@name='email']"));
	
	WebElement pasword =driver.findElement(By.xpath("//input[@id='email']"));
	
	WebElement login =driver.findElement(By.xpath("//button[@value='1']"));
	
	
	
	//sendkey
	
	uname.sendKeys("9168260575");
	pasword.sendKeys("Ashwini@123");
	login.click();
	
	
	}
	}
	

