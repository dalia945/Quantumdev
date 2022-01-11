package controlWEbElementsExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBox extends BaseTest{


@Test
public void InputBoxInput()
{
 WebElement InputBox = driver.findElement(By.xpath("//input[contains(@name,'fname')]"));
 InputBox.sendKeys("Priya");
 
}

}