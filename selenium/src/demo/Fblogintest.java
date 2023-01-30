package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fblogintest {

public static void main (String []arg	) throws EncryptedDocumentException, IOException{
	
	FileInputStream  File =new FileInputStream ("C:\\Users\\Dell\\Desktop\\my excel.xlsx");
	
	Sheet sh =(Sheet) WorkbookFactory.create(File).getSheet("Sheet1");
	
	String USN  = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(0).getCell(0).getStringCellValue();
	String paswrd  = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(1).getCell(0).getStringCellValue();
	System.out.println(USN);
	System.out.println(paswrd);

	System.setProperty("webdriver.chrome.driver", "D:\\my space\\chromedriver.exe")	;
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	//locate webElement
	
		WebElement uname =driver.findElement(By.xpath("//input[@type='text']"));
		
		WebElement pasword =driver.findElement(By.xpath("//input[@type='password']"));
		
		WebElement login =driver.findElement(By.xpath("//button[@value='1']"));
		
	
	
	
	
	
	
	
	
}	
	
}
