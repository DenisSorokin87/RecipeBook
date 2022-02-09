package beans;

import java.util.List;

public class Recipe {
    private int recipeId;
    private String type;
    private String description;
    private String dishName;
    private List<Ingredient> productsList;
    private List<CookingProcess> cookingProcessList;
    private String dishPhotoUrl;

    public Recipe(){}

    public Recipe(int recipeId, String type, String description, String dishName, List<Ingredient> productsList, List<CookingProcess> cookingProcessList, String dishPhotoUrl) {
        this.recipeId = recipeId;
        this.type = type;
        this.description = description;
        this.dishName = dishName;
        this.productsList = productsList;
        this.cookingProcessList = cookingProcessList;
        this.dishPhotoUrl = dishPhotoUrl;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public List<Ingredient> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Ingredient> productsList) {
        this.productsList = productsList;
    }

    public List<CookingProcess> getCookingProcessList() {
        return cookingProcessList;
    }

    public void setCookingProcessList(List<CookingProcess> cookingProcessList) {
        this.cookingProcessList = cookingProcessList;
    }

    public String getDishPhotoUrl() {
        return dishPhotoUrl;
    }

    public void setDishPhotoUrl(String dishPhotoUrl) {
        this.dishPhotoUrl = dishPhotoUrl;
    }
}
