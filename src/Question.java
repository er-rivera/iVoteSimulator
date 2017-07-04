/**
 * Created by user on 7/3/17.
 */
public interface Question {
    public String getCorrectAnswer();

    public void setCorrectAnswer(Object correctAnswer);

    public void addAnswer(String answer);

    public void displayQuestion();
}
