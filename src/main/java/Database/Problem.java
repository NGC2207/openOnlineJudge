package Database;

import javax.json.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class Problem {
    private final int index;
    private final String question;
    private final String[] givenParameter;
    private final String[] expectedAnswer;
    private final int timeLimit;
    private final int memoryLimit;

    public Problem(Path path) throws IOException {
        try (JsonReader reader = Json.createReader(Files.newInputStream(path))) {
            JsonObject jsonObject = reader.read().asJsonObject();
            this.index = jsonObject.getInt("index");
            this.question = jsonObject.getString("question");
            this.givenParameter = toArray(jsonObject.getJsonArray("givenParameter"));
            this.expectedAnswer = toArray(jsonObject.getJsonArray("expectedAnswer"));
            this.timeLimit = jsonObject.getInt("timeLimit");
            this.memoryLimit = jsonObject.getInt("memoryLimit");
        } catch (IOException e) {
            throw new IOException("Problem with reading JSON from " + path, e);
        }
    }

    private String[] toArray(JsonArray jsonArray) {
        return jsonArray.getValuesAs(JsonValue.class).stream()
                .map(JsonValue::toString)
                .toArray(String[]::new);
    }

    public int getIndex() {
        return index;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getGivenParameter() {
        return givenParameter;
    }

    public String[] getExpectedAnswer() {
        return expectedAnswer;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public int getMemoryLimit() {
        return memoryLimit;
    }
}
