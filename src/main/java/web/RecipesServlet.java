package web;


import Logic.RecipesLogic;
import Response.GenericResponse;
import beans.Recipe;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/recipe")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RecipesServlet {

    private final RecipesLogic recipesLogic = new RecipesLogic();

    @GET
    public GenericResponse<Recipe> getAllRecipes(){
        return recipesLogic.getAllRecipes();
    }

    @GET
    @Path("/{type}")
    public List<Recipe> getRecipesByType(@PathParam("type") String recipeType){
        return recipesLogic.getRecipeByType(recipeType);
    }

    @GET
    @Path("/getByName")
    public List<Recipe> getRecipesByName(@QueryParam("name") String name){
        return recipesLogic.getRecipesByName(name);
    }

    @POST
    @Path("/createRecipe")
    public String createNewUser(Recipe recipe){
        return recipesLogic.createRecipe(recipe);
    }

}
