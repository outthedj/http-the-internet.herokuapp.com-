package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import staticdata.WebUrls;

public class FramesDragAndDropPage extends BasePage{

    private By DRAGMETOMYTARGETFIELD = By.xpath("//div[@id='draggable']");
    private By DROPHEREFIELD = By.xpath("//div[@id='droppable']");
    private By FRAMEAREA = By.xpath("//iframe[@class='demo-frame']");
    private By TEXT = By.xpath("//div[@id='droppable']/p");

    public By getTEXT() {
        return TEXT;
    }

    public FramesDragAndDropPage(WebDriver driver) {
        super(driver);
    }

    Actions actions;

    public String text2;

    public String dragChecking() throws InterruptedException {
        driver.get(WebUrls.FRAMESDRAGANDDROP_URL);
        Thread.sleep(1000);
        WebElement frame = driver.findElement(FRAMEAREA);
        driver.switchTo().frame(frame);
        WebElement target1 = driver.findElement(DRAGMETOMYTARGETFIELD);
        WebElement target2 = driver.findElement(DROPHEREFIELD);
        actions = new Actions(driver);
        actions.dragAndDrop(target1, target2).perform();

        Thread.sleep(1000);
        return driver.findElement(TEXT).getText();



    }
}
