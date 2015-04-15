package testlink.models;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by 1 on 20.03.2015.
 */
public class TestSuite {
    public String name = getCorrectName();
    public String details = "Some details";

    public String getCorrectName(){
        name = RandomStringUtils.randomAlphabetic(10);
        return name;
    }
}
