package com.pack.testing.ui.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class HomePage {

    public LoginPage login(String login, String password) {
        $("header2-nav__user").click();
        return page(LoginPage.class);
    }

    public LoginPage login(){
        $("div.header2-nav__user").click();
        return page(LoginPage.class);
    }


    public void logout(){
        SelenideElement element = $("header2-nav__user").hover();
        element.find(By.xpath("//a[text()='Выход']")).click();
    }

    public SelenideElement getBtnLogin(){
        return $("div.header2-nav__user");
    }

    public SelenideElement getUserLogin(){
        $("div.header2-nav__user").hover();
        return $(byClassName("header2-user-menu__email"));
    }
}
