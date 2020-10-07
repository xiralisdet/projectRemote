package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class ContextMenuPage extends SetUp{
   public  String message;

    public ContextMenuPage()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@id='hot-spot']")
    WebElement contextBox;
public void alertResolution()
{
    Actions actions =new Actions(driver);
    actions.contextClick(contextBox).build().perform();
    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Alert alert=driver.switchTo().alert();
     message=alert.getText();
    System.out.println(message);
    alert.accept();

    }

}





