package web;


import Logic.LoginLogic;
import beans.LoggedInUser;
import beans.User;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/login")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LogInServlet {
    private final LoginLogic logIn = new LoginLogic();


    @GET
    public LoggedInUser logIn(@QueryParam("loginName") String logInName, @QueryParam("password") String password){

        return logIn.logIn(logInName, password);
    }

    @GET
    @Path("/checkIfExist")
    public String checkIfUserExist(@QueryParam("loginName") String loginName){
        try {
            if (logIn.checkIfLoginNameExist(loginName)) return "true";
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "false";
    }

}
