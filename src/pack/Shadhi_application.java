package pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Shadhi_application {
	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Shadhi_application s1=new Shadhi_application();
		s1.setup("https://shaadi.com");
	}
	public void setup(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public void register() { 
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div[text()='Woman']"));
		driver.findElement(By.xpath("//div[text()='Woman'and @aria-selected='true']")).click();
		driver.findElement(By.xpath("////div[contains(@class, 'ageFrom')]//div[contains(@class, 'is-selected')]")).click() ;
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[text()='25']")).click();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		driver.findElement(By.xpath("//div[@data-testid='preference_age_field']")).click();
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.xpath("//div[text(),'27']")).click();
		action.sendKeys(Keys.PAGE_UP).build().perform();
		
		 
	}
	}
