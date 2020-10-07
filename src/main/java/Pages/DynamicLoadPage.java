package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

import java.util.Set;

public class DynamicLoadPage extends SetUp {
    public DynamicLoadPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button")
    WebElement startBtn;
    @FindBy(xpath = "//div[@id='finish']/h4")
    WebElement result;


    public boolean verifyLoadPageMessage()
    {
        boolean isMessageDisplayed=false;
        startBtn.click();
        wait(result,driver);
        if(result.isDisplayed())
      {
          isMessageDisplayed=true;
      }
        return isMessageDisplayed;

      //Set<String> handles=driver.getWindowHandles();
      //String lastHandle=handles.iterator().next();
      //driver.switchTo().window(lastHandle);
    }
}
