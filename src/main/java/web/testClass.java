package web;


import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class testClass {

    @POST
    public String logIn(String name) {
        return "This is a POST method " + name;
    }
}
