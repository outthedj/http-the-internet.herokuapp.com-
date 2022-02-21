package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemoveElementPage;
import staticdata.WebUrls;

public class AddRemoveElements extends BaseTest{

    AddRemoveElementPage addRemoveElementPage;

    @Test
    public void isAddingRemovingElementsWorksTest () {
        addRemoveElementPage = new AddRemoveElementPage(driver);
        addRemoveElementPage.openAddRemoveElementPage();
        addRemoveElementPage.clickAddElementButton();
        addRemoveElementPage.clickAddElementButton();
        addRemoveElementPage.deleteElement();
        addRemoveElementPage.howManyElements();
        Assert.assertEquals(addRemoveElementPage.getNumbersOfElements(), 1, "Неправильное количество элементов на странице");
    }
}
