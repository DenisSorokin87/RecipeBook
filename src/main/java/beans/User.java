package beans;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userId;
    private String name;
    private String lastName;
    private String loginName;
    private String password;
    private ArrayList<Integer> recipesIDs;

    public User() {
    }

    public User(String name, String lastName, String loginName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.loginName = loginName;
        this.password = password;
    }

    public User(int userId, String name, String lastName, String loginName, String password, ArrayList<Integer> recipeList) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.loginName = loginName;
        this.password = password;
        this.recipesIDs = recipeList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getRecipeList() {
        return recipesIDs;
    }

    public void setRecipeList(ArrayList<Integer> recipeList) {
        this.recipesIDs = recipeList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", recipesIDs=" + recipesIDs +
                '}';
    }
}
