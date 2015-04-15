package negative;

import entities.Advertisement;
import functional.AbstractTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AdvertisementPage;

/**
 * Created by c246T on 02.03.2015.
 */
public class AdvertisementTest extends AbstractTest{
    @DataProvider
    public Object[][] negativeAdvs() {
        return new Object[][] {
                new Object[] {"title", "email" , "smth"},
                new Object[] {"another", "newOne" , "correctOne"},
        };
    }

    @Test (dataProvider = "negativeAdvs")
    public void createAdv(String title, String email, String smth)
    {
        browser.get("http://olx.ua/uk/post-new-ad/");
        Advertisement adv = new Advertisement(false);
        adv.title = title;
        adv.email = email;
        adv.icq = smth;
        AdvertisementPage advPage = new AdvertisementPage(browser);
        advPage.setAdv(adv);
        Assert.assertTrue(advPage.isError());
    }

}
