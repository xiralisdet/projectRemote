package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;



public class LoginPage extends SetUp {

@FindBy(xpath = "//input[@id='username']")
WebElement name;
@FindBy(name= "password")
WebElement password;
@FindBy(xpath = "//button[@type='submit']")
WebElement loginBtn;
@FindBy(css = "#flash")
WebElement invalidMessage;
SecureAreaPage secureAreaPage=new SecureAreaPage();

public LoginPage()
{
    PageFactory.initElements(driver, this);
    System.out.println(driver);
}
public boolean loginSuccessful()
{

    boolean loggedSuccess=false;
    name.sendKeys("tomsmith");
  password.sendKeys("SuperSecretPassword!");
    loginBtn.click();
    if(secureAreaPage.isLoggedIn())
    {
        loggedSuccess=true;
    }
    return loggedSuccess;
}

    public boolean loginFailed()
    {

        boolean loggedSuccess=true;
        name.sendKeys("tomsmith");
        password.sendKeys("SuperSecret");
        loginBtn.click();
        if(invalidMessage.isDisplayed())
        {
            loggedSuccess=false;
        }
        return loggedSuccess;
    }


}
