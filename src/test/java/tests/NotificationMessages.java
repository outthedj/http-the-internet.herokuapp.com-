package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class NotificationMessages extends BaseTest{

    @Test
    public void isInputEnabled() throws InterruptedException {

        driver.get(WebUrls.NOTIFICATIONMESSAGES_URL);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/p/a")).click();
        Thread.sleep(2000);
        String a = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(a,"Action successful\n" +
                "×");
    }
}
