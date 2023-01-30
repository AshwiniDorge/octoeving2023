package dropdown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Testlogin {
public static void main(String[]args) throws EncryptedDocumentException, IOException {
	
	System.setProperty("webdriver.chrome.driver","D:\\my space\\chromedriver.exe");
	FileInputStream file=new FileInputStream("C:\\Users\\Dell\\Desktop\\my excel.xlsx");
	
	Sheet sh =WorkbookFactory.create(file).getSheet("sheet1");
	
	String USN =sh.getRow(0).getCell(0).getStringCellValue();
	
	
	System.out.println(USN);
	
	
	
	
	
	
	
}	
	
}
