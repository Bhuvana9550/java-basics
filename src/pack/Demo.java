package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.microsoft.com/en-us/microsoft-365/outlook/log-in");
		driver.manage().window().maximize();
	    driver.findElement(By.id("MemberName")).sendKeys("bhuvana1522@outlook.com");
		driver.findElement(By.name("Password")).sendKeys("kby01052002");
		driver.findElement(By.name("login")).click();
	}
}
