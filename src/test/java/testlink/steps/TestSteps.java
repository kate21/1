package testlink.steps;

import org.openqa.selenium.WebDriver;
import testlink.models.TestSuite;
import testlink.pages.HomePage;
import testlink.pages.LoginPage;
import testlink.pages.SpecificationPage;

/**
 * Created by 1 on 20.03.2015.
 */
public class TestSteps {
    protected WebDriver driver;

    public boolean login(String login, String password){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        return loginPage.login(login,password).isOpened();
    }

    public boolean createTestSuite(){
        SpecificationPage specificationPage = new SpecificationPage(driver);
        specificationPage.open();
        specificationPage.createSuite(new TestSuite());
        return true;
    }

}
