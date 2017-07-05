/**
 * Created by user on 7/3/17.
 */
public class SimulationDriver {
    public static void main(String[] args){
        iVoteService iV = iVoteService.getInstance();
        iV.configurePromptAndType("Here is my Question","Single Choice Question");
        iV.addCandidateAnswer("Answer 1",false);
        iV.addCandidateAnswer("Answer 2",true);
        iV.addCandidateAnswer("Answer 3",false);
        iV.start();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        //student1.setAnswer();
        //iV.displayStatistics();
    }

}
