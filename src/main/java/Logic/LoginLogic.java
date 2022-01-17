package Logic;

import beans.User;
import beans.Creator;

public class LoginLogic {

    public Boolean logIn(String userLoginName, String password) {

        for(User user : Creator.usersList) {
            if (user.getLoginName().equals(userLoginName) && user.getPassword().equals(password)) return true;
        }
        return false;
    }

    public Boolean checkIfLoginNameExist(String loginName) {
        for (User user : Creator.usersList) {
            if (user.getLoginName().equals(loginName)) return true;
        }
        return false;
    }

}
