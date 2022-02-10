package Logic;

import Response.GenericResponse;
import beans.*;

import java.util.ArrayList;

public class LoginLogic {
    private final Creator creator = Creator.getInstance();
    public GenericResponse<LoggedInUser> logIn(String userLoginName, String password){
        for(User user : creator.getUsersList().getDataList()){
            if(user.getLoginName().equals(userLoginName) && user.getPassword().equals(password)){
                return new GenericResponse<LoggedInUser>(Status.SUCCESS.name(), "Login Made", createLoggedInUserArray(user));
            }
        }
        return new GenericResponse<>(Status.FAILED.name(), "LogIn Failed", null);
    }

    private ArrayList<LoggedInUser> createLoggedInUserArray(User user) {
        ArrayList<LoggedInUser> responseArray= new ArrayList<>();
        responseArray.add(new LoggedInUser(user.getUserId(), user.getName() + " " + user.getLastName()));
        return responseArray;
    }

    public Boolean checkIfLoginNameExist(String loginName) {
        for (User user : Creator.usersList) {
            if (user.getLoginName().equals(loginName)) return true;
        }
        return false;
    }

}
