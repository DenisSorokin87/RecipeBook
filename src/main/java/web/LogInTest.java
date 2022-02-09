package web;

import Response.GenericResponse;
import beans.User;
import beans.Creator;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/check")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LogInTest {

    private  Creator userCreator = Creator.getInstance();


    @GET
    public GenericResponse<User> getUsers() {

        return userCreator.getUsersList();
    }
//
//    @GET
//    @Path("/{id}")
//    public String pathFunc(@PathParam("id") int id, @QueryParam("name") String name) {
//        return id + ":" + name;
//    }
}
