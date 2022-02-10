package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class Inputs extends BaseTest{

    @Test
    public void isInputEnabled() throws InterruptedException {
        driver.get(WebUrls.INPUTS_URL);
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ARROW_UP);
        Thread.sleep(2000);
        String a = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).getAttribute("value");
        Thread.sleep(2000);
        Assert.assertNotNull(a);
    }
}
