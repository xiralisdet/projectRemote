import Pages.FileDownload;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.File;
import java.io.IOException;

public class DownloadTest extends SetUp {
FileDownload fileDownload;
    public DownloadTest()
    {
        super();
    }
    @BeforeMethod
    public void setUp() throws IOException {
        initializationForDownload();

        fileDownload=new FileDownload();
    }
    @Test
    public void downloadFile() throws InterruptedException {
        driver.get("http://172.105.7.220:7080/download");
        fileDownload.setDownload();
        Thread.sleep(3000);
        File listFiles[]=folder.listFiles();
        Assert.assertTrue(listFiles.length>0);
    }
    @AfterMethod
    public void quit()
    {
       SetUp.teardown();
        for(File file:folder.listFiles() )
       {
            file.delete();
        }
       folder.delete();
    }

}
