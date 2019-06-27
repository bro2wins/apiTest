package com.pack.testing.api;

import com.pack.tesing.api.configuration.SimpleClient;
import com.pack.tesing.api.configuration.ConfigurationClass;
import com.pack.tesing.api.model.LoginData;
import com.pack.tesing.api.utils.Constants;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.ws.rs.core.Response;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@Test
@ContextConfiguration(classes = {ConfigurationClass.class})
public class LoginTest extends AbstractTestNGSpringContextTests {

    @Autowired
    SimpleClient simpleClient;

    @Test
    public void testUserLogin(){
        Response response = simpleClient.loginUser(new LoginData(Constants.LOGIN, Constants.PASSWORD));

        assertThat(response.getStatus(), is(HttpStatus.SC_OK));
        assertThat(response.readEntity(String.class), is("carpe diem!"));

        response.close();
    }

    @Test
    public void test(){

        Response response = simpleClient.test();

        assertThat(response.getStatus(), is(HttpStatus.SC_OK));
        assertThat(response.readEntity(String.class), is("carpe diem!"));

        response.close();
    }





}
