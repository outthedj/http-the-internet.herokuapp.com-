package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class AddRemoveElements extends BaseTest{

    @Test
    public void isAddingRemovingElementsWorksTest () {
        driver.get(WebUrls.ADDREMOVEELEMENTS_URL);
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//button")).click();
        driver.findElement(By.xpath("//div/button[@class='added-manually']")).click();
        int numbersOfElements = driver.findElements(By.xpath("//div/button[@class='added-manually']")).size();
        Assert.assertEquals(numbersOfElements, 1, "Неправильное количество элементов на странице");
    }
}
