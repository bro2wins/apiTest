package com.pack.tesing.api.configuration;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import javax.ws.rs.client.ClientBuilder;
import static com.pack.tesing.api.utils.Constants.URL;

@Configuration
@ComponentScan
public class ConfigurationClass {

    @Bean
    public SimpleClient simpleClient(){
        ResteasyClient client = (ResteasyClient)ClientBuilder.newClient();
        ResteasyWebTarget target = client.target(URL);
        return target.proxy(SimpleClient.class);
    }
}