package com.medallia.gridify;

import com.medallia.gridify.util.StatusPrinter;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by davidtolley on 5/10/17.
 */
public class WebdriverTestListener extends TestListenerAdapter {

    /**
     * This is the entry point for the entire test run
     *
     * @param tc is the test suite context
     */
    @Override
    public void onStart(ITestContext tc) {
        StatusPrinter.printRunStart();
    }

    /**
     * This is the entry point for an individual test method running
     *
     * @param tr the test method context
     */
    @Override
    public void onTestStart(ITestResult tr) {
        StatusPrinter.printTestStart(tr);
    }

    /**
     * Triggered on test passing
     *
     * @param tr test result
     */
    @Override
    public void onTestSuccess(ITestResult tr) {
        StatusPrinter.printTestSuccess(tr);
    }

    /**
     * Triggered on test failure
     *
     * @param tr test result
     */
    @Override
    public void onTestFailure(ITestResult tr) {
        StatusPrinter.printTestFailure(tr);
    }
}
