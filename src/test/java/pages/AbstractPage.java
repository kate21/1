package pages;

import functional.AbstractTest;
import org.openqa.selenium.WebDriver;
import webdriver.Browser;

import java.util.prefs.AbstractPreferences;

/**
 * Created by c246T on 23.02.2015.
 */
public class AbstractPage {
    protected Browser driver;

    public AbstractPage(Browser driver) {
        this.driver = driver;
    }
}
