package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class CheckBoxesPage extends BasePage {

    private By CHECKBOX_1 = By.xpath("//input[1]");
    private By CHECKBOX_2 = By.xpath("//input[2]");

    public CheckBoxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckBoxesPage(){
        driver.get(WebUrls.CHECKBOX_URL);
    }

    public void clickFirstCheckBox() {
        driver.findElement(CHECKBOX_1).click();
    }

    public boolean isFirstCheckBoxSelected() {
        driver.findElement(CHECKBOX_1).isSelected();
        return driver.findElement(By.xpath("//input[1]")).isSelected();
    }

    public boolean isSecondCheckBoxSelected() {
        driver.findElement(CHECKBOX_2).isSelected();
        return driver.findElement(By.xpath("//input[2]")).isSelected();
    }

    public void clickSecondCheckBox() {
        driver.findElement(CHECKBOX_2).click();
    }
}