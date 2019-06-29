package config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

/**
 * Created by Steve on 6/28/2019.
 */
public class TestReporter {
    ExtentHtmlReporter reporter;
    ExtentReports extent = new ExtentReports();
    ExtentTest logger;

    public void logTest(String testName, String fileName, String info) {
        logger = extent.createTest(testName);
        reporter = new ExtentHtmlReporter("./Reports/" + fileName + ".html");
        extent.attachReporter(reporter);
        logger.log(Status.INFO, info);
        extent.flush();
    }
}
