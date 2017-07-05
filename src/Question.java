import java.util.List;

public interface Question {
    public String getCorrectAnswer();

    public boolean addCandidateAnswer(String answer, boolean isCorrectAnswer);

    public List<Answer> getCandidateAnswers();

    public String getPrompt();
}
