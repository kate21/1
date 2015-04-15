package functional;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by c246T on 25.02.2015.
 */
public class ExampleActions extends AbstractTest{

    @Test
    public void exampleTest()
    {
        browser.get("http://olx.ua/uk/");
        Actions actions = new Actions(browser.driver);
        actions.moveToElement(browser.findElement(By.cssSelector(".icon.block.googleplay")));
        actions.perform();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            Assert.fail("Test crushed");
        }
    }
}
