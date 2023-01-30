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

public class Fblogin2 {

public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {	

FileInputStream File =new FileInputStream("C:\\Users\\Dell\\Desktop\\my excel.xlsx");
	Sheet sh =WorkbookFactory.create(File).getSheet("Sheet1");
		String USN  = sh.getRow(0).getCell(0).getStringCellValue();
		String paswrd  = sh.getRow(1).getCell(0).getStringCellValue();
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
		//send key
	 uname.sendKeys(USN);
		pasword.sendKeys(paswrd);
	login.click();
		Thread.sleep(5000);
WebElement accont =driver.findElement(By.xpath("(//div[@class='x1rg5ohu x1n2onr6 x3ajldb x1ja2u2z'])[1]"));
		accont.click();
		Thread.sleep(5000);
		WebElement logout =driver.findElement(By.xpath("//span[text()='Log Out']"));
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("\"D:\\painting\\fb123");
		FileHandler.copy(source, dest);
		logout.click();
		Thread.sleep(5000);
		driver.close();
		
		
	
}	
}
