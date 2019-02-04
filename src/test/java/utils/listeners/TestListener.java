package utils.listeners;

import cases.BaseTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.extentreports.ExtentManager;

public class TestListener extends BaseTest implements ITestListener {
    //Extent Report Declarations
    private static ExtentReports extent = ExtentManager.createInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

    public synchronized void onStart(ITestContext context) {
        System.out.println("CRM-Automation Test Suite started!");
    }

    public synchronized void onFinish(ITestContext context) {
        System.out.println(("CRM-Automation Test Suite is ending!"));
        extent.flush();
    }

    public synchronized void onTestStart(ITestResult result) {
        System.out.println(("Test Case: " + result.getMethod().getMethodName() + " Started!"));
        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
        test.set(extentTest);
    }

    public synchronized void onTestSuccess(ITestResult result) {
        System.out.println(("Test Case: " + result.getMethod().getMethodName() + " Passed!"));
        test.get().pass("Test passed");
    }

    public synchronized void onTestFailure(ITestResult result) {
        System.out.println(("Test Case: " + result.getMethod().getMethodName() + " Failed!"));
        test.get().fail(result.getThrowable());
    }

    public synchronized void onTestSkipped(ITestResult result) {
        System.out.println(("Test Case: " + result.getMethod().getMethodName() + " Skipped!"));
        test.get().skip(result.getThrowable());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println(("onTestFailedButWithinSuccessPercentage for " + result.getMethod().getMethodName()));
    }
}
