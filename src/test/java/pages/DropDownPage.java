package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import staticdata.WebUrls;

public class DropDownPage extends BasePage{

    private By openDropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        super(driver);
    }

    public String firstOption;
    public String secondOption;

    public void openDropdownPage(){
        driver.get(WebUrls.DROPDOWN_URL);
        WebElement selectElement = driver.findElement(openDropDown);
        Select select = new Select(selectElement);
        firstOption = select.getOptions().get(1).getText();
        secondOption = select.getOptions().get(2).getText();
    }
}
