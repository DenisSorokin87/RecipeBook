package beans;

import java.util.ArrayList;
import java.util.List;

public class Creator {
    private static Creator creator = null;
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Recipe> recipesList = new ArrayList<>();


    public static Creator getInstance(){
        if (creator == null) {

            return  creator = new Creator();

        }

        return creator;
    }

    private Creator() {
        //Creating Users
        usersList.add(new User(0, "Denis", "Sorokin", "DeniSorokin", "12345", new ArrayList<Integer>()));
        usersList.add(new User(usersList.size(), "Yulia", "Sorokin", "YuliaSorokin", "54321",new ArrayList<Integer>()));
        //Creating Users

        //Creating Recipes
        recipesList.add(new Recipe(0, "Bakery", "Take 100g of wheat, 100ml of water and add each to other and bla bla bla...",
                "Meat Cake", new ArrayList<Products>(), "photo url"));
        recipesList.add(new Recipe(recipesList.size(), "Soup",
                "Take a chicken, put it in to water with a onion and carrot, bake for 1hour", "Chicken soup", new ArrayList<Products>(), "photo url"));
        recipesList.add(new Recipe(recipesList.size(), "Bakery",
                "Take tow pieces of bread, cheese and ham, make a sandwich and put it in to a toast for 5 minutes",
                "Cheese and Ham Toast", new ArrayList<Products>(), "photo url"));
        recipesList.add(new Recipe(recipesList.size(), "Soup",
                "We need to take a 1 kg meat, make some marinader, and leave it for one day at the fridge, after it we will make it ont the grill",
                "Shashlik", new ArrayList<Products>(), "photo url"));
        //Creating Recipes


        //Creating Products Lists for recipes and adding them to the Recipes
        recipesList.get(0).getProductsList().add(new Products(0, "wheat- 100g"));
        recipesList.get(0).getProductsList().add(new Products(recipesList.get(0).getProductsList().size(), "meat - 200g"));
        recipesList.get(0).getProductsList().add(new Products(recipesList.get(0).getProductsList().size(), "water- 100ml"));

        recipesList.get(1).getProductsList().add(new Products(0, "Chicken - 1"));
        recipesList.get(1).getProductsList().add(new Products(recipesList.get(1).getProductsList().size(), "Onion - 1"));
        recipesList.get(1).getProductsList().add(new Products(recipesList.get(1).getProductsList().size(), "Carrot - 2"));
        recipesList.get(1).getProductsList().add(new Products(recipesList.get(1).getProductsList().size(), "Carrot - 2"));

        recipesList.get(2).getProductsList().add(new Products(0, "Bread - 2 pieces"));
        recipesList.get(2).getProductsList().add(new Products(recipesList.get(2).getProductsList().size(), "Cheese - 2 pieces"));
        recipesList.get(2).getProductsList().add(new Products(recipesList.get(2).getProductsList().size(), "Ham - 1 piece"));

        recipesList.get(3).getProductsList().add(new Products(0, "Meat - 1kg"));
        recipesList.get(3).getProductsList().add(new Products(recipesList.get(3).getProductsList().size(), "Onion - 1"));
        recipesList.get(3).getProductsList().add(new Products(recipesList.get(3).getProductsList().size(), "Soy Souse"));
        recipesList.get(3).getProductsList().add(new Products(recipesList.get(3).getProductsList().size(), "Chili souse"));
        //Creating Products Lists for recipes and adding them to the Recipes

        //Adding the created recipes id's to the users
        usersList.get(0).getRecipeList().add(recipesList.get(0).getRecipeId());
        usersList.get(0).getRecipeList().add(recipesList.get(1).getRecipeId());
        usersList.get(1).getRecipeList().add(recipesList.get(2).getRecipeId());
        usersList.get(1).getRecipeList().add(recipesList.get(3).getRecipeId());
        //Adding the created recipes id's to the users

    }

    public ArrayList<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(ArrayList<User> usersList) {
        Creator.usersList = usersList;
    }

    public static ArrayList<Recipe> getRecipesList() {
        return recipesList;
    }

    public static void setRecipesList(ArrayList<Recipe> recipesList) {
        Creator.recipesList = recipesList;
    }
}
