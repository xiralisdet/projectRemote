import Pages.FloatingMenu;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class FloatMenuTest extends SetUp {
    public  FloatMenuTest()
    {
        super();
    }
    FloatingMenu floatingMenu;
    @BeforeMethod
    public void startBrowser() throws InterruptedException {
        initialization();
        driver.get("http://172.105.7.220:7080/floating_menu");
        floatingMenu=new FloatingMenu();
    }
    @Test
    public void testFloat() throws InterruptedException {
        boolean floatResult= floatingMenu.floatMenuVerify();
        Assert.assertTrue(floatResult);
    }
     @AfterMethod
    public void terminate()
     {
         SetUp.teardown();
     }
}
