package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class SecureAreaPage extends SetUp {
    @FindBy(id = "flash-messages")
    WebElement loginSuccessfulMessage ;
public SecureAreaPage()
{
    PageFactory.initElements(driver,this);
}

public boolean isLoggedIn()
{
    boolean loginStats=false;
    if(loginSuccessfulMessage.isDisplayed())
    {
        loginStats=true;
    }
    return loginStats;

}


}
