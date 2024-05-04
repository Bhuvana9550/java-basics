package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage extends Openbrowser{
	public void settings()
	{
		WebElement more=driver.findElement(By.xpath("//span[text()='More']//following-sibling::div"));
		more.click();
		
		WebElement settings=driver.findElement(By.xpath("//a[@data-testid='header-settings-link']/..//a[text()='Settings']"));
		settings.click();
	}
	
	

}
