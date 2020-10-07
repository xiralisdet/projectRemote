package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

import java.awt.*;

public class FloatingMenu extends SetUp {
    public FloatingMenu()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='#home']")
    WebElement homeLink;
    public boolean floatMenuVerify() throws InterruptedException {
        boolean floatLink=false;
        int beforeHight=homeLink.getLocation().y;
        System.out.println(beforeHight);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("scroll(0,1500)");
        Thread.sleep(2000);
        int afterHeight=homeLink.getLocation().y;
        System.out.println(afterHeight);
       if(afterHeight>beforeHight)
       {
            floatLink=true;
        }
        return floatLink;

    }
}
