package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.SetUp;

import java.util.List;

public class HoverPage extends SetUp {

    public  boolean testingHovers()
    {
        boolean isHovered=false;
        List<WebElement> pics=driver.findElements(By.xpath("//div[@class='figure']/img"));

        for(int i=0;i<pics.size();i++)
        {
            Actions actions=new Actions(driver);
            actions.moveToElement(pics.get(i)).build().perform();
            List  <WebElement> link=driver.findElements(By.xpath("//div[@class='figure']/img/parent::div[@class='figure']//a"));
            for(int j =0;j<link.size();j++ )
            {
                if(link.get(j).isDisplayed())
                {
                    isHovered=true;
                }
            }
        }
        return isHovered;

    }

}
