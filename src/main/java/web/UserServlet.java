package web;


import Logic.UserLogic;
import beans.Recipe;
import beans.User;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserServlet {
    private UserLogic userLogic = new UserLogic();

    @GET
    @Path("/{userId}")
    public List<Recipe> getMyRecipes(@PathParam("userId") int userId){
        return userLogic.getMyRecipes(userId);
    }

    @POST
    public String addRecipeToUser(@QueryParam("userId") int userId, @QueryParam("recipeId") int recipeId) {
        return userLogic.addRecipeToUser(userId, recipeId);
    }

    @DELETE
    public void removeRecipeFromUser(@QueryParam("userId") int userId, @QueryParam("recipeId") int recipeId){
        userLogic.removeRecipeFromUser(userId, recipeId);
    }

    @POST
    @Path("/createUser")
    public String createNewUser(User user){
        return userLogic.createUser(user);
    }
}
