package entities;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.xpath.operations.Bool;
import utils.PropertyLoader;

import java.io.File;

/**
 * Created by c246T on 02.03.2015.
 */
public class Advertisement {
    public String title = "";
    public String rubric = "";
    public String desc = "";
    public String photoFilePath = new File(PropertyLoader.loadProperty("project.path") + "src/test/resources/testData.file").getAbsolutePath();
    public String region = "";
    public String user = "";
    public String email = "";
    public String phone = "";
    public String icq = "";
    public String skype = "";

    public String setCorrectTitle(){
        return title = RandomStringUtils.randomAlphabetic(6);
    }

    public Advertisement(Boolean correct){
        if (correct) {
            //...
        }
        else {
            title = "123";
            email = "asd";
        }
    }
}
