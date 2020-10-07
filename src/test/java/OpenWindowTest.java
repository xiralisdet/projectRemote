import Pages.OpenWindow;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class OpenWindowTest extends SetUp {

    public OpenWindowTest()
    {
        super();
    }
    OpenWindow openWindow;

    @BeforeMethod
    public void setUp()
    {
        initialization();
        driver.get("http://172.105.7.220:7080/windows");
        openWindow=new OpenWindow();
    }

    @Test
    public void openNewWindowVerify()
    {
        boolean isOpened=openWindow.isOpened();
        Assert.assertTrue(isOpened);
    }

    @AfterMethod
    public void quit()
    {
        teardown();
    }
}
