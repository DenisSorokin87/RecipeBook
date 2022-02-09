package Logic;

import Response.GenericResponse;
import beans.Recipe;
import beans.Creator;
import beans.Status;

import java.util.ArrayList;
import java.util.List;

public class RecipesLogic {
    Creator creator = Creator.getInstance();

    public List<Recipe> getRecipeByType(String type){
        ArrayList<Recipe> recipes = new ArrayList<>();
       for(Recipe recipe : Creator.recipesList){
           if(recipe.getType().equals(type)) recipes.add(recipe);
       }
        return recipes;
    }

    public List<Recipe> getRecipesByName(String name){
        ArrayList<Recipe> recipes = new ArrayList<>();
        for(Recipe recipe : Creator.recipesList){
            if(recipe.getDishName().contains(name)) recipes.add(recipe);
        }
        return recipes;
    }

    public String createRecipe(Recipe recipe) {
        recipe.setRecipeId(generateRecipeId());
        Creator.recipesList.add(recipe);
        return "Recipe was created";
    }

    private int generateRecipeId() {
        int lastIndex = Creator.recipesList.size()-1;
        int lastRecipeId = Creator.recipesList.get(lastIndex).getRecipeId();
        return lastRecipeId + 1;
    }

    public GenericResponse<Recipe> getAllRecipes() {
        return new GenericResponse<Recipe>(Status.SUCCESS.name(), "All Recipe List", Creator.recipesList);
    }
}
