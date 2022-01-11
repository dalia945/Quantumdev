package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragnDrop {
	WebDriver driver;
@BeforeTest
public void SetUp()
{
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	}

@Test
public void DragDrop() throws InterruptedException
{
//	Thread.sleep(3000);
//	driver.switchTo().frame(3);
	String txt= driver.findElement(By.xpath("//div[@class=' sixteen columns']")).getText();
	System.out.println("text is:"+ txt);
	WebElement frame= driver.findElement(By.xpath("(//iframe['@width=70'])[4]"));
	driver.switchTo().frame(frame);
	WebElement Source =driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	WebElement Dest =driver.findElement(By.cssSelector("#trash"));
	Actions act = new Actions(driver);
	act.dragAndDrop(Source, Dest).perform();
}
@AfterTest
public void TearDown() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}}
