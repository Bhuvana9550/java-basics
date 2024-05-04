package pack;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Autolist {
	WebDriver driver;
	WebDriverWait wait;
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Autolist c1= new Autolist();
		c1.setup("https://www.autolist.com/");
		c1.createAccount() ;
	}
	public void setup(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void createAccount() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='More']//following-sibling::div")).click();
		driver.findElement(By.xpath("//a[@data-testid='header-settings-link']/..//a[text()='Settings']")).click();
		driver.findElement(By.xpath("//a[text()='… or I already have an account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-action='email-create-account']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("kbhuvanayamini@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kby01052002");
		driver.findElement(By.xpath("//button[@data-submit-action='log-in']")).click(); 
		driver.findElement(By.xpath("//li//a[text()='Search']//following-sibling::div")).click();
		}

}
