package controlWEbElementsExercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertHandling extends BaseTest{


@Test
public void alert() throws InterruptedException
{
 driver.manage().window().maximize();
 driver.findElement(By.xpath("//button[contains(@onclick,'Func')]")).click();
 Alert alert= driver.switchTo().alert();
 String alertMsg = alert.getText();
 System.out.println("Alet Msg is:"+alertMsg);
 Thread.sleep(3000);
// alert.accept();
 alert.dismiss();
 Thread.sleep(3000);

 driver.findElement(By.xpath("//input[contains(@onclick,'myF')]")).click();
 Alert alert1= driver.switchTo().alert();
 String alertMsg1 = driver.switchTo().alert().getText();
 System.out.println("Alet Msg is:"+alertMsg1);
 Thread.sleep(3000);
 alert.accept();
 String alertTxt = driver.findElement(By.cssSelector("#demo")).getText();
Assert.assertEquals(false, false);
// alert.dismiss();
 Thread.sleep(3000);
 
 driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
 Alert alert3= driver.switchTo().alert();
 String alertMsg3 = driver.switchTo().alert().getText();
 System.out.println("Alet Msg is:"+alertMsg3);
 Thread.sleep(3000);
 alert.accept();
// alert.dismiss();
 Thread.sleep(3000);
 
 
}

}

