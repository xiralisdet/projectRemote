import Pages.FileDownload;
import Pages.FileUpload;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

public class UploadFileTest extends SetUp {
    FileUpload fileUpload;
    public UploadFileTest()
    {
        super();

    }
    @BeforeMethod
    public void setup()
    {
        initialization();
        driver.get("http://172.105.7.220:7080/upload");
        fileUpload=new FileUpload();
    }
    @Test
    public void verifyUploadFile()
    {
        boolean isVerify=fileUpload.uploadVerification();
        Assert.assertTrue(isVerify);
    }
    @AfterMethod
    public void tear()
    {
        SetUp.teardown();
    }

}
