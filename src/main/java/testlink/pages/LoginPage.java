package testlink.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testlink.models.User;

/**
 * Created by admin on 08.04.2015.
 */
public class LoginPage extends AbstractPage{
    private static final String URL = "http://demo.testlink.org/latest/login.php";

    private static final By loginField = By.id("login");
    private static final By passwordField = By.name("tl_password");
    private static final By loginButton = By.name("login_submit");

    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void open(){
        driver.get(URL);
    }

    public HomePage login(User user) {
        driver.findElement(loginField).sendKeys(user.name);
        driver.findElement(passwordField).sendKeys(user.password);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }

    public HomePage login(String login, String password) {
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}

