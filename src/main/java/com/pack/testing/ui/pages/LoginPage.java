package com.pack.testing.ui.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void login(String login, String password){
        $("#passp-field-login").sendKeys(login);
        $(By.name("button2_type_submit")).click();
        $("passp-field-password").sendKeys(password);
        $(By.name("button2_type_submit")).click();
    }

}
