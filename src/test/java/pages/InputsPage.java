package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import staticdata.WebUrls;

public class InputsPage extends BasePage{

    private By INPUT = By.cssSelector("[type=\"number\"]");

    public By getINPUT() {
        return INPUT;
    }

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    public void openInputsPage(){
        driver.get(WebUrls.INPUTS_URL);
    }

    public void useArrowUp(){
        driver.findElement(INPUT).sendKeys(Keys.ARROW_UP);
    }

    public String value;

    public String isValueNottNull() {
        return value = driver.findElement(getINPUT()).getAttribute("value");
    }
}
