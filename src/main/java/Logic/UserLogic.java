package Logic;

import beans.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserLogic {

    private final Creator creator = Creator.getInstance();

    public CallResponse createUser(User user){
        for(User userElement : creator.usersList){
            if(Objects.equals(userElement.getLoginName(), user.getLoginName())){
                return new CallResponse(ResponseStatus.SUCCESS.toString(), "Login Name Already Exist");
            }
        }
            user.setUserId(generateUserId());
//            user.setRecipeList(new ArrayList<>());
            try {
                creator.usersList.add(user);
            }catch (Exception e){
                return new CallResponse(ResponseStatus.FAILED.toString(), e.getMessage() + " \n" + e.getCause());
            }

        return new CallResponse(ResponseStatus.SUCCESS.toString(), "User Created");
    }

    private int generateUserId() {
        int lastIndex = creator.usersList.size()-1;
        int lastUserId = creator.usersList.get(lastIndex).getUserId();
        return lastUserId + 1;

    }

    public List<Recipe> getMyRecipes(int userId){
        ArrayList<Recipe> myRecipes = new ArrayList<>();
        for(int recipeId : creator.usersList.get(userId).getRecipeList()){
            for(Recipe recipe : creator.recipesList){
                if (recipeId == recipe.getRecipeId()) myRecipes.add(recipe);
            }
        }
        return myRecipes;
    }

   public String addRecipeToUser(int userId, int recipeId){
        String recipeName = null;
       for(User user : creator.usersList){
           if(user.getUserId() == userId){
               if(user.getRecipeList().contains(recipeId)){
                   return "The recipe is already exist";
               }else {
                   user.getRecipeList().add(recipeId);
                   for (Recipe recipe : creator.recipesList) {
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
        for(User user : creator.usersList){
            if(user.getUserId() == userId){
                int recipeIndex = user.getRecipeList().indexOf(recipeId);
                user.getRecipeList().remove(recipeIndex);
            }
        }
   }

}


