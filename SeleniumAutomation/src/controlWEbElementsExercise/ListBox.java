

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

public class ListBox  extends BaseTest{


@Test
public void ListBoxSelec() throws InterruptedException
{
 WebElement ListBox = driver.findElement(By.xpath("//select[contains(@name,'From')]"));
 
Select List = new Select(ListBox);
List.isMultiple();
Assert.assertEquals(true, List.isMultiple());
Assert.assertEquals("List is not Multiple", true, List.isMultiple());
List.selectByIndex(1);
List.selectByValue("Japan");
List.selectByVisibleText("Mexico");
Thread.sleep(3000);
List.deselectAll();
List.selectByValue("Japan");
Thread.sleep(3000);

 
}

}
