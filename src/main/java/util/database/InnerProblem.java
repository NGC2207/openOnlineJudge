package util.database;

import Database.Problem;

public class InnerProblem {
    private final int index;
    private final String question;
    private final int timeLimit;
    private final int memoryLimit;

    InnerProblem(Problem problem){
        this.index=problem.getIndex();
        this.question=problem.getQuestion();
        this.timeLimit=problem.getTimeLimit();
        this.memoryLimit=problem.getMemoryLimit();
    }

    public int getIndex() {
        return index;
    }

    public String getQuestion() {
        return question;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public int getMemoryLimit() {
        return memoryLimit;
    }

    @Override
    public String toString() {
        return "index: " + index + "\n" +
                "question: " + question + "\n" +
                "timeLimit: " + timeLimit + "\n" +
                "memoryLimit: " + memoryLimit + "\n";
    }
}
