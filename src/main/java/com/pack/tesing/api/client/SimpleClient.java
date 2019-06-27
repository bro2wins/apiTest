package com.pack.tesing.api.client;


import com.pack.tesing.api.model.LoginData;
import com.pack.tesing.api.model.Student;

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

    @Path("/student")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    Response saveStudentResponse(Student student);


    @Path("/users/{id}")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    Response getGitHubUserById(@PathParam("id") int id);
}
