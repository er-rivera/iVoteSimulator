import java.util.Random;

public class SimulationDriver {
    public static void main(String[] args){
        iVoteService iV = iVoteService.getInstance();
        iV.configurePromptAndType("What is the capital of California?","Multiple Choice Question");
        iV.addCandidateAnswer("San Diego",false);
        iV.addCandidateAnswer("San Jose",true);
        iV.addCandidateAnswer("Sacremento",false);
        iV.addCandidateAnswer("Eureka",false);
        iV.start();
        Random ran = new Random();
        int numOfStudents = ran.nextInt(20) + 1;
        int numOfCandidateAnswers = iV.getQuestion().getCandidateAnswers().size();
        for(int i = 0; i < numOfStudents; i++){ //randomizes between 1 - 20 students
            Student student = new Student();
            student.setAnswer(randomizeAnswer(numOfCandidateAnswers));
            iV.addStudentResponse(student);
        }

        iV.displayStatistics();
    }

    //randomizes answer for student
    public static char randomizeAnswer(int size){
        int valOfA = 65;
        Random random = new Random();
        int index = random.nextInt(size) + valOfA;
        return (char)index;
    }

}
