package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FramesDragAndDropPage;

public class FramesDragAndDrop extends BaseTest{

    FramesDragAndDropPage framesDragAndDropPage;

    @Test
    public void checkText() {
        framesDragAndDropPage = new FramesDragAndDropPage(driver);
        framesDragAndDropPage.dragChecking();
        Assert.assertEquals(framesDragAndDropPage.text2, "Dropped!");
    }
}
