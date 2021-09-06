package Agencify.Listeners;


import Agencify.Base;
import org.jetbrains.annotations.NotNull;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listener implements ITestListener {


    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure( ITestResult iTestResult) {
//        String FailedTestName = iTestResult.getName();
//        try {
//            Base.getScreenShots( FailedTestName );
//            System.out.println("Test failed");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
