package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class DragAndDrop extends SetUp {
    public DragAndDrop()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@id='column-a']")
    WebElement boxA;
    @FindBy(xpath= "//div[@id='column-b']")
    WebElement boxB;
    public boolean  dragAndDropBoxVerification()
    {
        boolean dragAndDropSuccessful =false;
        String A=boxA.getText();

        Actions actions=new Actions(driver);


        actions.dragAndDrop(boxA,boxB);
        String B=boxA.getText();
        if(A!=B)
        {
            dragAndDropSuccessful=true;
        }
        return dragAndDropSuccessful;
    }



}
