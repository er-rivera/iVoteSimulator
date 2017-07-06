import java.util.*;

public class iVoteService {
    private Question question;
    private Map<Character, Integer> userInputLog;
    private static iVoteService iVote = new iVoteService();
    private List<Answer> listOfCandidateAnswers;
    private int numOfStudents = 0;

    private iVoteService(){
        userInputLog = new HashMap<>();
    }

    public static iVoteService getInstance(){
        return iVote;
    }

    public void start(){
        listOfCandidateAnswers = question.getCandidateAnswers();
        displayQuestion();
        for(Answer answer: question.getCandidateAnswers())
            userInputLog.put(answer.toString().charAt(0),0); //gets first character of candidate answer
        System.out.println();
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

    public void addStudentResponse(Student s){
        if(userInputLog == null){
            System.out.println("Must call start method first.");
        }
        int value = userInputLog.get(s.getAnswer());
        userInputLog.put(s.getAnswer(),++value);
        numOfStudents++;

    }

    public Question getQuestion(){
        return  question;
    }

    public void displayQuestion() {
        if (question == null) {
            System.out.println("Question not added");
            return;
        }
        System.out.println(question.getPrompt());
        System.out.println();
        for(Answer answer : listOfCandidateAnswers){
            System.out.println(answer.toString());
        }
    }

    public void displayStatistics() {
        System.out.println("Number of Students: " + numOfStudents);
        for (Answer answer : listOfCandidateAnswers) {
            char curChar = answer.toString().charAt(0);
            System.out.println(curChar + ": " + userInputLog.get(curChar));
        }
        System.out.println();
        System.out.println("Correct Answer is: ");
        System.out.println(question.getCorrectAnswer());
    }
}
