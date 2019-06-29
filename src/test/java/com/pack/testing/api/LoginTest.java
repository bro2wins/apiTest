package com.pack.testing.api;

import com.pack.Application;
import com.pack.tesing.api.client.SimpleClient;
import io.qameta.allure.Description;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import javax.ws.rs.core.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@SpringBootTest(classes = Application.class)
public class LoginTest extends AbstractTestNGSpringContextTests {

    @Autowired
    SimpleClient simpleClient;

    @Description("Get github user by id")
    @Test(description = "Get github user by id", enabled = false)
    public void getGitHubUserById(){
        Response response = simpleClient.getGitHubUserById(1);
        assertThat(response.getStatus(), is(HttpStatus.SC_OK));
        //assertThat(response.readEntity(String.class), is("carpe diem!"));
        response.close();
    }



}