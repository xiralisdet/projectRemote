import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.SetUp;

import java.io.IOException;

public class LoginFailTest extends SetUp {

    LoginPage loginPage;

    public LoginFailTest()
    {
        super();
    }
   @BeforeMethod
   public void setUpBrowser() throws IOException {
       SetUp.initialization();
       loginPage=new LoginPage();
   }
@Test
        public void failedTest()
       {
           boolean fail=loginPage.loginFailed();

           Assert.assertFalse(fail);

       }
       @AfterMethod
    public static void teardown()
       {
           SetUp.teardown();
       }





}
