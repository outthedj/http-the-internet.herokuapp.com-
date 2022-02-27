package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class AddRemoveElementPage extends BasePage{

    private By ADDELEMENTBUTTON = By.xpath("//button");
    private By DELETEBUTTON = By.xpath("//div/button[@class='added-manually']");

    public AddRemoveElementPage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemoveElementPage(){
        driver.get(WebUrls.ADDREMOVEELEMENTS_URL);
    }

    public void clickAddElementButton(){
        driver.findElement(ADDELEMENTBUTTON).click();
    }

    public void deleteElement(){
        driver.findElement(DELETEBUTTON).click();
    }

    int numbersOfElements;

    public int getNumbersOfElements() {
        return numbersOfElements;
    }

    public void howManyElements(){
        numbersOfElements = driver.findElements(DELETEBUTTON).size();
    }
}
