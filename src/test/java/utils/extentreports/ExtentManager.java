package utils.extentreports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import javafx.application.Platform;

import java.io.File;

public class ExtentManager {

    private static ExtentReports extent;
    private static Platform platform;
    private static String reportFileName = "ExtentReports-Version3-Test-Automaton-Report.html";
    private static String macPath = System.getProperty("user.dir") + "/TestReport";
    private static String macReportFileName = macPath + "/" + reportFileName;

    public static ExtentReports getInstance() {
        if (extent == null)
            createInstance();
        return extent;
    }

    //Create an extent report instance
    public static ExtentReports createInstance() {
        createReportPath(macPath);
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(macReportFileName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle(macReportFileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(macReportFileName);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        return extent;
    }

    //Create the report path if it does not exist
    private static void createReportPath (String path) {
        File testDirectory = new File(path);
        if (!testDirectory.exists()) {
            if (testDirectory.mkdir()) {
                System.out.println("Directory: " + path + " is created!" );
            } else {
                System.out.println("Failed to create directory: " + path);
            }
        } else {
            System.out.println("Directory already exists: " + path);
        }
    }
}
