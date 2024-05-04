 package pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_createnew_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("firstname")).sendKeys("bhuvana");
		
		driver.findElement(By.name("lastname")).sendKeys("kore");
		driver.findElement(By.name("reg_email__")).sendKeys("9550764359");
		driver.findElement(By.id("password_step_input")).sendKeys("bhuvana@123");
		driver.findElement(By.id("day")).sendKeys("1");
		driver.findElement(By.id("month")).sendKeys("may");
		driver.findElement(By.id("year")).sendKeys("2002");
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();

	}

}
