package seTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Findelements {
	WebDriver driver;
	Actions action;
	
  @Test
  public void verifyTotalLinks() {
	  List<WebElement> links=driver.findElements(By.tagName("a"));
	  int linksCount = links.size();
	  System.out.println("Total LInks Count: "+linksCount);
  }
  @Test(priority=2)
  public void verityFooterLinks() {
	  WebElement footersection = driver.findElement(By.id("glbfooter"));
	  int footerLinkscount = footersection.findElements(By.tagName("a")).size();
	  System.out.println("Total Footer Links Count: "+footerLinkscount);
  }
  @Test(priority=3)
  public void verifyFooterSectionColumnLinks() {
	  WebElement colSection =driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
	  List<WebElement> colsecList= colSection.findElements(By.tagName("a"));
	  int colSeclinksCount = colsecList.size();
	 for(int i=0; i < colSeclinksCount;i++) {
	  String text = colsecList.get(i).getText();
		  System.out.println(text);
	 }
	 System.out.println("********************");
	 for(WebElement ele : colsecList) {
		System.out.println(ele.getText());
    	if(ele.getText().equals("Developers")) {
			ele.click();
		}
	 }
	 boolean result = driver.findElement(By.xpath("//img[@class='logo']")).isDisplayed();
	 String url = driver.getCurrentUrl();
	 System.out.println("URL: "+url);
	 String title = driver.getTitle();
	 System.out.println("Title: "+title);
	 if(result && url.contains("developer") && title.contains("Developers")) {
		 System.out.println("Developers page displayed successfullyy");
	 }
	 else {
		 System.out.println("Failed to display Developers pagge");
	 }
  }
  @BeforeTest
  public void beforeTest() { 
	  driver = new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  action= new Actions(driver);
	  }

  @AfterTest
  public void afterTest() {
  }

}
