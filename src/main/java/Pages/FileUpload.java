package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class FileUpload extends SetUp {
    public FileUpload()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "file-upload")
    WebElement chooseFileButton;
    @FindBy(id = "file-submit")
    WebElement uploadButton;
    @FindBy(xpath = "//div[@class='example']/h3")
    WebElement uploadVerificationMessage;
    public boolean uploadVerification()
    {
        boolean uploadSucceed=false;
        chooseFileButton.sendKeys("C:\\Users\\xiral\\Desktop\\book\\A_Whole_New_Mind_Why_Right-_Brainers_Wil.pdf");
        uploadButton.click();
        if(uploadVerificationMessage.isDisplayed())
        {
            uploadSucceed=true;
        }
        return uploadSucceed;


    }
}
