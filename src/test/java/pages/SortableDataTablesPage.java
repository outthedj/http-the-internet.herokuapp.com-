package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class SortableDataTablesPage extends BasePage{

    private By LASTNAME = By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[2]");
    private By FIRSTNAME = By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[1]");
    private By DUE = By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[1]");
    private By WEBSITE = By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[2]");

    public SortableDataTablesPage(WebDriver driver) {
        super(driver);
    }

    public void openSortableDataTablesPage(){
        driver.get(WebUrls.SORTABLEDATATABLES_URL);
    }

    String firstTableLastName;
    String firstTableFirstName;
    String secondTableDue;
    String secondTableWebsite;

    public String getfirstTableLastName() {
        return firstTableLastName;
    }

    public String getfirstTableFirstName() {
        return firstTableFirstName;
    }

    public String getSecondTableDue() {
        return secondTableDue;
    }

    public String getSecondTableWebsite() {
        return secondTableWebsite;
    }

    public void getLastName(){
        firstTableLastName = driver.findElement(LASTNAME).getText();
    }

    public void getFirstName(){
        firstTableFirstName = driver.findElement(FIRSTNAME).getText();
    }

    public void getDue(){
        secondTableDue = driver.findElement(DUE).getText();
    }

    public void getWebsite(){
        secondTableWebsite = driver.findElement(WEBSITE).getText();
    }
}
