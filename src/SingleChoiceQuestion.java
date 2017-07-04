import java.util.LinkedList;
import java.util.List;

public class SingleChoiceQuestion implements Question {
    private List<String> answers;
    private String question;
    private int correctAnswer;

    public SingleChoiceQuestion(String question){
        this.question = question;
        answers = new LinkedList();
    }

    @Override
    public void addAnswer(String answer) {
        if(answers.size() < 2){
            answers.add((answers.size() + 1) + ". " + answer);
        }else{
            System.out.println("This is a single choice question, No more questions can be added.");
        }
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        System.out.println();
        for(String answer : answers){
            System.out.println(answer);
        }
    }

    @Override
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }

    @Override
    public void setCorrectAnswer(Object correctAnswer) {
        this.correctAnswer = (int)correctAnswer - 1;
    }
}
