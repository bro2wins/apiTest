package com.pack.utils.listeners;


import com.pack.utils.ScreenShotMaker;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.io.IOException;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult tr) {
        try {
            ScreenShotMaker.screenshot();
        } catch (IOException ex){

        }
    }

}
