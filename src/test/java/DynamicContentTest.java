import Pages.DynamicContentRefresh;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class DynamicContentTest  extends SetUp {
    public DynamicContentTest()
    {
        super();
    }
    DynamicContentRefresh dynamicContentRefresh;
    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        driver.get("http://172.105.7.220:7080/dynamic_content?with_content=static");
        dynamicContentRefresh=new DynamicContentRefresh();
    }
    @Test
    public void dynamicTest()
    {
        boolean dynamicResult=dynamicContentRefresh.checkContentChange();
        Assert.assertTrue(dynamicResult);
    }
@AfterMethod
    public void tear()
{
    SetUp.teardown();
}

}
