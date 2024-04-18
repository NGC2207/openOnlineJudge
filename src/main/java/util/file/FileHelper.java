package util.file;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

public class FileHelper {

    public static Path getRootPath() {
        return Paths.get("").toAbsolutePath();
    }
}
