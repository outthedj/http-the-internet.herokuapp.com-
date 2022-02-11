package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class NotificationMessages extends BaseTest{

    @Test
    public void isNotificationMessageCorrectTest() {

        driver.get(WebUrls.NOTIFICATIONMESSAGES_URL);
        driver.findElement(By.xpath("//a[@href='/notification_message']")).click();
        String a = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(a,"Action successful\n" +
                "×");
    }
}
