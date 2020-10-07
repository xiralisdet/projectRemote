package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class FileDownload extends SetUp {
    public FileDownload()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='example']/a")
    WebElement downloadBtn;

    public void setDownload()
    {
        downloadBtn.click();

    }
}
