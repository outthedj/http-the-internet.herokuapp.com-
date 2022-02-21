package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class TyposPage extends BasePage{

    private By TEXT = By.className("example");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage(){
        driver.get(WebUrls.TYPOS_URL);
    }
}
