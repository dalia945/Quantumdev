

package controlWEbElementsExercise;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_Single  extends BaseTest{


@Test
public void ListBoxSelec() throws InterruptedException
{
 WebElement DropDownBox = driver.findElement(By.xpath("//select"));
 
Select DropDown = new Select(DropDownBox);
DropDown.isMultiple();
System.out.println("output is"+DropDown.isMultiple() );
//Assert.assertEquals(true, List.isMultiple());
//Assert.assertEquals("List is not Multiple", true, List.isMultiple());
DropDown.selectByIndex(2);
//DropDown.selectByValue("USA");
//DropDown.selectByVisibleText("Audi");
//Thread.sleep(3000);
//DropDown.deselectAll();
//DropDown.selectByValue("USA");
Thread.sleep(3000);

 
}

}

