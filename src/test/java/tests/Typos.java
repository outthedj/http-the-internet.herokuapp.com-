package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class Typos extends BaseTest{

    @Test
    public void isParagraphCorrectTest() {

        driver.get(WebUrls.TYPOS_URL);
        String a = driver.findElement(By.className("example")).getText();
        Assert.assertEquals(a,"Typos\n" +
                "This example demonstrates a typo being introduced. It does it randomly on each page load.\n" +
                "Sometimes you'll see a typo, other times you won't.");
    }
}
