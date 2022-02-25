package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import staticdata.WebUrls;

public class TyposPage extends BasePage{

    private By TEXT = By.className("example");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage(){
        driver.get(WebUrls.TYPOS_URL);
    }

    public void isTextCorrect(){
        String a = driver.findElement(By.className("example")).getText();
        Assert.assertEquals(a,"Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "Sometimes you'll see a typo, other times you won't.");
    }
}
