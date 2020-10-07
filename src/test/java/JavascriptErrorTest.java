import Pages.JavascriptError;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class JavascriptErrorTest extends SetUp {
    public JavascriptErrorTest()
    {
        super();
    }
    JavascriptError javascriptError;

    @BeforeMethod
    public void setUp()
    {
        initialization();
        driver.get("http://172.105.7.220:7080/javascript_error");
        javascriptError=new JavascriptError();
    }
    @Test
    public void containsError()
    {
        boolean hasError=javascriptError.messageDisplayed();
        Assert.assertTrue(hasError);
    }
    @AfterMethod
    public void quit()
    {
        teardown();
    }
}
