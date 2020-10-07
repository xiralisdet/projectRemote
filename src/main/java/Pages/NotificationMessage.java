package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class NotificationMessage extends SetUp
{
    public NotificationMessage()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p/a")
    WebElement clickLink;
    @FindBy(id = "flash")
    WebElement message;
    public boolean verifyMessage()
    {
        boolean isDisplayed=false;
        clickLink.click();
        String notification=message.getText();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickLink.click();
        SetUp.wait(message, driver);
        String notification1=message.getText();
        if((notification.contains("Action successful")||notification.contains("Action unsuccesful, please try again")) ||
                (notification1.contains("Action successful") ||  (notification1.contains("Action unsuccesful, please try again"))))
        {
            isDisplayed=true;
        }
        return isDisplayed;
    }





}
