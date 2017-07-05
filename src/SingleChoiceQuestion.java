import java.util.LinkedList;
import java.util.List;

public class SingleChoiceQuestion implements Question {
    private List<Answer> answers;
    private String question;
    private int correctAnswer;

    public SingleChoiceQuestion(String question){
        this.question = question;
        answers = new LinkedList();
    }

    @Override
    public boolean addCandidateAnswer(String answer, boolean isCorrectAnswer) {
        if(answers.size() <= 1){
            String formattedAnswer = (answers.size() + 1) + ". " + answer;
            answers.add(new Answer(formattedAnswer, isCorrectAnswer));
            if(isCorrectAnswer)
                correctAnswer = answers.size() - 1;
        }else{
            System.out.println("This is a single choice question, No more than two candidate answers can be added.");
            return true;
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

    @Override
    public String getCorrectAnswer() {
        return answers.get(correctAnswer).toString();
    }

}
