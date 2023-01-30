package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class Loginandscreenshot {

	public static void main (String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream File =new FileInputStream("C:\\Users\\Dell\\Desktop\\my excel.xlsx");
	
	Sheet sh =WorkbookFactory.create(File).getSheet("Sheet1");
	String USN=sh.getRow(0).getCell(0).getStringCellValue();
	String pasword=sh.getRow(0).getCell(0).getStringCellValue();
	
	System.getProperty("webdriver.chrome.driver, \"D:\\my space\\chromedriver.exe");
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	//locate webelement
	
	WebElement user =driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password =driver.findElement(By.xpath("//input[@id='passContainer']"));
	WebElement login =driver.findElement(By.xpath("//button[@value='1']"));
	
	//send key
	 user.sendKeys(USN);
	password.sendKeys(pasword);
	
	login.click();
	Thread.sleep(5000);
	
	File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("\"D:\\painting\\fb123");
	
	
	FileHandler.copy(source, dest);
	

	WebElement accont = null;
	accont.click();
	
	Thread.sleep(5000);
	WebElement logout =driver.findElement(By.xpath("//span[text()='Log Out']"));
	
	
	
	logout.click();
	Thread.sleep(5000);
	
	driver.close();
	
	
	
	

	
	
	}	
}
