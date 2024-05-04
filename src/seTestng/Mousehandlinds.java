package seTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Mousehandlinds {
	WebDriver driver;
	Actions action;
  @Test(priority=1)
  public void verifydragabble() {
	  driver.findElement(By.linkText("Draggable")).click();
	  driver.switchTo().frame(0);
	  driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
	  action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
	  action.moveByOffset(40,50).build().perform();
	  action.release().build().perform();
	  driver.switchTo().parentFrame();
  }
  @Test(priority=2)
  public void verifydroppable() { 
	  driver.findElement(By.linkText("Droppable")).click();
	  driver.switchTo().frame(0);
	  action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	  driver.switchTo().defaultContent();
  }
  @BeforeTest
  public void beforeTest() {     
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  action = new Actions(driver);

  }
 
  @AfterTest
  public void afterTest() {
  }

}
