package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Header_icons extends Settings_Page
{
	WebElement Search;
	public void topheadericons() {
		Search=driver.findElement(By.xpath("(//a[text()='Search'])[1]"));
		Search.click();
		WebElement Home=driver.findElement(By.xpath("//a[text()='Home'][1]"));
		Home.click();
		WebElement SavedSearches=driver.findElement(By.xpath("(//a[text()='Saved Searches'])[1]"));
		SavedSearches.click();
}
	public void MakeMOdel() {
		
		Search.click();
		driver.findElement(By.xpath("//span[text()='Select location']//following-sibling::span")).click();
	}
	}

	
