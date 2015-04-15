package functional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.PropertyLoader;
import webdriver.Browser;
import webdriver.BrowserFactory;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by c246T on 23.02.2015.
 */
public class AbstractTest {
    public Browser browser;

    @BeforeSuite
    public void initEnv()
    {
        browser = BrowserFactory.create(PropertyLoader.loadProperty("browser"));
    }

    @AfterSuite
    public void shutEnv()
    {
        if (browser != null)
            browser.quit();
    }
}
