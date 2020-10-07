import Pages.JavaScriptAlert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class JavaScriptAlertTest extends SetUp {
    public JavaScriptAlertTest()
    {
        super();
    }
   JavaScriptAlert javaScriptAlert;

    @BeforeMethod
    public void setup()
    {
        initialization();
        driver.get("http://172.105.7.220:7080/javascript_alerts");
        javaScriptAlert=new JavaScriptAlert();
    }
    @Test
    public void verificationAlerts()
    {
        boolean jsClick=javaScriptAlert.clickJsAlert();
        boolean jsConfirmed=javaScriptAlert.confirmClickJsAlert();
        boolean jsPromptHandled=javaScriptAlert.ClickJsPrompt();
        Assert.assertTrue(jsClick);
        Assert.assertTrue(jsConfirmed);
        Assert.assertTrue(jsPromptHandled);
    }
    @AfterMethod
    public void TearDown()
    {
        teardown();
    }


}
