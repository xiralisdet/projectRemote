package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public  class SetUp {
   public  static  WebDriver driver;
   public static File folder;
public static void initializationForDownload() throws IOException {
    folder=new File(UUID.randomUUID().toString());
    folder.mkdir();

    System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
    ChromeOptions chromeOptions=new ChromeOptions();
    Map<String, Object> prefs=new HashMap<String, Object>();
    prefs.put("profile.default_content_settings.popups",0);
    prefs.put("download.default_directory",folder.getAbsolutePath());
    chromeOptions.setExperimentalOption("prefs",prefs);
    DesiredCapabilities cap=DesiredCapabilities.chrome();
    cap.setCapability(ChromeOptions.CAPABILITY,chromeOptions);
    driver=new ChromeDriver(cap);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
}
public static void initialization()
{
    System.setProperty("webdriver.chrome.driver", "C://webdriver//chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
}


    public static void teardown()
    {
        driver.close();
        driver.quit();
    }
    public static void wait(WebElement element, WebDriver driver)
    {
        WebDriverWait webDriverWait=new WebDriverWait(driver, 30);
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
    }



}
