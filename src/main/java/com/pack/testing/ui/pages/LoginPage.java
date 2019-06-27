package com.pack.testing.ui.pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final String loginId = "passp-field-login";
    private final String passwordId = "passp-field-passwd";

    public void enterValue(String id, String field){
        $(byId(id)).val(field);
        $(byClassName("button2_type_submit")).click();
    }

    @Step("Enter login {login}")
    public void enterLogin(String login){
        enterValue(loginId, login);
    }

    @Step("Enter password {password}")
    public void enterPassword(String password){
        enterValue(passwordId, password);
    }

    @Step("Login")
    public void login(String login, String password){
        if ($("div.passp-form-field__input input").has(Condition.id(loginId))){
            enterLogin(login);
        }
        enterPassword(password);
    }

}
