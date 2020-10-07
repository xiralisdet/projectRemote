import Pages.ContextMenuPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class ContextClickTest extends SetUp {

    public ContextClickTest()
    {
        super();
    }
    ContextMenuPage contextMenuPage;
@BeforeMethod
    public void browserSetUp() throws IOException {
    SetUp.initialization();
    driver.get("http://172.105.7.220:7080/context_menu");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    contextMenuPage=new ContextMenuPage();
}
@Test
    public void verificationOfAlert()
{
   contextMenuPage.alertResolution();
    Assert.assertTrue(contextMenuPage.message.contains("You selected a context menu"));
}
@AfterMethod
    public static void teardown()
{
    SetUp.teardown();
}

}
