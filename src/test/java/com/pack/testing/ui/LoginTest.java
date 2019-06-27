package com.pack.testing.ui;

import com.codeborne.selenide.Condition;
import com.pack.testing.ui.pages.HomePage;
import com.pack.utils.listeners.TestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.pack.utils.Constants.*;

@Listeners({TestListener.class})
public class LoginTest {

    @Test
    public void testUserLogin() {
        HomePage homePage = open(START_URL, HomePage.class);
        homePage.login().login(LOGIN, PASSWORD);

        homePage.getBtnLogin().shouldHave(Condition.text(BUTTON_TEXT));
        //homePage.getBtnLogin().shouldHave(Condition.text("sss"));
        homePage.getUserLogin().shouldHave(Condition.text(LOGIN));
    }
}