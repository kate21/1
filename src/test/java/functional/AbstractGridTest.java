package functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 1 on 16.03.2015.
 */
public class AbstractGridTest {
    protected ThreadLocal<WebDriver> threadDriver = null;
    public static final String hubUrl = "http://localhost:9999/wd/hub";

    @BeforeTest
    public void create() throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), DesiredCapabilities.firefox());
        threadDriver = new ThreadLocal<WebDriver>();
//        WebDriver driver = new FirefoxDriver();
        threadDriver.set(driver);
    }

    @AfterTest
    public void close()
    {
        if (threadDriver.get() != null)
            threadDriver.get().quit();
    }
}
