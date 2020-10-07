import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class LoginTest extends SetUp {
    LoginPage loginPage;
    public LoginTest()
    {
        super();
    }

@BeforeMethod
public void setUpBrowser() throws IOException {
    SetUp.initialization();
    driver.get("http://172.105.7.220:7080/login");
    loginPage=new LoginPage();
}
    @Test
public void loginTest()
    {

       boolean success= loginPage.loginSuccessful();
        Assert.assertTrue(success);
    }

@AfterMethod
public static void teardown()
{
    SetUp.teardown();
}

}
