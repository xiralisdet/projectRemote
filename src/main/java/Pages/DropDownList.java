package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.SetUp;

public class DropDownList extends SetUp {
   public  DropDownList()
   {
       PageFactory.initElements(driver, this);
   }
   @FindBy(xpath = "//select[@id='dropdown']")
   WebElement dropdownList;
   @FindBy(xpath = "//select/option[2]")
   WebElement option1;
    @FindBy(xpath = "//select/option[3]")
    WebElement option2;
    public boolean selectOption1() throws InterruptedException {
        boolean option1Selected=false;
        Select select=new Select(dropdownList);
        select.selectByVisibleText("Option 1");
        Thread.sleep(3000);

        if(option1.isSelected()){
            option1Selected=true;
        }
        return option1Selected;
    }

    public boolean selectOption2()
    {
        boolean option2Selected=false;
       //
        Select select=new Select(dropdownList);
        select.selectByVisibleText("Option 2");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(option2.isSelected()){
            option2Selected=true;
        }
        return option2Selected;
    }



}
