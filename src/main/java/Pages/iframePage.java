package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.drawingml.x2006.main.CTEffectStyleItem;
import utilities.SetUp;

public class iframePage extends SetUp {
    String typing="i love coding";
    public iframePage()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "mce_0_ifr")
    WebElement ifId;
    @FindBy(xpath = "//body[@id='tinymce']/p")
    WebElement textMessage;

    public boolean verifyMessage()
    {
        boolean isSame=false;
        driver.switchTo().frame(ifId);
        textMessage.clear();
        textMessage.sendKeys(typing);
        if(textMessage.getText().equals(typing))
        {
            isSame=true;
        }
        return isSame;

    }

}
