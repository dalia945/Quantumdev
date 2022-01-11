package controlWEbElementsExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox_RadioButton extends BaseTest {
	
@Test
public void InputBoxInput() throws InterruptedException
{
 WebElement CheckBox = driver.findElement(By.xpath("//input[contains(@type,'check')]"));
 CheckBox.click();
 WebElement RadioBtn = driver.findElement(By.xpath("//input[contains(@value,'fem')]"));
 RadioBtn.click();
 driver.getTitle();
 String Title = driver.getTitle();
 System.out.println(" Title is:" + Title);
 }
}
