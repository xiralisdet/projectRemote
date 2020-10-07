package Pages;

import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class DynamicContentRefresh extends SetUp {
    public DynamicContentRefresh()
    {
        PageFactory.initElements(driver, this);
    }
    public boolean  checkContentChange()
    {
        boolean contentChanged;
        String before=driver.getPageSource();
        driver.navigate().refresh();

        String after=driver.getPageSource();
        driver.navigate().refresh();
        String secondRefresh=driver.getPageSource();
        if(before.equals(after)&before.equals(secondRefresh))
        {
            contentChanged=false;


        }
        contentChanged=true;
        return contentChanged;

    }

}
