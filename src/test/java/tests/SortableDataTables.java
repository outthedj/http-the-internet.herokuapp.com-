package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SortableDataTablesPage;
import staticdata.WebUrls;

public class SortableDataTables extends BaseTest{

    SortableDataTablesPage sortableDataTablesPage;

    @Test
    public void firstTableTest() {
        sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        sortableDataTablesPage.getLastName();
        sortableDataTablesPage.getFirstName();
        Assert.assertEquals(sortableDataTablesPage.getfirstTableLastName(), "Bach", "Фамилия не совпадает");
        Assert.assertEquals(sortableDataTablesPage.getfirstTableFirstName(), "Frank", "Имя не совпадает");
    }

    @Test
    public void secondTableTest(){
        sortableDataTablesPage = new SortableDataTablesPage(driver);
        sortableDataTablesPage.openSortableDataTablesPage();
        sortableDataTablesPage.getDue();
        sortableDataTablesPage.getWebsite();
        Assert.assertEquals(sortableDataTablesPage.getSecondTableDue(), "$51.00", "Значение due неправильное");
        Assert.assertEquals(sortableDataTablesPage.getSecondTableWebsite(), "http://www.frank.com", "Значение website неправильное");

    }
}
