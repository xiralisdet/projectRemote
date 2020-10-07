package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

import java.util.Iterator;
import java.util.Set;

public class OpenWindow extends SetUp
{
    public OpenWindow()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement clickLink;
    @FindBy(xpath = "//h3")
    WebElement newWindowMessage;

    public boolean isOpened()
    {
        boolean openedNew=false;
        clickLink.click();
        Set<String> handles=driver.getWindowHandles();
        Iterator ite=handles.iterator();

        while(ite.hasNext())
        {
        String last=    ite.next().toString();
           driver.switchTo().window(last);
           if(newWindowMessage.isDisplayed())
           {
               openedNew=true;
           }

        }
return openedNew;
    }
}
