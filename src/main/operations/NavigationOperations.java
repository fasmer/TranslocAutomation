package operations;

import config.WebDriverWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Steve on 6/26/2019.
 */
public class NavigationOperations implements OperationsListener {
    static WebDriver driverWrapper;

    @Override
    public void init(WebDriver driverWrapper) {
        this.driverWrapper = driverWrapper;
    }

    public void login(String username, String password) {
        driverWrapper.findElement(By.id("username")).click();

    }

    public void navigateToURL(String url) {
        driverWrapper.navigate().to(url);
    }
}
