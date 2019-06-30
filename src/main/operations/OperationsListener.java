package operations;

import org.openqa.selenium.WebDriver;

/**
 * Handles driver init as an interface
 */
public interface OperationsListener {
    void init(WebDriver driverWrapper);
}
