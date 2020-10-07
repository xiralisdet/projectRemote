import Pages.iframePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class IframeTest extends SetUp
{
    public IframeTest()
    {
        super();
    }
    Pages.iframePage iframePage;
    @BeforeMethod
    public void setUp()
    {
        initialization();
        driver.get("http://172.105.7.220:7080/iframe");
        iframePage=new iframePage();
    }
    @Test
    public void verificationMessageTest()
    {
        boolean result=iframePage.verifyMessage();
        Assert.assertTrue(result);
    }
    @AfterMethod
    public void quit()
    {
        teardown();
    }



}
