package Logic;

import beans.CallResponse;
import beans.Recipe;
import beans.User;
import beans.Creator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserLogic {

    public String createUser(User user){
        for(User userElement : Creator.usersList){
            if(Objects.equals(userElement.getLoginName(), user.getLoginName())){
                return new CallResponse()
            }
        }
            user.setUserId(generateUserId());
            user.setRecipeList(new ArrayList<>());
            try {
                Creator.usersList.add(user);
            }catch (Exception e){
                return "Something Went Wrong";
            }

        return "User Created";
    }

    private int generateUserId() {
        int lastIndex = Creator.usersList.size()-1;
        int lastUserId = Creator.usersList.get(lastIndex).getUserId();
        return lastUserId + 1;

    }

    public List<Recipe> getMyRecipes(int userId){
        ArrayList<Recipe> myRecipes = new ArrayList<>();
        for(int recipeId : Creator.usersList.get(userId).getRecipeList()){
            for(Recipe recipe : Creator.recipesList){
                if (recipeId == recipe.getRecipeId()) myRecipes.add(recipe);
            }
        }
        return myRecipes;
    }

   public String addRecipeToUser(int userId, int recipeId){
        String recipeName = null;
       for(User user : Creator.usersList){
           if(user.getUserId() == userId){
               if(user.getRecipeList().contains(recipeId)){
                   return "The recipe is already exist";
               }else {
                   user.getRecipeList().add(recipeId);
                   for (Recipe recipe : Creator.recipesList) {
                       if (recipe.getRecipeId() == recipeId) {
                           recipeName = recipe.getDishName();
                           return "Recipe " + recipeName + " added to user " + user.getName();
                       }else return "recipe with " + recipeId + " was not found";
                   }
               }
           }
       }
       return "There was some problem with finding the user by ID";
   }


   public void removeRecipeFromUser(int userId, int recipeId){
        for(User user : Creator.usersList){
            if(user.getUserId() == userId){
                int recipeIndex = user.getRecipeList().indexOf(recipeId);
                user.getRecipeList().remove(recipeIndex);
            }
        }
   }

}


