package automationtests;

import config.ResourceLocator;
import config.WebDriverWrapper;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Steve on 6/29/2019.
 */
public class ShareFeed extends WebDriverWrapper {
    String feedToBeShared;

    @Test(priority = 1)
    @Given("^User is on the Architect home view$")
    public void homeView() {
        ops.navOps.navigateToURL(ResourceLocator.STAGING_ENV);
        ops.navOps.login("qa_user_3", "n4km@XrhP4MA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        feedToBeShared = ops.userOps.getFeedName(ResourceLocator.FIRST_FEED);
    }

    @Test(priority = 2)
    @When("^User selects a feed's overflow menu$")
    public void selectFirstOverflow() {
        driver.findElement(By.xpath(ResourceLocator.FIRST_FEED_OVERFLOW)).click();
    }

    @Test(priority = 3)
    @And("^User selects share$")
    public void selectOverflowShare() {
        driver.findElement(By.xpath(ResourceLocator.OVERFLOW_SHARE)).click();

    }

    @Test(priority = 4)
    @And("^User confirms share$")
    public void confirmSharePopup() {
        ops.navOps.confirmAndClosePopup();
    }

    @Test(priority = 5)
    @Then("^Feed should be shared successfully$")
    public void shareValidation() {
        String sharedFeed = driver.findElement(By.xpath(ResourceLocator.SHARED_FEED_NAME)).getText();
        Assert.assertTrue(sharedFeed.equals(feedToBeShared));
    }

}

