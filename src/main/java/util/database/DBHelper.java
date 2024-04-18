package util.database;

import Database.Problem;
import util.file.FileHelper;

import java.io.IOException;
import java.nio.file.Path;

public class DBHelper {

    private static final Path problemPath = FileHelper.getRootPath().resolve("data").resolve("problem");

    public static InnerProblem getInnerProblem(int index) throws IOException {
        Path filePath=problemPath.resolve(index+".json");
        Problem problem=new Problem(filePath);
        return new InnerProblem(problem);
    }
}