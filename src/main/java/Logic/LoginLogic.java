package Logic;

import beans.*;

public class LoginLogic {
    private final Creator creator = Creator.getInstance();
    public LogInResponse logIn(String userLoginName, String password){
        for(User user : creator.getUsersList()){
            if(user.getLoginName().equals(userLoginName) && user.getPassword().equals(password)){
                return new LogInResponse(new LoggedInUser(user.getUserId(), user.getName()+" "+user.getLastName()), ResponseStatus.SUCCESS.toString());
            }
        }
        return new LogInResponse("Login Faild, check Your Details", ResponseStatus.FAILED.toString());
    }

    public Boolean checkIfLoginNameExist(String loginName) {
        for (User user : Creator.usersList) {
            if (user.getLoginName().equals(loginName)) return true;
        }
        return false;
    }

}
