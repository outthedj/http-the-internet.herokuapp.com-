package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NotificationMessagePage;
import staticdata.WebUrls;

public class NotificationMessages extends BaseTest{

    NotificationMessagePage notificationMessagePage;

    @Test
    public void isNotificationMessageCorrectTest() {
        notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickHereButton();
        String a = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(a,"Action successful\n" +
                "×");
    }
}
