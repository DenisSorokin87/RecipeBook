package beans;

import java.util.List;

public class Recipe {
    private int recipeId;
    private String type;
    private String description;
    private String dishName;
    private List<Products> productsList;
    private String dishPhotoUrl;

    public Recipe(){}

    public Recipe(int id, String type, String description, String dishName, List<Products> productsList, String dishPhotoUrl) {
        this.recipeId = id;
        this.type = type;
        this.description = description;
        this.dishName = dishName;
        this.productsList = productsList;
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

    public List<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Products> productsList) {
        this.productsList = productsList;
    }

    public String getDishPhotoUrl() {
        return dishPhotoUrl;
    }

    public void setDishPhotoUrl(String dishPhotoUrl) {
        this.dishPhotoUrl = dishPhotoUrl;
    }
}
