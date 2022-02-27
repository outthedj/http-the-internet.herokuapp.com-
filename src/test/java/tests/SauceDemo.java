package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class SauceDemo extends BaseTest{

    @Test
    public void isKeyboardArrowsWorksTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(1000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(1000);
        String isPriceCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(isPriceCorrect, "$29.99");
        Thread.sleep(1000);
        String isNameCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        Assert.assertEquals(isNameCorrect, "Sauce Labs Backpack");
        Thread.sleep(1000);
    }
}
