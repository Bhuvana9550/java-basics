package seTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DatadrivenTest {
	WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.get("https://practice.expandtesting.com/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  }

  @Test
  public void afterTestTest() throws IOException {
    File f1=new File("C:\\Users\\bhuva\\OneDrive\\created documents\\automation.xlsx");
    FileInputStream file=new  FileInputStream(f1);
    XSSFWorkbook wb =new XSSFWorkbook(file);
    Sheet sheet= wb.getSheetAt(0);
    int row=sheet.getPhysicalNumberOfRows();
    System.out.println(row);
    
   for(int i =0; i < row; i++) {
    	String col= sheet.getRow(i).getCell(0).getStringCellValue();
    	String col1= sheet.getRow(i).getCell(1).getStringCellValue();
    	System.out.println(col);
    	System.out.println(col1);
    	
    	driver.findElement(By.id("username")).sendKeys(col);
    	driver.findElement(By.id("password")).sendKeys(col1);
    	driver.findElement(By.xpath("//button[text()='Login']")).click(); 
    	
    	
    	}
    
  }
    
  }
