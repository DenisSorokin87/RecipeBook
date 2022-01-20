import beans.Creator;
import beans.User;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
       Creator.getInstance().getUsersList();

        System.out.println( Creator.getInstance().getUsersList().toString());
    }

}
