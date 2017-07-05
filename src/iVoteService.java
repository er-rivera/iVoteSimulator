import java.util.*;

public class iVoteService {
    private Question question;
    private HashMap<String, String> userInputLog;
    private static iVoteService iVote = new iVoteService();

    private iVoteService(){

    }

    public void start(){
        displayQuestion();
    }

    public void displayStatistics(){

    }

    public void configurePromptAndType(String prompt, String type){
        if(type.equals("Multiple Choice Question")){
            question = new MultipleChoiceQuestion(prompt);
        }
        else if(type.equals("Single Choice Question")){
            question = new SingleChoiceQuestion(prompt);
        }
        else{
            System.out.println("Invalid Input");
        }
    }

    public void addCandidateAnswer(String candidateAnswer, boolean isCorrectAnswer){
       if(question == null){
           System.out.println("Prompt and type need to be configured first.");
       }
       else{
           question.addCandidateAnswer(candidateAnswer,isCorrectAnswer);
       }
    }

    public static iVoteService getInstance(){
        return iVote;
    }

    public void displayQuestion() {
        if (question == null) {
            System.out.println("Question not added");
            return;
        }
        List<Answer> listOfCandidateAnswers = question.getCandidateAnswers();
        System.out.println(question.getPrompt());
        System.out.println();
        for(Answer answer : listOfCandidateAnswers){
            System.out.println(answer.toString());
        }
    }
}
