package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class AddRemoveElements extends BaseTest{

    @Test
    public void isAddingRemovingElementsWorksTest () throws InterruptedException {
        driver.get(WebUrls.ADDREMOVEELEMENTS_URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/button[@class='added-manually']")).click();
        Thread.sleep(2000);
        int numbersOfElements = driver.findElements(By.xpath("//div/button[@class='added-manually']")).size();
        Assert.assertEquals(numbersOfElements, 1, "Неправильное количество элементов на странице");
        Thread.sleep(2000);
    }
}
