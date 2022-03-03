package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesDragAndDropPage;

public class FramesDragAndDrop extends BaseTest{

    FramesDragAndDropPage framesDragAndDropPage;

    @Test
    public void checkText() throws InterruptedException {
        framesDragAndDropPage = new FramesDragAndDropPage(driver);
        framesDragAndDropPage.dragChecking();
        Assert.assertEquals(framesDragAndDropPage.getTEXT(), "Dropped!");
    }
}
