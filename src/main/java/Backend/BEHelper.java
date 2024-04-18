package Backend;

import util.database.DBHelper;
import util.database.InnerProblem;

import java.io.IOException;

public class BEHelper {

    public static InnerProblem getInnerProblem(int index) throws IOException {
        //TODO

        return DBHelper.getInnerProblem(index);
    }

}
