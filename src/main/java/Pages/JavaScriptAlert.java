package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class JavaScriptAlert extends SetUp {
    public JavaScriptAlert()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement clickAlert;
    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement clickJsConfirm;
    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement clickJsPrompt;
    @FindBy(id = "result")
    WebElement promptConfirmationMessage;
    Alert alert;
     public boolean clickJsAlert()
    {
        boolean isClicked=false;
        clickAlert.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert= driver.switchTo().alert();
        if(alert.getText().contains("I am a JS Alert"))
        {
            isClicked=true;
            driver.switchTo().alert().accept();
        }

        return isClicked;
    }
    public boolean confirmClickJsAlert()
    {
        boolean isConfirmed=false;
        clickJsConfirm.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert= driver.switchTo().alert();
        if(alert.getText().contains("I am a JS Confirm"))

        if(alert.getText().contains("I am a JS Confirm"))
        {
            isConfirmed=true;
            driver.switchTo().alert().accept();
        }

        return isConfirmed;
    }

    public boolean ClickJsPrompt()
    {
        boolean containMessage=false;
        clickJsPrompt.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        alert=driver.switchTo().alert();
        alert.sendKeys("this is a prompt");
        alert.accept();
        if(promptConfirmationMessage.getText().contains("You entered: this is a prompt"))
        {
            containMessage=true;
        }

        return containMessage;
    }

}
