package testlink.tests.functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testlink.models.TestPlan;
import testlink.models.User;
import testlink.pages.HomePage;
import testlink.pages.LoginPage;
import testlink.pages.TestPlanEditPage;
import testlink.pages.TestPlanManagementPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by admin on 08.04.2015.
 */
public class TestPlanTest {

    WebDriver driver;

    @BeforeTest
    public void login(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(new User());
    }

    @Test
    public void createTestPlanTest(){
        HomePage homePage = new HomePage(driver);

        TestPlanManagementPage testPlanManagementPage = homePage.openTestPlanManagement();
        TestPlanEditPage editPage = testPlanManagementPage.createTestPlan();

        TestPlan testPlan = new TestPlan();
        editPage.createTestPlan(testPlan);

        Assert.assertTrue(testPlanManagementPage.isTestPlanPresent(testPlan));
        deleteTestPlan(testPlan);

    }

    @AfterTest
    public void shutEnv(){
        logout();
        if (driver != null)
            driver.quit();
    }

    public void deleteTestPlan(TestPlan testPlan){
        TestPlanManagementPage managementPage = new TestPlanManagementPage(driver);
        managementPage.deleteTestPlan(testPlan);
    }

    public void logout(){
        HomePage homePage = new HomePage(driver);
        homePage.logout();
    }
}
