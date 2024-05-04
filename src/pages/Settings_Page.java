package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Settings_Page extends Homepage
{
	public void settingspage() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='… or I already have an account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-action='email-create-account']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		driver.findElement(By.id("email")).sendKeys("kbhuvanayamini@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kby01052002");
		driver.findElement(By.xpath("//button[@data-submit-action='log-in']")).click(); 
		
	}

}
