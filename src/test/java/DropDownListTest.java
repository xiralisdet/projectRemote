import Pages.DropDownList;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class DropDownListTest extends SetUp {
public DropDownListTest()
{
    super();
}
DropDownList dropDownList;
@BeforeMethod
    public void browserSet() throws IOException {
    initialization();
    driver.get("http://172.105.7.220:7080/dropdown");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    dropDownList=new DropDownList();
}
@Test(priority =1)
    public void dropDownTest() throws InterruptedException {
        boolean selected= dropDownList.selectOption1();
    boolean selected1=dropDownList.selectOption2();
        Assert.assertTrue(selected);
    Assert.assertTrue(selected1);
    }


@AfterTest
public void close()
{
    SetUp.teardown();
}
}
