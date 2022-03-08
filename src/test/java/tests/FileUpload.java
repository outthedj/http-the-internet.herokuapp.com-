package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUpload extends BaseTest{

    FileUploadPage fileUploadPage;

    @Test
    public void checkFileName(){
        fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openUploadFilePage();
        Assert.assertEquals(fileUploadPage.getText, "666.TXT");
    }
}
