package com.pack.utils.listeners;

import com.pack.utils.ScreenShotMaker;
import io.qameta.allure.listener.StepLifecycleListener;
import io.qameta.allure.model.StepResult;

import java.io.IOException;

public class StepListener implements StepLifecycleListener {

    @Override
    public void beforeStepStop(StepResult result) {
        try{
            ScreenShotMaker.screenshot();
            System.out.println("add screen shot");
        } catch (IOException ex) {}
    }
}
