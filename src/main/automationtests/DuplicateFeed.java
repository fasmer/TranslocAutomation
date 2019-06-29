package automationtests;

import config.ResourceLocator;
import config.WebDriverWrapper;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import cucumber.api.java.en.*;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.CucumberOptions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Steve on 6/28/2019.
 */
public class DuplicateFeed extends WebDriverWrapper {

    @Test
    @Given("^User is on the Architect home view$")
    public void login() {
        ops.navOps.navigateToURL(ResourceLocator.STAGING_ENV);
        ops.navOps.login("qa_user_3", "n4km@XrhP4MA");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("^User selects a feed's overflow menu$")
    public void when() {
        driver.findElement(By.xpath(ResourceLocator.FIRST_FEED_OVERFLOW)).click();
    }

    @And("^User selects duplicate$")
    public void selectOverflowDuplicate() {
        driver.findElement(By.xpath(ResourceLocator.OVERFLOW_DUPLICATE)).click();
    }

    @And("^User confirms duplicate$")
    public void confirmDuplicate() {
        driver.findElement(By.xpath(ResourceLocator.POPUP_CONFIRM)).click();
        driver.findElement(By.xpath(ResourceLocator.POPUP_CLOSE)).click();
    }

    @Then("^Feed should be duplicated$")
    public void feedDuplicationValidation() {
        String originalFeedName = driver.findElement(By.xpath(ResourceLocator.FIRST_FEED)).getText();
        String duplicateFeedText = driver.findElement(By.xpath(ResourceLocator.SECOND_FEED)).getText();
        Assert.assertEquals(duplicateFeedText, originalFeedName + " (Copy)");
    }

}

