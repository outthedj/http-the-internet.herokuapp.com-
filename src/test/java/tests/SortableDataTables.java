package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class SortableDataTables extends BaseTest{

    @Test
    public void firstTableTest(){
        driver.get(WebUrls.SORTABLEDATATABLES_URL);
        String lastname = driver.findElement(By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[2]")).getText();
        String firstname = driver.findElement(By.xpath("//table[@id = 'table1']//td[text() = 'fbach@yahoo.com']/preceding-sibling::td[1]")).getText();
        Assert.assertEquals(lastname, "Bach", "Фамилия не совпадает");
        Assert.assertEquals(firstname, "Frank", "Имя не совпадает");
    }

    @Test
    public void secondTableTest(){
        driver.get(WebUrls.SORTABLEDATATABLES_URL);
        String due = driver.findElement(By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[1]")).getText();
        String website = driver.findElement(By.xpath("//table[@id = 'table2']//td[text() = 'fbach@yahoo.com']/following-sibling::td[2]")).getText();
        Assert.assertEquals(due, "$51.00", "Значение due неправильное");
        Assert.assertEquals(website, "http://www.frank.com", "Значение website неправильное");

    }
}
