import Pages.DragAndDrop;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class DragAndDropTest extends SetUp {
    DragAndDrop dragAndDrop;
    public DragAndDropTest()
    {
        super();
    }
    @BeforeMethod
    public void browserSetUp() throws IOException {
        initialization();
        driver.get("http://172.105.7.220:7080/drag_and_drop");
        dragAndDrop=new DragAndDrop();
    }
    @Test
    public void DragAndDrop(){
        boolean dragAndDropResult=dragAndDrop.dragAndDropBoxVerification();
        Assert.assertTrue(dragAndDropResult);
    }
    @AfterTest
    public void terminate()
    {
        SetUp.teardown();
    }

}
