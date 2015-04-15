package testlink.tests.functional;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import testlink.models.TestCase;
import testlink.models.TestStep;
import testlink.models.TestSuite;
import testlink.pages.SpecificationPage;
import testlink.steps.TestSteps;

import java.util.Arrays;
import java.util.List;

/**
 * Created by viktozhu on 4/7/15.
 */
public class SuiteTest extends TestSteps{

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                new Object[]{"Conspicuous name","Some details", "New test case", "Test summary", "Test preconditions", Arrays.asList(new TestStep(), new TestStep(), new TestStep())},
                new Object[]{"Other name","Other details", "Other test case", "Test summary", "Other preconditions", Arrays.asList(new TestStep(), new TestStep(), new TestStep())}
        };
    }

    @Test(dataProvider = "testData")
    public void createSuite(String testSuiteName, String testSuiteDetails, String testCaseTitle, String testCaseSummary, String testCasePreconditions,  List<TestStep> testSteps) {
        Assert.assertTrue(login("admin", "admin"), "Login failed");
        TestSuite testSuite = new TestSuite();
        TestCase testCase = new TestCase();
        Assert.assertTrue(createTestSuite());
    }
}
