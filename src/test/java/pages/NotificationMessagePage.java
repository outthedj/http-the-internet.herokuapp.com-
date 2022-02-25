package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import staticdata.WebUrls;

public class NotificationMessagePage extends BasePage{

    private By CLICK_HERE_BUTTON = By.xpath("//a[@href='/notification_message']");

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage(){
        driver.get(WebUrls.NOTIFICATIONMESSAGES_URL);
    }

    public void clickHereButton(){
        driver.findElement(CLICK_HERE_BUTTON).click();
    }

    public void isTextCorrect(){
        String a = driver.findElement(By.id("flash")).getText();
        Assert.assertEquals(a,"Action successful\n" +
                "×");
    }
}
