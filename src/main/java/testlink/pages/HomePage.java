package testlink.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by admin on 08.04.2015.
 */
public class HomePage{

    private WebDriver driver;

    private static final By TestPlanManagementLink = By.xpath("//*[@id='test_plan_mgmt_topics']/a[1]");
    private static final By Logout = By.xpath("//img[contains(@src,'gui/themes/default/images/computer_go.png')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {
        driver.switchTo().defaultContent().switchTo().frame("titlebar").findElement(Logout).click();
    }

    public TestPlanManagementPage openTestPlanManagement() {
        driver.switchTo().frame("mainframe").findElement(TestPlanManagementLink).click();
        return new TestPlanManagementPage(driver);
    }


}
