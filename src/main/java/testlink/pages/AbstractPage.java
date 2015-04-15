package testlink.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AbstractPage {
    Logger logger = LoggerFactory.getLogger(AbstractPage.class);

    protected WebDriver driver;

    private static final By headeFrame = By.name("titlebar");
    private static final By mainFrame = By.name("mainframe");
    private static final By treeFrame = By.name("treeframe");
    private static final By workFrame = By.name("workframe");
//    private static final By IFrame = By.xpath();

    public AbstractPage(WebDriver driver){
        this.driver = driver;
    }

    protected void switchToTitleBar(){
        logger.info("switch to title bar");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(headeFrame));
    }

    protected void switchToTreeFrame(){
        logger.info("Switch to tree frame");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(mainFrame));
        driver.switchTo().frame(driver.findElement(treeFrame));
    }

    protected void switchToWorkFrame(){
        logger.info("Switch to work frame");
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(mainFrame));
        driver.switchTo().frame(driver.findElement(workFrame));
    }

}
