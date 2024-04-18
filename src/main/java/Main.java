import util.database.DBHelper;
import util.database.InnerProblem;

import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        InnerProblem innerProblem= null;
        try {
            innerProblem = DBHelper.getInnerProblem(9);
        } catch (IOException e) {
            System.out.println("expection");
        }
        //System.out.println(innerProblem.toString());
    }
}
