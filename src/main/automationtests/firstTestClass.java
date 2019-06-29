package automationtests;

import config.ResourceLocator;
import config.TestReporter;
import config.WebDriverWrapper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

/**
 * Created by Steve on 6/26/2019.
 */
public class firstTestClass extends WebDriverWrapper {
    TestReporter reporter = new TestReporter();

    @Test
    public void mainTest() throws InterruptedException {
        ops.navOps.navigateToURL(ResourceLocator.STAGING_ENV);
        ops.navOps.login("qa_user_3", "n4km@XrhP4MA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertTrue(elementExists(By.linkText(ResourceLocator.LOGOUT_TEXT)));
        driver.close();

        reporter.logTest("Login Test", "login", "Log in to Architect");
    }
}
