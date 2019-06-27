package com.pack.utils;

import com.codeborne.selenide.Screenshots;
import com.google.common.io.Files;
import io.qameta.allure.Attachment;

import java.io.File;
import java.io.IOException;

public class ScreenShotMaker {

    @Attachment(type = "image/png")
    public static byte[] screenshot() throws IOException {
        Screenshots.takeScreenShotAsFile();
        File screenshot = Screenshots.getLastScreenshot();
        return Files.toByteArray(screenshot);

    }

}
