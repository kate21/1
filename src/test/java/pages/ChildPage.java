package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import webdriver.Browser;

/**
 * Created by c246T on 23.02.2015.
 */
public class ChildPage extends AbstractPage{
    private static final By openDetskayaOdezhdaLink = By.id("cat-539");

    public ChildPage(Browser driver) {
        super(driver);
    }

    public void openOdezhda()
    {
        driver.findElement(openDetskayaOdezhdaLink).click();
    }

    public boolean isOpened()
    {
        return driver.findElement(openDetskayaOdezhdaLink).isDisplayed();
    }
}
