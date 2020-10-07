package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

import java.util.List;

public class CheckBoxPage extends SetUp {
public CheckBoxPage()
{
    PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@type='checkbox'][1]")
WebElement checkbox1;
@FindBy(xpath = "//input[@type='checkbox'][2]")
WebElement checkbox2;

public boolean  checkBoxClicking()
{
    boolean box1checked=false;
    checkbox1.click();
    if(checkbox1.getAttribute("checked")!=null)
    {
      box1checked=true;
    }
    return box1checked;

}

    public boolean  checkBoxUnchecking()
    {

        boolean box2unchecked=false;
        checkbox2.click();
        if(checkbox2.getAttribute("checked")==null)
        {
            box2unchecked=true;
        }
        return box2unchecked;
    }


}
