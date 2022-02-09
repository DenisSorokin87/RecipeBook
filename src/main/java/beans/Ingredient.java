package beans;


public class Ingredient {

    private int ingredientId;
    private String  ingredient;
    private int ingredientAmount;
    private String ingredientAmountUnit;

    public Ingredient() {
    }

    public Ingredient(int ingredientId, String ingredient, int ingredientAmount, String ingredientAmountUnit) {
        this.ingredientId = ingredientId;
        this.ingredient = ingredient;
        this.ingredientAmount = ingredientAmount;
        this.ingredientAmountUnit = ingredientAmountUnit;
    }


    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public int getIngredientAmount() {
        return ingredientAmount;
    }

    public void setIngredientAmount(int ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }

    public String getIngredientAmountUnit() {
        return ingredientAmountUnit;
    }

    public void setIngredientAmountUnit(String ingredientAmountUnit) {
        this.ingredientAmountUnit = ingredientAmountUnit;
    }
}
