package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login1 {
public static void main (String[]args) throws EncryptedDocumentException, IOException   {
	
	FileInputStream File =new FileInputStream("C:\\Users\\Dell\\Desktop\\my excel.xlsx");
	
	
Sheet sh =WorkbookFactory.create(File).getSheet("Sheet1");
	
	String USN  = sh.getRow(0).getCell(0).getStringCellValue();
	String paswrd  = sh.getRow(1).getCell(0).getStringCellValue();
	System.out.println(USN);
	System.out.println(paswrd);
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	
	
	
	
	
}
}
