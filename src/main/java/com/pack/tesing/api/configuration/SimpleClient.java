package com.pack.tesing.api.configuration;


import com.pack.tesing.api.model.LoginData;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface SimpleClient {

    @POST
    @Path("/test")
    @Consumes("application/json")
    @Produces("application/json")
    Response loginUser(LoginData loginData);


    @POST
    @Path("/logout")
    @Consumes(MediaType.APPLICATION_JSON)
    Response logout(@QueryParam("id") String userId);


    @GET
    @Path("/test2")
    @Consumes("application/json")
    @Produces("application/json")
    Response test();

}
