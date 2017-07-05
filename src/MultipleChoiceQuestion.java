import java.util.LinkedList;
import java.util.List;

public class MultipleChoiceQuestion implements Question {
    private String question;
    private List<Answer> answers;
    private int correctAnswer = -1;
    private char letter;

    public MultipleChoiceQuestion(String question){
        this.question = question;
        answers = new LinkedList<>();
        letter = 'A';
    }

    @Override
    public String getCorrectAnswer() {
        if(correctAnswer == -1){
            return "No Correct Answer was given.";
        }else{
            return answers.get(correctAnswer).toString();
        }
    }

    @Override
    public boolean addCandidateAnswer(String answer, boolean isCorrectAnswer) {
        String formattedAnswer = letter + ". " + answer;
        answers.add(new Answer(formattedAnswer, isCorrectAnswer));
        letter++;
        if(isCorrectAnswer){
            correctAnswer = answers.size() - 1;
        }
        return false;
    }

    @Override
    public List<Answer> getCandidateAnswers() {
        return answers;
    }

    @Override
    public String getPrompt() {
        return question;
    }

}