package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TyposPage;
import staticdata.WebUrls;

public class Typos extends BaseTest{

    TyposPage typosPage;

    @Test
    public void isParagraphCorrectTest() {
        typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        typosPage.isTextCorrect();
    }
}
