package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Amazon_actionbuiltoperform extends Baseclass {


@Test(priority = 1)
public void MovetoMouseoverClick() throws InterruptedException
{

	WebElement Signin= driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[2]"));
	Actions act = new Actions(driver);
	act.moveToElement(Signin).perform();
	//click().build().perform();
	Thread.sleep(2000);
	WebElement whishlist = driver.findElement(By.xpath("//span[contains(text(),'Create a List')]"));
    act.moveToElement(whishlist).moveToElement(whishlist).click().build().perform();
//	whishlist.click();
    Thread.sleep(3000);
    WebElement mylist = driver.findElement(By.id("my-lists-tab"));
    String Title =  mylist.getText();
    System.out.println("Title is:"+ Title);
    Assert.assertEquals(Title, "Your Lists");
    driver.navigate().back();
    WebElement Deals = driver.findElement(By.xpath("//img[@alt='Deals & Promotions']"));
	   act.moveToElement(Deals).click().build().perform();
	   Thread.sleep(2000);
	   String Title1 =  driver.getTitle();
	    System.out.println("Title is:"+ Title1);
	    Assert.assertEquals(Title1, "Amazon.com - Epic Daily Deals");
	    Assert.assertTrue(true, "validation failed");
	    driver.navigate().back();
	    Thread.sleep(2000);
	    WebElement Electronics = driver.findElement(By.xpath("//img[@alt='Electronic Gifts']"));
		act.moveToElement(Electronics).click().build().perform();
		Thread.sleep(2000);
		String Title2 =  driver.getTitle();
		System.out.println("Title is:"+ Title2);
	    Assert.assertEquals(Title2, "Amazon.com: Electronics Gift Guide");
	    Assert.assertTrue(true, "validation failed");
	    
	    
   
}
 @Test(priority = 2)
 public void Deals() throws InterruptedException{
// driver.get("https://www.amazon.com/");
	 driver.navigate().back();
	 Actions act = new Actions(driver);
	 WebElement Deals = driver.findElement(By.xpath("//img[@alt='Deals & Promotions']"));
	   act.moveToElement(Deals).click().build().perform();
	   Thread.sleep(2000);
	   String Title =  driver.getTitle();
	    System.out.println("Title is:"+ Title);
	    Assert.assertEquals(Title, "Amazon.com - Epic Daily Deals");
	    Assert.assertTrue(Title.contains("Epic"));
	   
 }
	 
 }

