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

    public FramesDragAndDropPage(WebDriver driver) {
        super(driver);
    }


    public void method(){
        driver.get(WebUrls.FRAMESDRAGANDDROP_URL);
        WebElement frame = driver.findElement(FRAMEAREA);
        driver.switchTo().frame(frame);

    }
}
