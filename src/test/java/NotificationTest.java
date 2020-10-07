import Pages.NotificationMessage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class NotificationTest extends SetUp
{
    public NotificationTest()
    {
        super();
    }
    NotificationMessage notificationMessage;
    @BeforeMethod
    public void setUp()
    {
        initialization();
        driver.get("http://172.105.7.220:7080/notification_message_rendered");
        notificationMessage=new NotificationMessage();
    }
    @Test
    public void verifyNotificationMessage()
    {
        boolean isSuccessful=notificationMessage.verifyMessage();
        Assert.assertTrue(isSuccessful);
    }
    @AfterMethod
    public void close()
    {
        teardown();
    }
}
