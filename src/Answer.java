public class Answer {
    private final boolean isCorrectAnswer;
    private String answer;
    private int index;

    public Answer(String answer, boolean isCorrectAnswer){
        this.answer = answer;
        this.isCorrectAnswer = isCorrectAnswer;
    }

    @Override
    public String toString() {
        return answer;
    }
}
