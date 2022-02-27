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
        notificationMessagePage.isTextCorrect();
        Assert.assertEquals(notificationMessagePage.text,"Action successful\n" +
                "×");
    }
}
