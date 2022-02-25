package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.InputsPage;
import staticdata.WebUrls;

public class Inputs extends BaseTest{

    InputsPage inputsPage;

    @Test
    public void isKeyboardArrowsWorksTest() {
        inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.useArrowUp();
        inputsPage.isValueNottNull();
    }
}
