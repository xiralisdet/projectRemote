package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SetUp;

public class DynamicControls extends SetUp {
    public DynamicControls()
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@onclick='swapCheckbox()']")
    WebElement removeButton;
    @FindBy(xpath = "//form[@id='checkbox-example']/button")
    WebElement addButton;
    @FindBy(xpath = "//form[@id='input-example']/button")
    WebElement enableButton;
    @FindBy(xpath = "//form[@id='input-example']/button")
    WebElement disableButton;
    @FindBy(xpath = "//form[@id='checkbox-example']/p")
    WebElement removeAddButtonMessage;
    @FindBy(xpath = "//form[@id='input-example']/p")
    WebElement enableDisableButtonMessage;


    public boolean  removeBtn() {
        boolean removed = false;
        removeButton.click();
        wait(removeAddButtonMessage, driver);
        if (removeAddButtonMessage.getText().equals("It's gone!")) {
            removed = true;
        }
        return removed;

    }
    public boolean  addBtn() {
        boolean added = false;
        addButton.click();
        wait(removeAddButtonMessage, driver);
        if (removeAddButtonMessage.getText().equals("It's back!")) {
            added = true;
        }
        return added;

    }

    public boolean  enableBtn() {
        boolean enabled = false;
        enableButton.click();
        wait(enableDisableButtonMessage, driver);
        if (enableDisableButtonMessage.getText().equals("It's enabled!")) {
            enabled = true;
        }
        return enabled;

    }

    public boolean  disableBtn() {
        boolean disable = false;
        disableButton.click();
        wait(enableDisableButtonMessage, driver);
        if (enableDisableButtonMessage.getText().equals("It's disabled!")) {
            disable = true;
        }
        return disable;

    }

}
