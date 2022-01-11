package seleniumGridEx;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMlogin2_firefox {
	WebDriver driver;
	@BeforeTest

	public void LaunchApp() throws MalformedURLException
	{   
		
 
		String nodeURL = "http://10.1.10.111:5569/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities().firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		WebDriverManager.chromedriver().setup();
		 driver= new RemoteWebDriver(new URL(nodeURL), cap);
//		driver.get("https://www.facebook.com/");
		System.out.println("opening the app");
	}
		
	@AfterTest
	public void CloseApp()
	{

	   driver.close();
		System.out.println("closed the app");
	}
	@Test
	public void Login() throws InterruptedException
	{
		
		driver.get("https://www.facebook.com/");https://www.facebook.com/friends/
			Thread.sleep(5000);
		driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("priyanataraj004@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("Kimjiwon@1");
		Thread.sleep(5000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		System.out.println("loged in to the app");
	}

}
