package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class Inputs extends BaseTest{

    @Test
    public void isKeyboardArrowsWorksTest() {
        driver.get(WebUrls.INPUTS_URL);
        driver.findElement(By.cssSelector("[type=\"number\"]")).sendKeys(Keys.ARROW_UP);
        String a = driver.findElement(By.cssSelector("[type=\"number\"]")).getAttribute("value");
        Assert.assertNotNull(a);
    }
}
