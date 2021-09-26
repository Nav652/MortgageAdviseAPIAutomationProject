package com.API_Automation.utlils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * This class will initialise the Extent Test Report instance.
 */
public class ExtentManager {
    private static ExtentReports extentReports;
    private static final String reportFileName = "API_Testing_report.html";
    private static final String macPath = System.getProperty("user.dir") + "/reports";
    private static final String windowsPath = System.getProperty("user.dir") + "\\reports";
    private static final String macReportFileLoc = macPath + "/" + reportFileName;
    private static final String winReportFileLoc = windowsPath + "/" + reportFileName;

    public static ExtentReports getInstance() {
        if (extentReports == null)
            createInstance();
        return extentReports;
    }

    /**
     * @return the Report instance with given configurations.
     */
    public static ExtentReports createInstance() {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(macReportFileLoc);
        sparkReporter.config().setDocumentTitle("API Testing Report");
        sparkReporter.config().setReportName(" API gggg");
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setEncoding("utf-8");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        return extentReports;
    }
}
