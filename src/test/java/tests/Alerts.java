package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class Alerts extends BaseTest{

    AlertsPage alertsPage;

    @Test
    public void clickForJsConfirmTest(){
        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickForJsConfirmButton();
        String actualText = alertsPage.getAlertText();
        Assert.assertEquals(actualText, "I am a JS Confirm", "Message isn't expected");
    }

    @Test
    public void clickForJsPromptTest(){
        alertsPage = new AlertsPage(driver);
        alertsPage.openAlertsPage();
        alertsPage.clickForJsPromptButton();
        alertsPage.checkAlertText();
        Assert.assertEquals(alertsPage.alertResult, "You entered: 123", "Message isn't expected");
    }
}
