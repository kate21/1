package testlink.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testlink.models.TestPlan;

/**
 * Created by admin on 08.04.2015.
 */
public class TestPlanManagementPage {

    private WebDriver driver;

    private static final By createButton = By.name("create_testplan");

    public TestPlanManagementPage(WebDriver driver) {
        this.driver = driver;
    }

    public TestPlanEditPage createTestPlan() {
        driver.findElement(createButton).click();
        return new TestPlanEditPage(driver);
    }

    public boolean isTestPlanPresent(TestPlan testPlan) {
        return driver.findElement(By.linkText(TestPlan.name)).size() > 0;
    }

    public void deleteTestPlan(TestPlan testPlan) {
        driver.findElement(By.xpath("//img[contains(@onclick,'Bionic TestPlan')]")).click();
        driver.findElement(By.id("ext-gen20")).click();
    }


}