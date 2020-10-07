import Pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class CheckBoxTest  extends SetUp {
    CheckBoxPage checkBoxPage;
    public CheckBoxTest()
    {
        super();
    }
    @BeforeMethod
    public void setUpBrowser()
    {
            initialization();
        driver.get("http://172.105.7.220:7080/checkboxes");
        checkBoxPage=new CheckBoxPage();
    }
    @Test
    public void verifyingCheckBoxsClicking()
    {
        boolean box1clicked=checkBoxPage.checkBoxClicking();
        boolean box2Unchecked=checkBoxPage.checkBoxUnchecking();
        Assert.assertTrue(box1clicked);
        Assert.assertTrue(box2Unchecked);
    }

@AfterMethod
    public static void teardown()
{
    SetUp.teardown();
}

}
