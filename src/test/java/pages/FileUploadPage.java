package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import staticdata.WebUrls;

public class FileUploadPage extends BasePage{

    private By CHOOSEFILEBUTTON = By.id("file-upload");
    private By UPLOADBUTTON = By.id("file-submit");
    private By UPLOADEDFILES = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public String getText;

    public String openUploadFilePage(){
        driver.get(WebUrls.FILEUPLOAD_URL);
        driver.findElement(CHOOSEFILEBUTTON).sendKeys("C:\\Users\\igorv\\IdeaProjects\\http-the-internet.herokuapp.com-\\src\\test\\resources\\666.TXT");
        driver.findElement(UPLOADBUTTON).click();
        return getText = driver.findElement(UPLOADEDFILES).getText();
    }
}
