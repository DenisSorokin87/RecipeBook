package Logic;

import beans.LoggedInUser;
import beans.User;
import beans.Creator;

public class LoginLogic {

    public LoggedInUser logIn(String userLoginName, String password) {

        for(User user : Creator.usersList) {
            if (user.getLoginName().equals(userLoginName) && user.getPassword().equals(password)) {
                return new LoggedInUser(user.getUserId(), user.getName());

            }
        }
        return new LoggedInUser();
    }

    public Boolean checkIfLoginNameExist(String loginName) {
        for (User user : Creator.usersList) {
            if (user.getLoginName().equals(loginName)) return true;
        }
        return false;
    }

}
