package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import staticdata.WebUrls;

public class CheckBoxes extends BaseTest{

    @Test
    public void FirstCheckbox() {
        driver.get(WebUrls.CHECKBOX_URL);
        boolean isFirstCheckboxDisabled = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]")).isSelected();
        Assert.assertFalse(isFirstCheckboxDisabled);
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]")).click();
        boolean isFirstCheckboxEnabled = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[1]")).isSelected();
        Assert.assertTrue(isFirstCheckboxEnabled);
    }

    @Test
    public void SecondCheckbox() {
        driver.get(WebUrls.CHECKBOX_URL);
        boolean isSecondCheckboxEnabled = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]")).isSelected();
        Assert.assertTrue(isSecondCheckboxEnabled);
        driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]")).click();
        boolean isSecondCheckboxDisabled = driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/form[1]/input[2]")).isSelected();
        Assert.assertFalse(isSecondCheckboxDisabled);
    }
}