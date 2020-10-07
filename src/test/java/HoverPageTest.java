import Pages.HoverPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.util.List;

public class HoverPageTest extends SetUp {
    HoverPage hoverPage;

@BeforeMethod
    public void setUp()
{
    initialization();
    driver.get("http://172.105.7.220:7080/hovers");
     hoverPage=new HoverPage();
}
@Test
    public void verifyHovering()
{
    boolean result=hoverPage.testingHovers();
    Assert.assertTrue(result);
}



}
