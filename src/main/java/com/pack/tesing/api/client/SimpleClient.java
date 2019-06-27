package com.pack.tesing.api.client;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface SimpleClient {

    @Path("/users/{id}")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response getGitHubUserById(@PathParam("id") int id);
}
