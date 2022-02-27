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

    public String a;

    public String isTextCorrect2(){
        return a = driver.findElement(By.className("example")).getText();
    }
}
