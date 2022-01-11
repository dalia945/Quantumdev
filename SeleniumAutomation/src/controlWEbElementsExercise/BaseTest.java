package controlWEbElementsExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
@BeforeClass
public void SetUp()
{
 WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.get("https://only-testing-blog.blogspot.com/2013/11/new-test.html");
	}
@AfterClass
public void TearDown() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}}