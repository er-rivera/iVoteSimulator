import java.util.LinkedList;
import java.util.List;

public class MultipleChoiceQuestion implements Question {
    private String question;
    private List<String> answers;
    private int correctAnswer;
    char letter;

    public MultipleChoiceQuestion(String question){
        this.question = question;
        answers = new LinkedList<>();
        letter = 'A';
    }

    @Override
    public void addAnswer(String s){
        answers.add(letter + ". " + s);
        letter++;
    }

    @Override
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }

    @Override
    public void setCorrectAnswer(Object correctAnswer) {
        this.correctAnswer = Character.getNumericValue((char)correctAnswer) - 65;
    }

    @Override
    public void displayQuestion() {
        System.out.println(question);
        System.out.println();
        for(String answer : answers){
            System.out.println(answer);
        }
    }
}