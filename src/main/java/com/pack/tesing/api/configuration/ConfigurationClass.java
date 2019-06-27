package com.pack.tesing.api.configuration;

import com.pack.tesing.api.client.SimpleClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.ws.rs.client.ClientBuilder;
import static com.pack.utils.Constants.URL;

@Configuration
public class ConfigurationClass {

    @Bean
    public SimpleClient simpleClient(){
        ResteasyClient client = (ResteasyClient)ClientBuilder.newClient();
        ResteasyWebTarget target = client.target(URL);
        return target.proxy(SimpleClient.class);
    }
}
