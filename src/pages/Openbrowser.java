package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Openbrowser {
	 WebDriver driver;
		WebDriverWait wait;
	public void luanchbrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.autolist.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

}
