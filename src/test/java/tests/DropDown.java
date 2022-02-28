package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class DropDown extends BaseTest{

    DropDownPage dropDownPage;

    @Test
    public void checkDropDown(){
        dropDownPage = new DropDownPage(driver);
        dropDownPage.openDropdownPage();
        Assert.assertEquals(dropDownPage.firstOption, "Option 1");
        Assert.assertEquals(dropDownPage.secondOption, "Option 2");
    }
}
