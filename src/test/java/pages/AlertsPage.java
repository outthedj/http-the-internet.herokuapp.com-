package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AlertsPage extends BasePage{

    private By CLICKFORJSCONFIRM = By.xpath("//button[@onclick='jsConfirm()']");

    private By CLICKFORJSPROMPT = By.xpath("//button[@onclick='jsPrompt()']");
    private By CLICKFORJSPROMPTRESULT = By.id("result");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage(){
        driver.get(WebUrls.JAVASCRIPTALERTS_URL);
    }

    public void clickForJsConfirmButton() {
        driver.findElement(CLICKFORJSCONFIRM).click();
    }

    public void clickForJsPromptButton() {
        driver.findElement(CLICKFORJSPROMPT).click();
    }

    public String getAlertText(){
        String alertText = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        return alertText;
    }

    public String alertResult;

    public String checkAlertText(){
        driver.switchTo().alert().sendKeys("123");
        driver.switchTo().alert().accept();
        return alertResult = driver.findElement(CLICKFORJSPROMPTRESULT).getText();
    }
}
