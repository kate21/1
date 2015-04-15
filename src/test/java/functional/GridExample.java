
package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by c246T on 11.03.2015.
 */
public class GridExample {

    @Test
    public void gridTest() throws MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999/wd/hub"), DesiredCapabilities.firefox());
        driver.get("http://olx.ua/uk/");
        driver.findElement(By.id("message_system"));
        driver.quit();
    }


}