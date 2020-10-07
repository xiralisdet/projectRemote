package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class JavascriptError extends SetUp
{
    public JavascriptError()
    {
        PageFactory.initElements(driver, this);
    }

@FindBy(xpath = "//p")
WebElement Message;
    public boolean messageDisplayed()
    {
        boolean isDisplayed=false;
        if(Message.isDisplayed())
        {
            isDisplayed=true;
        }
            return isDisplayed;
    }






}
