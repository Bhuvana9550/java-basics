package pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Microsoft_outlook {
	WebDriver driver;
	WebDriverWait wait;
	private static boolean result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Microsoft_outlook c1=new Microsoft_outlook();
		c1.setup("https://outlook.live.com/mail/about/index_en.html");
		c1.createAccount();
	}
	public void setup(String url) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	public void createAccount() {
		driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/div/div/a/span")).click();
		driver.findElement(By.name("MemberName")).sendKeys("yamini1522");
		driver.findElement(By.xpath("//div//input[@id='iSignupAction']")).click();
		driver.findElement(By.xpath("//div//input[@type='password']")).sendKeys("kby01052002");
		driver.findElement(By.xpath("//div//input[@id='iSignupAction']")).click();
		driver.findElement(By.xpath("//div//input[@name='FirstName']")).sendKeys("bhuvana");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@id='LastName']")));
		driver.findElement(By.xpath("//div/input[@id='LastName']")).sendKeys("yamini");
		driver.findElement(By.xpath("//div//input[@id='iSignupAction']")).click();
		new Select(driver.findElement(By.xpath("//select[@id='Country']"))).selectByValue("AU");
		new Select(driver.findElement(By.xpath("//select[@id='Country']"))).selectByVisibleText("India");
		new Select(driver.findElement(By.xpath("//select[@id='BirthMonth']"))).selectByValue("5");
		new Select(driver.findElement(By.xpath("//select[@id='BirthDay']"))).selectByValue("1");
		driver.findElement(By.xpath("//input[@id='BirthYear']")).sendKeys("2002");
		driver.findElement(By.xpath("//div//input[@id='iSignupAction']")).click();  
		if(result) {
			System.out.println("Test is passed");		
		}
		else {
			System.out.println("Test is failed");
		}
		
		
		

		
	}
	
}
