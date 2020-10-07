import Pages.DynamicLoadPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class DynamicLoadPageTest extends SetUp {
    DynamicLoadPage dynamicLoadPage;
    public DynamicLoadPageTest()
    {
        super();
    }
    @BeforeMethod
    public void startBrowser() throws IOException {
        initialization();
        driver.get("http://172.105.7.220:7080/dynamic_loading/2");
        dynamicLoadPage =new DynamicLoadPage();
    }
    @Test
    public void verifyRenderedElement()
    {
        boolean isSuccessful=dynamicLoadPage.verifyLoadPageMessage();
        Assert.assertTrue(isSuccessful);
    }
}
