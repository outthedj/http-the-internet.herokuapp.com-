package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxesPage;
import staticdata.WebUrls;

public class CheckBoxes extends BaseTest{

    CheckBoxesPage checkBoxesPage;

    @Test
    public void firstCheckboxTest() {
        checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
        checkBoxesPage.isFirstCheckBoxSelected();
        Assert.assertFalse(checkBoxesPage.isFirstCheckBoxSelected());
        checkBoxesPage.clickFirstCheckBox();
        checkBoxesPage.isFirstCheckBoxSelected();
        Assert.assertTrue(checkBoxesPage.isFirstCheckBoxSelected());
    }

    @Test
    public void secondCheckboxTest() {
        checkBoxesPage = new CheckBoxesPage(driver);
        checkBoxesPage.openCheckBoxesPage();
        checkBoxesPage.isSecondCheckBoxSelected();
        Assert.assertTrue(checkBoxesPage.isSecondCheckBoxSelected());
        checkBoxesPage.clickSecondCheckBox();
        checkBoxesPage.isSecondCheckBoxSelected();
        Assert.assertFalse(checkBoxesPage.isSecondCheckBoxSelected());
    }
}
