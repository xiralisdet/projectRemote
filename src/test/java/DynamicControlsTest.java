import Pages.DynamicControls;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class DynamicControlsTest extends SetUp {
    public DynamicControlsTest()
    {
        super();
    }
    DynamicControls dynamicControls;
    @BeforeMethod
    public void setup() throws IOException, InterruptedException {
        initialization();
        driver.get("http://172.105.7.220:7080/dynamic_controls");
        dynamicControls=new DynamicControls();
        Thread.sleep(2000);
    }
    @Test
    public void addRemoveEnableDisableButtons() throws InterruptedException {
       boolean isRemoved= dynamicControls.removeBtn();
        boolean isAdded=dynamicControls.addBtn();
        boolean isEnabled=dynamicControls.enableBtn();
        boolean isDisabled=dynamicControls.disableBtn();
        Assert.assertTrue(isRemoved);
        Assert.assertTrue(isAdded);
        Assert.assertTrue(isEnabled);
        Assert.assertTrue(isDisabled);
    }

@AfterMethod
    public void terminate()
{
    SetUp.teardown();
}




}
